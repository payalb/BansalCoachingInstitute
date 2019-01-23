package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {
	// service: get: doGet| post: doPost| head: doHead
//jsp: presentation business: servlet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		if (req.getAttribute("message") != null) {
			writer.println(req.getAttribute("message"));
		}
		writer.println("<form action='./validateDetails' method='post'>");
		writer.println("<h3>Login here:</h3>");
		writer.println("<label for='username' title='Username' >Username</label> &nbsp;");
		writer.println("<input type='text' name='username' required='required' maxlength='20'/>" + "<br/>" + "<br/>"
				+ "<label for='password' title='Password'>Password</label> &nbsp;"
				+ "<input type='password' name='password' required='required'" + "pattern='[a-zA-Z0-9]{6,20}'/>"
				+ "<br/>" + "<br/>" + "<input type='submit'/>");
		writer.print("</form>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
