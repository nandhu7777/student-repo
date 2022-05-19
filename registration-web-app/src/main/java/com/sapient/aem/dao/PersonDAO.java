package com.sapient.aem.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.model.Person;

public interface PersonDAO {
	
	public abstract Person  getPersonByAadharCard(Integer aadhar_card )throws SQLException;
	public abstract List<Person> getPerson()throws SQLException;
	public abstract Long addPerson(Person person)throws SQLException;
	public abstract String updatePerson(Person person)throws SQLException;
	public abstract String deletePerson(Long adhar_card) throws SQLException;
	
}
