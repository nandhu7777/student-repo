package com.sapient.aem.service;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Student;


public interface PersonStudentService {
	public abstract Integer addPersonStudent(Person person,Student student)throws PersonException;
}




