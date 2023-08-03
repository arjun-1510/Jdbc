package Loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignUp {
	
	static Scanner sc = new Scanner(System.in);
	
	static boolean Verification = false;
	
	
	
	
	public void Signup_user() {
		
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter Your Email");
		String email = sc.next();
		System.out.println("Enter your Age");
		int Age = sc.nextInt();
		System.out.println("Enter your Contact Number");
		long contact = sc.nextLong();
		System.out.println("Create Your Password");
		
		String Password = sc.next();
		System.out.println(otp());
		
		System.out.println("Enter your Otp");
		if(otp()==sc.nextInt()) {
			System.out.println("\t\t*********8Signup_Suceessfully");
		}
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","Arjun-15");
			 
			 
			// Statement stmt = con.createStatement();
			 
			 PreparedStatement p = con.prepareStatement("insert into student values(?,?,?,?,?)");
			p.setString(1,name);
			p.setString(2, email);
			p.setInt(3, Age);
			p.setLong(4, contact);
			p.setString(5, Password);
			p.executeUpdate();
			
			System.out.println("\t\t************Insert Sucessfully");
			 
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// estatblishing 
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		
		
		
		
		
		
		
		
		
	public static int otp() {
		
		return (int)(Math.random()*9999+99);
	}

}
