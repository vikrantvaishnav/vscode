package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/userdetails")
public class MainServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String [] hobbies = req.getParameterValues("hobbies");
		
		
		pw.println("<h1>Welcome</h1>");
		pw.println("<p> Name: "+(fname+lname)+"\nAge: "+age+"\nGender: "+gender+"\nHobbies: </p>");
		for(String hobby : hobbies)
		{
			pw.println("<li>"+hobby+"</li>");
		}
		
	}
}
