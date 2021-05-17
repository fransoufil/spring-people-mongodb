package com.fransoufil.people.domain.enums;

public enum PeopleStatus {
	
	ACTIVE (1, "ACTIVE"),
	INACTIVE (2, "INACTIVE");
	
	private int cod;
	private String descricao;
	
	private PeopleStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static PeopleStatus toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (PeopleStatus x : PeopleStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("PeopleType Id not found: " + cod);
	}

}
