package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomePage extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.println("Welcome "+ request.getParameter("username")+ " ! ");
		
	}

}
