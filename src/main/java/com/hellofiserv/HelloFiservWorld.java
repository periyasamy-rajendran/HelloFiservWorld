package com.hellofiserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloFiservWorld
 */
@WebServlet("/HelloFiservWorld")
public class HelloFiservWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloFiservWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties properties = new Properties();
		properties.load(HelloFiservWorld.class.getResourceAsStream("/config/config.properties"));
		String env_input = properties.getProperty("user_parameter");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1 align='center'>" + properties.getProperty("environment") + "</h1><h2 align='center'>" + properties.getProperty("displayName") + "</h2></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
