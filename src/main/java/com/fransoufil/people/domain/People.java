package com.fransoufil.people.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class People implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String Status;
	private String givenName;
	private String familyName;
	private Date birthDate;
	private Adress adress;
	private List<Phone> phone;
	
	public People() {
	}

	public People(String id, String status, String givenName, String familyName, Date birthDate, Adress adress,
			List<Phone> phone) {
		super();
		this.id = id;
		Status = status;
		this.givenName = givenName;
		this.familyName = familyName;
		this.birthDate = birthDate;
		this.adress = adress;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
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
		return phone;
	}

	public void setPhones(List<Phone> phones) {
		this.phone = phones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
