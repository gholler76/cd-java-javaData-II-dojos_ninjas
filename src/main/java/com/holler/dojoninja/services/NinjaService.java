package com.holler.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.holler.dojoninja.models.Dojo;
import com.holler.dojoninja.models.Ninja;
import com.holler.dojoninja.repos.NinjaRepo;

@Service
public class NinjaService{
	private final NinjaRepo ninjaRepo;
 
 public NinjaService(NinjaRepo ninjaRepo) {
     this.ninjaRepo = ninjaRepo;
 }
 // returns all the ninjas
 public List<Ninja> allNinjas() {
     return ninjaRepo.findAll();
 }
 // creates a ninja
 public Ninja createNinja(Ninja ninja) {
     return ninjaRepo.save(ninja);
 }
 // retrieves a ninja
 public Ninja findNinja(Long id) {
     Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
     if(optionalNinja.isPresent()) {
         return optionalNinja.get();
     } else {
         return null;
     }
 }
 
}




