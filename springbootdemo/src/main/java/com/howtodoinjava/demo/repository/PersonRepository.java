package com.howtodoinjava.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
