package com.project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Info")
public class Info extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
     {
	  
	   PrintWriter out=res.getWriter();
	   System.out.println("Inside Servlet");
	   int id=Integer.parseInt(req.getParameter("uid"));
	   String name=req.getParameter("uname");
	   out.println("welcome "+name);
	   

		
	}

}
