package com.revature.dispatcher;

import com.revature.testNG.service.testngservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MasterDispatcher {
	
private MasterDispatcher() {}
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("inside dispatcher " + request.getRequestURI());
		switch(request.getRequestURI()) {
		
		case "/ProjectTwo/testNG.do":
				System.out.println("inside testNG.do");
				return testngservice.testng(request, response);
	
		default:
				return "404.jsp";
		}
	}
}