package com.pack2;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class SecondServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		   PrintWriter pw=res.getWriter();
		   res.setContentType("text/html");
		
			String name = req.getParameter("ename");
			String pwd = req.getParameter("pwd");
			
			if(name != null && pwd !=null)
			{
				pw.println("<h1> Welcome "+name+"</h1>");
			}
			 if("Rehan".equals(name) && "Java is Awesome".equals(pwd)) 
			{
				pw.println("<h2>You did the Task!!!!</h2>");
			}
			else
			{
				pw.println("<h2>Invalid credentials!!!!<h2>");
			}
			
			
			//PRODUCT DETAILS PART
			
			String pname = req.getParameter("pname");
			if(pname !=null)
			{
				int id = Integer.parseInt(req.getParameter("pid"));
				int qty = Integer.parseInt(req.getParameter("quantity"));
				double price = Double.parseDouble(req.getParameter("price"));
				
				if(qty <= 5)
				{
					price = price + (price * 10 /100);
				}
				
				pw.println("<hr>");
				pw.println("<div style='text-align:center;'>");
				pw.println("<center><h1> Product Details </h1> ");
				pw.println("<h2>Product Name: "+pname+"<br><br>");
				pw.println("Product Id: "+id+"<br><br>");
				pw.println("Product Price: "+price+"<br><br></center></h2>");
					
			}		
	  }

}