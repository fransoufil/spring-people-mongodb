package com.fransoufil.people.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.dto.PeopleDTO;
import com.fransoufil.people.services.PeopleService;

@RestController
@RequestMapping(value = "/people")
public class PeopleResource {
	
	@Autowired
	private PeopleService peopleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PeopleDTO>> findAll() throws Exception {
		List<People> list = peopleService.findAll();
		List<PeopleDTO> listDto = list.stream().map(x -> new PeopleDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PeopleDTO> findById(@PathVariable String id) throws Exception {
		People obj = peopleService.findById(id);
		return ResponseEntity.ok().body(new PeopleDTO(obj));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody PeopleDTO objDto) throws Exception {
		People obj = peopleService.fromDTO(objDto);
		obj = peopleService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id) throws Exception {
		peopleService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody PeopleDTO objDto, @PathVariable String id) throws Exception {
		People obj = peopleService.fromDTO(objDto);
		obj.setId(id);
		obj = peopleService.update(obj);
		return ResponseEntity.noContent().build();
	}
}
