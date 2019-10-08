package com.anurag.boot.jbpetclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.anurag.boot.jbpetclinic.data.model.Vet;
import com.anurag.boot.jbpetclinic.data.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}


	@Override
	public Vet save(Vet vet) {
		super.save(vet.getId(), vet);
		return vet;
	}

	@Override
	public void delete(Vet Object) {
		super.delete(Object);
		
	}

}
