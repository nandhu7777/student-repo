package com.sapient.aem.web;

import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDate;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Teacher;
import com.sapient.aem.service.PersonTeacherService;
import com.sapient.aem.service.PersonTeacherServiceImpl;


@WebServlet("/person-teacher")
public class PersonTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonTeacherService personteacherservice= new PersonTeacherServiceImpl();
	private Logger logger= Logger.getLogger(PersonTeacherServlet.class);


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			Long adharcard=Long.parseLong(request.getParameter("adharcard"));
			String name=request.getParameter("name");
			String birthdate=request.getParameter("birthdate");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			Long mobile=Long.parseLong(request.getParameter("mobile"));
			String qualification=request.getParameter("qualification");
			String gender=request.getParameter("gender");
			Double salary=Double.parseDouble(request.getParameter("salary"));

			Person person =new Person(adharcard,name,LocalDate.parse(birthdate),address,email,mobile);
			Teacher teacher=new Teacher(adharcard,name,LocalDate.parse(birthdate),address,email,mobile,qualification,gender,salary);
			Integer count=personteacherservice.addPersonTeacher(person, teacher);
			System.out.println(person);
			System.out.println(teacher);
			if( count!=null) {
				request.setAttribute("person", person);
				logger.info(person);
			
				//request.getRequestDispatcher("WEB-INF/views/add-person-teacher");
				request.getRequestDispatcher("WEB-INF/views/show-all-teachers.jsp")
				.forward(request, response);
				//out.println("data is added successfully");
			}



		}catch(PersonException e) {
			logger.error(e.getMessage(),e);
		}catch(Exception e) {
			logger.error(e.getMessage());
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
