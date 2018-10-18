package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.model.Person;
import com.howtodoinjava.demo.repository.PersonRepository;


@Service
public class PersonService {

	@Autowired
	PersonRepository repo;

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		repo.findAll().forEach(persons::add);
		return persons;

	}

	public int addPerson(Person person) {
		repo.save(person);

		return 0;
	}

	public Person findOne(int id) {
		return repo.findOne(id);

	}

	public Person UpdateOne(Person person, int id) {
		return repo.save(person);
	}

	
}