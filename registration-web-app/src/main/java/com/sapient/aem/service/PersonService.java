package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.exception.PersonException;

import com.sapient.aem.model.Person;

public interface PersonService {

	public abstract Person getPersonByAadharCard(Integer aadhar_card) throws PersonException;
	public abstract List<Person> getPersons() throws PersonException ;
	public abstract Long addPerson ( Person  person) throws PersonException ;
	public abstract String updatePerson ( Person person) throws PersonException ;
	public abstract String deletePerson (Long aadhar_card ) throws PersonException ;
}

