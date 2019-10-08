package com.anurag.boot.jbpetclinic.web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anurag.boot.jbpetclinic.data.model.Owner;
import com.anurag.boot.jbpetclinic.data.model.Vet;
import com.anurag.boot.jbpetclinic.data.service.OwnerService;
import com.anurag.boot.jbpetclinic.data.service.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1l);
		owner1.setLastName("Michael");
		owner1.setFirstrname("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2l);
		owner2.setLastName("Fiaona");
		owner2.setFirstrname("Glennane");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners.....");
		
		Vet vet1 = new Vet();
		vet1.setId(1l);
		vet1.setFirstrname("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2l);
		vet2.setFirstrname("Jesse");
		vet2.setLastName("Porter");
		
		vetService.save(vet2);
	}

}
