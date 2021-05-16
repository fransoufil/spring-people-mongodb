package com.fransoufil.people.domain;

import java.io.Serializable;

public class Adress implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String idPeople;
	private String type;
	private String zipcode;
	private String state;
	private String city;
	private String street;
	private int number;
	private String complement;
	private String district;
	
	public Adress() {
	}
	
	public Adress(String idPeople, String type, String zipcode, String state, String city, String street, int number,
			String complement, String district) {
		super();
		this.idPeople = idPeople;
		this.type = type;
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
	}

	public String getIdPeople() {
		return idPeople;
	}

	public void setIdPeople(String idPeople) {
		this.idPeople = idPeople;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPeople == null) ? 0 : idPeople.hashCode());
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
		Adress other = (Adress) obj;
		if (idPeople == null) {
			if (other.idPeople != null)
				return false;
		} else if (!idPeople.equals(other.idPeople))
			return false;
		return true;
	}
}
