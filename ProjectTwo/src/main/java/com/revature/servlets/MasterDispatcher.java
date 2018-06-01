package com.revature.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MasterDispatcher {
	
private MasterDispatcher() {}
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("inside dispatcher " + request.getRequestURI());
		switch(request.getRequestURI()) {
		
		case "/Ers_System/login.do":
				System.out.println("inside login.do");
				return LoginService.login(request, response);
	
		default:
				return "404.jsp";
		}
	}
}
