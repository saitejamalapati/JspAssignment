package com.accolite.au;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet{
	public Validation() {
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("Email");
		String password = req.getParameter("Password");
		PrintWriter out = res.getWriter();  
		if(email.contains("@") && email.contains(".") && email.lastIndexOf("@")==email.indexOf("@") && email.lastIndexOf(".")==email.indexOf(".") && email.indexOf("@")< email.indexOf(".") && email.indexOf("@")>0 && email.indexOf("@")+1!=email.indexOf(".") && email.indexOf(".") !=email.length()-1)
			if(password.equals("pass1234"))
				out.println("Valid Email ID\n");
			else
				out.println("Incorrect Password\n");
		else
			out.println("Invalid Email ID\n");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
