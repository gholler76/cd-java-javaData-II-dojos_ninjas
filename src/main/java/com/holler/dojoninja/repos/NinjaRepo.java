package com.holler.dojoninja.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.holler.dojoninja.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{

//...
 // this method retrieves all the Ninjas from the database
 List<Ninja> findAll();

 Optional<Ninja> findById(Long Id);
 
}