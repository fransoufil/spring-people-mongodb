package com.fransoufil.people.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.domain.enums.PeopleStatus;
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
	
	public People insert(People obj) {
		return peopleRepository.insert(obj);
	}
	
	public void delete(String id ) {
		findById(id);
		peopleRepository.deleteById(id);
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
}
