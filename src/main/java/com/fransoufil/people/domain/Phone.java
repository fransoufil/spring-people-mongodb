package com.fransoufil.people.domain;

import java.io.Serializable;

public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String idPeople;
	private String number;
	
	public Phone() {
	}
	
	public Phone(String number) {
	}

	public Phone(String idPeople, String number) {
		super();
		this.idPeople = idPeople;
		this.number = number;
	}

	public String getIdPeople() {
		return idPeople;
	}

	public void setIdPeople(String idPeople) {
		this.idPeople = idPeople;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
		Phone other = (Phone) obj;
		if (idPeople == null) {
			if (other.idPeople != null)
				return false;
		} else if (!idPeople.equals(other.idPeople))
			return false;
		return true;
	}
}
