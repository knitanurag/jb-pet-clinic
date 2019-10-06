package com.anurag.boot.jbpetclinic.data.service;

import com.anurag.boot.jbpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner fidByLastName(String lastName);
}
