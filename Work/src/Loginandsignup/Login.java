package Loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	public void User_Login() {
		
		

		System.out.println("\t\tWelcome to Login Page");
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			 
			 
			 PreparedStatement p = con.prepareStatement("Select * FROM student");
			 
			
			 
			 ResultSet result =p.executeQuery();
			 System.out.println("Enter your User_name");
				String user_name = sc.next();
				System.out.println("Enter your Password");
				String Password= sc.next();
				
				while(result.next()) {
					
					
					 if(result.getString("NAME").equals(user_name) && result.getString("PASSWORD").equals(Password) ) {
//						 
						 System.out.println("\t\t***********Login Sucessfully*************");
					 }else {
						 System.err.println("\t\t**************8Login Failed");
					 }
				}
//				
//			 if(result.getString("NAME").equals(user_name)  ) {
//				 
//				 System.out.println("\t\t***********Login Sucessfully*************");
//			 }else {
//				 System.out.println("Login Failed");
//			 }
			 
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		
		
		
		
		
	}
	
	
		
		
		
	}

