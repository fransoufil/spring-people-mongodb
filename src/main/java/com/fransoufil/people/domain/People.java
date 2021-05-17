package com.fransoufil.people.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fransoufil.people.domain.enums.PeopleStatus;
import com.fransoufil.people.domain.resources.Adress;
import com.fransoufil.people.domain.resources.Phone;

@Document(collection = "people")
public class People implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Integer status;
	private String givenName;
	private String familyName;
	private Date birthDate;
	private Adress adress;
	private List<Phone> phones;
	
	public People() {
	}

	public People(String id, PeopleStatus status, String givenName, String familyName, Date birthDate, Adress adress,
			List<Phone> phones) {
		super();
		this.id = id;
		this.status = status.getCod();
		this.givenName = givenName;
		this.familyName = familyName;
		this.birthDate = birthDate;
		this.adress = adress;
		this.setPhone(phones);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public PeopleStatus getStatus() {
		return PeopleStatus.toEnum(status);
	}

	public void setStatus(PeopleStatus status) {
		this.status = status.getCod();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<Phone> getPhone() {
		return phones;
	}

	public void setPhone(List<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
