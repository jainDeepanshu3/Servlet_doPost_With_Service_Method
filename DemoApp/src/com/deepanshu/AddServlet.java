package com.deepanshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		
		//If you want to send something/write something with res then you need 
		// To use "PrintWriter" object which is used to write data in 
		// Response object..
		PrintWriter out= res.getWriter();
		
		System.out.println("Sum of the two entered numbers are:"+k);
		// if we use syso then output should come in console rather on web browser.
		
		out.println("Sum of the two entered numbers are:"+k);
		
	}
	
	
	
	
	// In service() method example we are passing values in the URL 
	// If we don't want to pass values in URL then 
	// we need to use either doGet() or doPost() method of HttpServlet Interface
	
	/*public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		
		//If you want to send something/write something with res then you need 
		// To use "PrintWriter" object which is used to write data in 
		// Response object..
		PrintWriter out= res.getWriter();
		
		System.out.println("Sum of the two entered numbers are:"+k);
		// if we use syso then output should come in console rather on web browser.
		
		out.println("Sum of the two entered numbers are:"+k);
		
	}*/
	
	

}
