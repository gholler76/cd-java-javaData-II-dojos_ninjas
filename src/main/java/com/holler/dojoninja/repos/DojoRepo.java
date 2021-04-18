package com.holler.dojoninja.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.holler.dojoninja.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{

//...
 // this method retrieves all the Dojos from the database
List<Dojo> findAll();
 // this method finds Dojos with descriptions containing the search string
Optional<Dojo> findById(Long Id);



}

