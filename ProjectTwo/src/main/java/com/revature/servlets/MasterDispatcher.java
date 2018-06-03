package com.revature.servlets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.services.testngservice;

public class MasterDispatcher {
	
private MasterDispatcher() {}
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("inside dispatcher " + request.getRequestURI());
		switch(request.getRequestURI()) {
		
		case "/ProjectTwo/testng.do":
				System.out.println("inside testng.do");
				return testngservice.testng(request, response);
	
		default:
				return "404.jsp";
		}
	}
}