package com.revature.testNG.service;

import com.beust.jcommander.internal.Lists;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class testngservice {

	public static String testng(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("inside tesngservice");
		
		TestListenerAdapter adapter = new TestListenerAdapter();

		TestNG testng = new TestNG();
		
		List<String> suites = Lists.newArrayList();
		
		suites.add("/ProjectTwo/src/test/java/testNG.xml");
		
		testng.setTestSuites(suites);
		
		System.out.println("before testNG.run");
		
		testng.run();
		
		return "/index.jsp";
		
	}
}
