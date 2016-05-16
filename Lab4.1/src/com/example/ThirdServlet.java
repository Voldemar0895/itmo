package com.example;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		  int[][] Mas = new int[8][5];
		  for(int i=0;i<Mas.length;i++){
	            for(int j=0;j<Mas[i].length;j++){
	                Mas[i][j]=(int)(Math.random()*90)+10;
	                resp.getWriter().print(Mas[i][j]+" ");
	            }
	            resp.getWriter().println("<html><body><br></body></html>");
	        }

			
		};
		
		}
	
