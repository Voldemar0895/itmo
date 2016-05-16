package com.example;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		double a = Double.parseDouble(var1); 
		String var2 = req.getParameter("var2");
		double b = Double.parseDouble(var2); 
		String var3 = req.getParameter("var3");
		double c = Double.parseDouble(var3);
		double d= b*b-4*a*c;
		if(d>0){ 
			double x1= (-b-Math.sqrt(d))/(2*a);
			double x2= (-b+Math.sqrt(d))/(2*a);
			resp.getWriter().println("x1=" + x1 + "  x2=" + x2);
		   } 
		else 
		if(d==0){ 
			double x1= (-b)/(2*a);
			resp.getWriter().println("x=" + x1 );
		}
		else{ 
			b=-b;
			double x1= Math.sqrt(-d);
			double x2= (2*a);
			resp.getWriter().println("x1=(" +b+"+-" + x1 +"*i)/" + x2 );
		};
		
		}
		}
