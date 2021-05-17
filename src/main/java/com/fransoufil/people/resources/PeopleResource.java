package com.fransoufil.people.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.services.PeopleService;

@RestController
@RequestMapping(value = "/people")
public class PeopleResource {
	
	@Autowired
	private PeopleService peopleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<People>> findAll() throws Exception {
		List<People> list = peopleService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
