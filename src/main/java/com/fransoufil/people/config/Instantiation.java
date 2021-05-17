package com.fransoufil.people.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.domain.enums.PeopleStatus;
import com.fransoufil.people.domain.resources.Adress;
import com.fransoufil.people.domain.resources.Phone;
import com.fransoufil.people.domain.resources.enums.AdressType;
import com.fransoufil.people.repositories.PeopleRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private PeopleRepository peopleRepository;

	@Override
	public void run(String... args) throws Exception {
		
		peopleRepository.deleteAll();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		People francisco = new People(
				null,
				PeopleStatus.ACTIVE,
				"Francisco",
				"Souza", 
				sdf.parse("23/08/1968"),
				new Adress(AdressType.PHYSICAL, "08080-000", "São Paulo", "Santo André", "Rua Central", 350, "Apt 6", "Vila Pires"),
				Arrays.asList(new Phone("1111-7777"), new Phone("7777-1111")));
		
		People carol = new People(
				null,
				PeopleStatus.INACTIVE,
				"Carol",
				"Cristine", 
				sdf.parse("23/07/1996"),
				new Adress(AdressType.PHYSICAL, "07070-000", "Paraná", "Curitiba", "Rua Principal", 88, "Apt 111", "Centro"),
				Arrays.asList(new Phone("2222-8888"), new Phone("8888-2222"), new Phone("8822-2288")));
		
		People ana = new People(
				null,
				PeopleStatus.ACTIVE,
				"Ana",
				"Clara", 
				sdf.parse("02/08/2009"),
				new Adress(AdressType.DELIVERY, "08080-000", "São Paulo", "Santo André", "Rua Central", 350, "Apt 6", "Vila Pires"),
				Arrays.asList(new Phone("3333-6666")));
		
		peopleRepository.saveAll(Arrays.asList(francisco, carol, ana));
		
	}

}
