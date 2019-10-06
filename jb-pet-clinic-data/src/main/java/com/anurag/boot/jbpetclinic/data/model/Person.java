package com.anurag.boot.jbpetclinic.data.model;

public class Person extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2977219033530137437L;
	private String firstrname;
	private String lastName;

	public String getFirstrname() {
		return firstrname;
	}

	public void setFirstrname(String firstrname) {
		this.firstrname = firstrname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
