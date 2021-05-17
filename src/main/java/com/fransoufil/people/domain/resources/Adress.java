package com.fransoufil.people.domain.resources;

import java.io.Serializable;
import com.fransoufil.people.domain.resources.enums.AdressType;

public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer type;
	private String zipcode;
	private String state;
	private String city;
	private String street;
	private int number;
	private String complement;
	private String district;
	
	public Adress() {
	}
	
	public Adress(AdressType type, String zipcode, String state, String city, String street, int number,
			String complement, String district) {
		super();
		this.type = type.getCod();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
	}

	public AdressType getType() {
		return AdressType.toEnum(type);
	}

	public void setType(AdressType type) {
		this.type = type.getCod();
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
	
}
