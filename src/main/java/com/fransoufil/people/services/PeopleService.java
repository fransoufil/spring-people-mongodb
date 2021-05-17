package com.fransoufil.people.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.repositories.PeopleRepository;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	public List<People> findAll(){
		return peopleRepository.findAll();
	}

}
