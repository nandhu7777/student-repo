package com.sapient.aem.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.dao.PersonDAO;
import com.sapient.aem.dao.PersonDAOImpl;
import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;

public class PersonServiceImpl implements  PersonService {
	private PersonDAO personDAO = new PersonDAOImpl();

	public Person getPersonByAadharCard(Integer aadhar_card) throws PersonException {
		try {
			Person person= personDAO.getPersonByAadharCard(aadhar_card);

			return person; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}

	public List<Person> getPersons() throws PersonException{
		try {
			List<Person> personList=  personDAO.getPerson();

			return personList; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}
	public Long addPerson(Person person) throws PersonException {
		try {
			Long aadhar_card = personDAO.addPerson(person);

			return aadhar_card; 
		}catch(SQLException e) {
			//converting SQLException to PersonException
			throw new PersonException(e.getMessage(),e);
		}
	}

	public String updatePerson(Person person) throws PersonException{
		try {
			String result= personDAO.updatePerson(person);
			return result; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}


	public String deletePerson(Long aadhar_card) throws PersonException {
		try {
			String result= personDAO.deletePerson(aadhar_card);			
			return result; 
		}catch(SQLException e) {
			
			throw new PersonException(e.getMessage(),e);
		}
	}

}
