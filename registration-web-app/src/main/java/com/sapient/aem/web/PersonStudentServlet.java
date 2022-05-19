package com.sapient.aem.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Student;

import com.sapient.aem.service.PersonStudentService;
import com.sapient.aem.service.PersonStudentServiceImpl;
import com.sapient.aem.service.StudentService;
import com.sapient.aem.service.StudentServiceImpl;
import com.sapient.aem.util.Connections;


@WebServlet("/person-student")
public class PersonStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonStudentService personstudentservice= new PersonStudentServiceImpl();
	private StudentService studentService = new StudentServiceImpl();
	private Logger logger= Logger.getLogger(PersonStudentServlet.class);
	List<Integer> marksList= new ArrayList<Integer>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			Long adharcard=Long.parseLong(request.getParameter("adharcard"));
			String name=request.getParameter("name");
			String birthdate=request.getParameter("birthdate");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			Long mobile=Long.parseLong(request.getParameter("mobile"));
			Long admissionCode=Long.parseLong(request.getParameter("admissionCode"));
			String className=request.getParameter("classname");
			Integer subject1=Integer.parseInt(request.getParameter("Subject1"));
			Integer subject2=Integer.parseInt(request.getParameter("Subject2"));
			Integer subject3=Integer.parseInt(request.getParameter("Subject3"));
			Integer subject4=Integer.parseInt(request.getParameter("Subject4"));
			Integer subject5=Integer.parseInt(request.getParameter("Subject5"));
			Integer subject6=Integer.parseInt(request.getParameter("Subject6"));
		    
			String grade=studentService.getStudentGrade(subject1,subject2,subject3,subject4,subject5,subject6);
			
			
//			marksList.add(Integer.parseInt(request.getParameter("Subject1")));
//			marksList.add(Integer.parseInt(request.getParameter("Subject2")));
//			marksList.add(Integer.parseInt(request.getParameter("Subject3")));
//			marksList.add(Integer.parseInt(request.getParameter("Subject4")));
//			marksList.add(Integer.parseInt(request.getParameter("Subject5")));
//			marksList.add(Integer.parseInt(request.getParameter("Subject6")));

			Person person =new Person(adharcard,name,LocalDate.parse(birthdate),address,email,mobile);
//			Student student=new Student(adharcard,name,LocalDate.parse(birthdate),address,email,mobile,admissionCode,className,marksList);
			Student student=new Student(adharcard,name,LocalDate.parse(birthdate),address,email,mobile,admissionCode,className,subject1,subject2,subject3,subject4,subject5,subject6,grade);
			
			Integer count=personstudentservice.addPersonStudent(person, student);
			System.out.println(person);
			System.out.println(student);
			if( count!=null) {
				request.setAttribute("person", person);
				logger.info(person);

		
				out.println("data is added successfully");
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
  
