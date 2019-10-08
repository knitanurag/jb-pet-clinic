package com.anurag.boot.jbpetclinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.anurag.boot.jbpetclinic"})
public class JbPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbPetClinicApplication.class, args);
		//DataLoader.
	}

}
