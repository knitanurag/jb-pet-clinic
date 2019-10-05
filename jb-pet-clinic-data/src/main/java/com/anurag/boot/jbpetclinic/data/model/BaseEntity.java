package com.anurag.boot.jbpetclinic.data.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -997189842595766805L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
