package com.fransoufil.people.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.dto.PeopleDTO;
import com.fransoufil.people.repositories.PeopleRepository;
import com.fransoufil.people.services.exceptions.ObjectNotFoundException;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	public List<People> findAll(){
		return peopleRepository.findAll();
	}
	
	public People findById(String id) {
		Optional<People> obj = peopleRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("People with Id: " + id + " not found!"));
	}
	
	@Transactional
	public People insert(People obj) {
		return peopleRepository.insert(obj);
	}
	
	public void delete(String id ) {
		findById(id);
		peopleRepository.deleteById(id);
	}
	
	public People update(People obj) {
		Optional<People> optionalObj = peopleRepository.findById(obj.getId());
		People newObj = optionalObj.get();
		updateData(newObj, obj);
		return peopleRepository.save(newObj);
	}
	
	private void updateData(People newObj, People obj) {
		newObj.setStatus(obj.getStatus());
		newObj.setGivenName(obj.getGivenName());
		newObj.setFamilyName(obj.getFamilyName());
		newObj.setBirthDate(obj.getBirthDate());
		newObj.setAdress(obj.getAdress());
		newObj.setPhone(obj.getPhone());
	}
	
	public People fromDTO(PeopleDTO objDto) {
		return new People(
				objDto.getId(), 
				objDto.getStatus(), 
				objDto.getGivenName(),
				objDto.getFamilyName(), 
				objDto.getBirthDate(), 
				objDto.getAdress(), 
				objDto.getPhones());
	}
	
	public List<People> findByGivenName(String givenname){
		return peopleRepository.findByGivenNameContainingIgnoreCase(givenname);
	}
	
	public List<People> findByFamilyName(String familyname){
		return peopleRepository.findByFamilyNameContainingIgnoreCase(familyname);
	}
	
}
