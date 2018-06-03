package com.revature.services;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import com.beust.jcommander.internal.Lists;

public class testngservice {

	public static String testng(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("inside tesngservice");
		
		TestListenerAdapter adapter = new TestListenerAdapter();

		TestNG testng = new TestNG();
		
		List<String> suites = Lists.newArrayList();
		
		suites.add("/ProjectTwo/src/test/java/testng.xml");
		
		testng.setTestSuites(suites);
		
		System.out.println("before testng.run");
		
		testng.run();
		
		return "/index.jsp";
		
	}
}
