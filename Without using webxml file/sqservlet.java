package com.sagar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")

public class sqservlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//int k=(int)req.getAttribute("k");
		//int k=Integer.parseInt(req.getParameter("k"));
		
		//Session
		//HttpSession session=req.getSession();
		//session.removeAttribute("k");//for removing session this line
		//int k=(int)session.getAttribute("k");
		
		//Session end
		//cookie
		int k=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		//cookie end
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("result is"+k);
	}

}
