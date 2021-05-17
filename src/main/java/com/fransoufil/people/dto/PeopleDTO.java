package com.fransoufil.people.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fransoufil.people.domain.People;
import com.fransoufil.people.domain.enums.PeopleStatus;
import com.fransoufil.people.domain.resources.Adress;
import com.fransoufil.people.domain.resources.Phone;

public class PeopleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private PeopleStatus status;
	private String givenName;
	private String familyName;
	private Date birthDate;
	private Adress adress;
	private List<Phone> phones;
	
	public PeopleDTO() {
		
	}
	
	public PeopleDTO (People obj) {
		id = obj.getId();
		status = obj.getStatus();
		givenName = obj.getGivenName();
		familyName = obj.getFamilyName();
		birthDate = obj.getBirthDate();
		adress = obj.getAdress();
		phones = obj.getPhone();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PeopleStatus getStatus() {
		return status;
	}

	public void setStatus(PeopleStatus status) {
		this.status = status;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	
	
}
