package com.anurag.boot.jbpetclinic.data.service.map;

import java.util.Set;

import com.anurag.boot.jbpetclinic.data.model.Owner;
import com.anurag.boot.jbpetclinic.data.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

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

}
