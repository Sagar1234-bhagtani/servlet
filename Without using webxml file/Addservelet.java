package com.sagar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")

public class Addservelet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//session
		//HttpSession session=req.getSession();
		//session.setAttribute("k",k);
		//session end
		
		
		//cookie 
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		
		//cookie end
		
		
		res.sendRedirect("sq"); 
		//req.setAttribute("k",k);
		//RequestDispatcher rd=req.getRequestDispatcher("sq");
	//	rd.forward(req,res);
		//PrintWriter out=res.getWriter();
		//out.println("result is"+k);
	}
	

}
