package com.fransoufil.people.domain.resources.enums;

public enum AdressType {
	
	PHYSICAL (1, "PHYSICAL"),
	DELIVERY (2, "DELIVERY");
	
	private int cod;
	private String descricao;
	
	private AdressType(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static AdressType toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (AdressType x : AdressType.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("AdressType Id not found: " + cod);
	}

}
