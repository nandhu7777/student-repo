package com.sapient.aem.service;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Teacher;

public interface PersonTeacherService {
   public abstract Integer addPersonTeacher(Person person,Teacher teacher)throws PersonException;
   
}
