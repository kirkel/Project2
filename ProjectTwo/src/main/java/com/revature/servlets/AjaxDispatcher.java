package com.revature.servlets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxDispatcher {

	private AjaxDispatcher() {}
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		switch(request.getRequestURI()) {
		case "/Ers_System/viewReimbursement.ajax":
			System.out.println("inside ajaxDispatcher");
			return ReimbSvce.getAllReimbursement();
			
		case "/Ers_System/viewAllEmployee.ajax":
			System.out.println("inside viewAllEmployee");
			return EmployeeSvce.getAllEmployee();
		default:
			return new String("Not implemented");
		}
	}
}
