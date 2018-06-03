package com.revature.services;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.beust.jcommander.internal.Lists;

public class testngservice implements ITestListener{

	public static String testng(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("inside tesngservice");
		
		TestListenerAdapter adapter = new TestListenerAdapter();

		TestNG testng = new TestNG();
		
		List<String> suites = Lists.newArrayList();
		
		testng.addListener(adapter);
		
		suites.add("/ProjectTwo/src/test/java/testng.xml");
		
		testng.setTestSuites(suites);
		
		System.out.println("before testng.run");
		
		testng.run();
		
		return "/index.jsp";
		
	}
	
	public testngservice(){
		jsa = new JSONArray();
	}

	JSONArray jsa;
	private String suiteName;

	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}
	
	public JSONArray run(List<XmlSuite> suites) {
        TestNG testng = new TestNG();
        testng.setXmlSuites(suites);

        // Adding a listener so we can actually do something with the output
        testng.addListener(this);

        // Run the TestNG Suite
        testng.run();
        return this.jsa;
    }

    public JSONArray runOnXMLFile(String path) {
        TestNG testng = new TestNG();
        testng.setXmlPathInJar(path);

        // Adding a listener so we can actually do something with the output
        testng.addListener(this);

        // Run the TestNG Suite
        testng.run();
        return this.jsa;
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        onTestConclude(iTestResult);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        onTestConclude(iTestResult);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        onTestConclude(iTestResult);
    }

    private void onTestConclude(ITestResult itr) {
        JSONObject jso = new JSONObject();
        jso.put("suite", itr.getTestName());
        jso.put("testName", itr.getName());
        jso.put("result", itr.getStatus());
        jsa.put(jso);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
	
}
