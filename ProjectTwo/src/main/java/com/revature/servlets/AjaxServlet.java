package com.revature.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AjaxServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ajax servlet doGet");
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		// Write the POJO as JSON to the response
		response.getWriter().write(mapper.writeValueAsString(AjaxDispatcher.process(request, response)));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ajax servlet doPost");
		doGet(request, response);
	}

}