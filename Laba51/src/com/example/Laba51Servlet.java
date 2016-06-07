package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class Laba51Servlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
	resp.setContentType("text/html;charset=utf-8");
	String operation = req.getParameter("operation");
	int i1 = Integer.parseInt(operation);
	String[][] result= new String[1000][5];//752
	  int i=0;
	  int j=0;
	  int k1=0;
	  int k2=0;
	String csvFile = "vod.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	resp.getWriter().println("<html><body>");
	//resp.getWriter().println("</tr></table>");
	resp.getWriter().println("<table TABLE BORDER=1>");
	try {
      
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] country = line.split(cvsSplitBy);
		
			

				result[i][0]=country[0];
				result[i][1]=country[1];
				result[i][2]=country[2];
				result[i][3]=country[3];
				result[i][4]=country[4];

				

				
				
		//	resp.getWriter().println(" <tr><td>"+result[i][0]+  " </td><td>"+ result[i][1] + " </td><td>"+ result[i][2]+ " </td><td>" + result[i][3]+ " </td><td>"+ result[i][4]+ " "+"</td></tr>");
			i++;  
			
			
			}
	
		}
	
	 catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	if (i1>1)
	{
	for( i = 750; i > 1 ; i--){
      for(j = 1; j < i ; j++){
      	int comparison = result[j][i1].compareTo(result[j+1][i1]);
          if( comparison > 0 ){
          	for (int k=0; k<5 ; k++){
              String tmp = result[j][k];
              result[j][k] = result[j+1][k];
              result[j+1][k] = tmp;
          	}
          }
      }
  }
	}
	else
	{
		for( i = 750; i > 1 ; i--){
		      for(j = 1; j < i ; j++){
		    	   k1 = Integer.parseInt(result[j][i1]);
		    	   k2 = Integer.parseInt(result[j+1][i1]);
		    	  if (k1>k2){
		    		  for (int k=0; k<5 ; k++){
		                  String tmp = result[j][k];
		                  result[j][k] = result[j+1][k];
		                  result[j+1][k] = tmp;
		                  {
		    	  }
		    	  }
		      }
	}
	}
	}
	System.out.println("Done");
	for( i = 0; i < 751 ; i++)
	
		resp.getWriter().println(" <tr><td>"+result[i][0]+  " </td><td>"+ result[i][1] + " </td><td>"+ result[i][2]+ " </td><td>" + result[i][3]+ " </td><td>"+ result[i][4]+ " "+"</td></tr>");

	resp.getWriter().println("</table></body></html>"); 

}
}



	

