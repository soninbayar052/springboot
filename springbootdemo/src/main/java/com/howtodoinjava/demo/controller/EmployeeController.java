package com.howtodoinjava.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Person;
import com.howtodoinjava.demo.service.PersonService;



@RestController
public class EmployeeController {

	@Autowired
	PersonService service;

	@RequestMapping(method = RequestMethod.GET, value = "/persons")
	public List<Person> getAll() {
		return service.findAll();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/persons/{id}")
	public Person getOne(@PathVariable int id) {
		return service.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/persons")
	public int addOne(@RequestBody Person person) {
		return service.addPerson(person);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
	public Person deleteOne(@RequestBody Person person, @PathVariable int id) {
		return service.UpdateOne(person, id);
	}


}
