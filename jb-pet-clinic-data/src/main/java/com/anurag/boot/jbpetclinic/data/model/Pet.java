package com.anurag.boot.jbpetclinic.data.model;

import java.time.LocalDate;

public class Pet {
	
	private Owner owner;
	private LocalDate birthDate;
	private PetType petType;

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	
}
