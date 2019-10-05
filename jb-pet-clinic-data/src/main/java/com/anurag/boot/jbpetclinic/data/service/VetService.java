package com.anurag.boot.jbpetclinic.data.service;

import java.util.Set;

import com.anurag.boot.jbpetclinic.data.model.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
