package com.java.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ValidateDetails implements Servlet{

	@Override
	public void destroy() {
		System.out.println("Servlet destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet initialized");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		HttpServletRequest req= (HttpServletRequest)request;
		String username=req.getParameter("username");
		String password= req.getParameter("password");
		if(username == null || password == null || username.trim().length()==0 || password.trim().length()==0) {
			req.setAttribute("message", "Please enter username and password correctly");
			req.getRequestDispatcher("login").forward(request, response);
			
		}else {
			req.getRequestDispatcher("welcome").forward(request, response);
		}
	}

}
