package com.fransoufil.people.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fransoufil.people.domain.Adress;
import com.fransoufil.people.domain.People;
import com.fransoufil.people.domain.Phone;

@RestController
@RequestMapping(value = "/people")
public class PeopleResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<People>> findAll() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		People francisco = new People(
				"1",
				"ACTIVE",
				"Francisco",
				"Souza", 
				sdf.parse("23/08/1968"),
				new Adress("1", "PHYSICAL", "08080-000", "São Paulo", "Santo André", "Rua Central", 350, "Apt 6", "Vila Pires"),
				Arrays.asList(new Phone("1", "7777-7777")));
		
		People carol = new People(
				"2",
				"INACTIVE",
				"Carol",
				"Cristine", 
				sdf.parse("23/07/1996"),
				new Adress("2", "PHYSICAL", "07070-000", "Paraná", "Curitiba", "Rua Principal", 88, "Apt 111", "Centro"),
				Arrays.asList(new Phone("2", "8888-8888")));
		
		People ana = new People(
				"3",
				"ACTIVE",
				"Ana",
				"Clara", 
				sdf.parse("02/08/2009"),
				new Adress("1", "PHYSICAL", "08080-000", "São Paulo", "Santo André", "Rua Central", 350, "Apt 6", "Vila Pires"),
				Arrays.asList(new Phone("3", "6666-6666")));
		
		List<People> list = new ArrayList<>();
		list.addAll(Arrays.asList(francisco, carol, ana));
		return ResponseEntity.ok().body(list);
	}

}
