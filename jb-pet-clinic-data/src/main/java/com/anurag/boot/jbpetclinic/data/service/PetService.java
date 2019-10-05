package com.anurag.boot.jbpetclinic.data.service;

import java.util.Set;

import com.anurag.boot.jbpetclinic.data.model.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
