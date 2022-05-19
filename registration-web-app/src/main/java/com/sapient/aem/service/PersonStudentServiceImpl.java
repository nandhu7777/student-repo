package com.sapient.aem.service;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Student;


public class PersonStudentServiceImpl implements PersonStudentService{
	private PersonService personService=new PersonServiceImpl();
	   private StudentService studentService =new StudentServiceImpl();
		@Override
		public Integer addPersonStudent(Person person, Student student) throws PersonException {
			try {
				Long adharCard=personService.addPerson(person);
				student.setAdharCard(adharCard);
				Integer admissionCode=studentService.addStudent(student);
				System.out.println(admissionCode);
				return admissionCode;
			}catch(PersonException e) {
				e.printStackTrace();
				throw e;
			}catch(Exception e) {
				e.printStackTrace();
				throw new PersonException(e.getMessage(),e);
			}
		}
}