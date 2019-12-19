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
		if(env_input.equalsIgnoreCase("DEV1")){
			out.print("<html><body><h1 align='center'>" + properties.getProperty("dev1_user_input") + "</h1><h2 align='center'>" + properties.getProperty("dev1_app_label") + "</h2><h3 align='center'>" + properties.getProperty("dev1_target_env") + "</h3></body></html>");
		}else if(env_input.equalsIgnoreCase("DEV2")){
			out.print("<html><body><h1 align='center'>" + properties.getProperty("dev2_user_input") + "</h1><h2 align='center'>" + properties.getProperty("dev2_app_label") + "</h2><h3 align='center'>" + properties.getProperty("dev2_target_env") + "</h3></body></html>");
		}else if(env_input.equalsIgnoreCase("QA1")){
			out.print("<html><body><h1 align='center'>" + properties.getProperty("qa1_user_input") + "</h1><h2 align='center'>" + properties.getProperty("qa1_app_label") + "</h2><h3 align='center'>" + properties.getProperty("qa1_target_env") + "</h3></body></html>");
		}else if(env_input.equalsIgnoreCase("QA2")){	
			out.print("<html><body><h1 align='center'>" + properties.getProperty("qa2_user_input") + "</h1><h2 align='center'>" + properties.getProperty("qa2_app_label") + "</h2><h3 align='center'>" + properties.getProperty("qa2_target_env") + "</h3></body></html>");
		}else{
			out.print("<html><body><h1 align='center'>" + properties.getProperty("prod_user_input") + "</h1><h2 align='center'>" + properties.getProperty("prod_app_label") + "</h2><h3 align='center'>" + properties.getProperty("prod_target_env") + "</h3></body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
