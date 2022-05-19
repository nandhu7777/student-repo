package com.sapient.aem.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Teacher;
import com.sapient.aem.service.TeacherService;
import com.sapient.aem.service.TeacherServiceImpl;


@WebServlet("/AllTeacherServlet")
public class AllTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	private TeacherService teacherService= new TeacherServiceImpl();
	private Logger logger= Logger.getLogger(AllTeacherServlet.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			List<Teacher> teacherList=  teacherService.getTeacher();
			
			request.setAttribute("teacherList", teacherList);
			request.getRequestDispatcher("WEB-INF/views/show-all-teachers.jsp")
										.forward(request, response);
			
		}catch(PersonException e) {
			logger.error(e.getMessage(),e);
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
