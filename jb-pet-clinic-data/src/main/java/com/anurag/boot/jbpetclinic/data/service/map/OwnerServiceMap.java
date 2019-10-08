package com.anurag.boot.jbpetclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.anurag.boot.jbpetclinic.data.model.Owner;
import com.anurag.boot.jbpetclinic.data.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner Object) {
		return super.save(Object.getId(), Object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Owner Object) {
		super.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner fidByLastName(String lastName) {
		return null;
	}

}
