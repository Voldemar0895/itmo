package com.example;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FourthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		  int[][] Mas = new int[5][8];
		  for(int i=0;i<Mas.length;i++){
	            for(int j=0;j<Mas[i].length;j++){
	                Mas[i][j]=(int)((Math.random()*199)-99);
	                resp.getWriter().print(Mas[i][j]+" ");
	            }
	            resp.getWriter().println("<html><body><br></body></html>");
	        }

		  int max=Mas[0][0];
	        for(int i =0;i<Mas.length;i++){
	            for(int h=0;h<Mas[i].length;h++){
	                if(Mas[i][h]>max)max=Mas[i][h];
	            }
	        }
	       
	        resp.getWriter().println("Значение максимального элемента массива = "+max);
		};
}
		
		
		
	
