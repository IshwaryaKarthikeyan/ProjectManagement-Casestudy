package Com.java.util;

import java.sql.*;

public class DBConnection {
	

	public static Connection conn = null;
		
	public DBConnection() {
	     try {
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");
	 
	           
	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy", "root", "Mysqlroot@19");
	 
	            System.out.println("Connected to the database");
	           
	 
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	 
		}
	 
		

	 
		public static Connection  getConnect()
		{
			 DBConnection d1= new  DBConnection();
			 return conn;
			
		 }
	 

	}


