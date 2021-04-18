package com.holler.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.holler.dojoninja.models.Dojo;
import com.holler.dojoninja.models.Ninja;
import com.holler.dojoninja.repos.DojoRepo;

@Service
public class DojoService{
	private final DojoRepo dojoRepo;
 
 public DojoService(DojoRepo dojoRepo) {
     this.dojoRepo = dojoRepo;
 }
 // returns all the Dojos
 public List<Dojo> allDojos() {
     return dojoRepo.findAll();
 }
 // creates a Dojo
 public Dojo createDojo(Dojo dojo) {
     return dojoRepo.save(dojo);
 }
 // retrieves a Dojo
 public Dojo findDojo(Long id) {
     Optional<Dojo> optionalDojo = dojoRepo.findById(id);
     if(optionalDojo.isPresent()) {
         return optionalDojo.get();
     } else {
         return null;
     }
 }

 
}




