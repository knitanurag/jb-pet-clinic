package com.anurag.boot.jbpetclinic.data.service;

import java.util.Set;

import com.anurag.boot.jbpetclinic.data.model.Owner;

public interface OwnerService {
	Owner fidByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	
}
