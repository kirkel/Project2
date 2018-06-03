package com.revature.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestAddService {

	private TestAddService() {}
	
	public static JSONArray runTests() {
		XmlSuite suite = new XmlSuite();
		
		addTest(suite, "Reports test 1",
				new String[] {"com.revature.project2.testNG.ReportsTests"},
				new HashMap<String, String>(){{put("year", "2019");}});
	
		List<XmlSuite> suites = new ArrayList<>();
		suites.add(suite);

		return new testngservice().run(suites);
	
	}
	
	public static void addTest(XmlSuite suite, String testName, String[] classNames, Map<String, String> params) {
		XmlTest test = new XmlTest(suite);
		test.setName(testName);

		List<XmlClass> lsxc = new ArrayList<>();

		for (String s: classNames) {
			lsxc.add(new XmlClass(s));
		}

		test.setXmlClasses(lsxc);

		params.forEach((String k, String v) -> test.addParameter(k, v));
	}
	
	
}
