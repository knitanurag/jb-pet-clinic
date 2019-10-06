package com.anurag.boot.jbpetclinic.data.model;

public class PetType extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 959051129484580655L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
