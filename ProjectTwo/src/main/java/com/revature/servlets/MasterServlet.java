package com.revature.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MasterServlet extends HttpServlet {

	      
	    public MasterServlet() {
	    	super();
	    	}


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
			System.out.println("Inside masterServlet doPost");
			System.out.println("inside masterServlet URI= " + request.getRequestURI());
			request.getRequestDispatcher(MasterDispatcher.process(request, response)).forward(request, response);
			System.out.println("===========================================");
	
		
		}

	}