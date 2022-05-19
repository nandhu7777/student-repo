package com.sapient.aem.service;


import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Teacher;

public class PersonTeacherServiceImpl implements PersonTeacherService {
   private PersonService personService=new PersonServiceImpl();
   private TeacherService teacherService =new TeacherServiceImpl();
	@Override
	public Integer addPersonTeacher(Person person, Teacher teacher) throws PersonException {
		try {
			Long adharCard=personService.addPerson(person);
			teacher.setAdharCard(adharCard);
			Integer teacherId=teacherService.addTeacher(teacher);
			System.out.println(teacherId);
			return teacherId;
		}catch(PersonException e) {
			e.printStackTrace();
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw new PersonException(e.getMessage(),e);
		}
		
	}

}
