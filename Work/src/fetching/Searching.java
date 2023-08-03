package fetching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class Searching { 
	
	 static Connection con;
	 static Scanner sc = new Scanner(System.in);
	
	
	
	public  static void search() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// estatblishing 
			
			
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Arjun-15");
			
			
		System.out.println("database Connect");
		
		
		String queery = "select * from arjun_details";
		
		
		PreparedStatement p = con.prepareStatement(queery);
		
		ResultSet result = p.executeQuery();
		
	System.out.println("Enter your Searching");	
	String name = sc.nextLine();
		
		while(result.next()) {
			
			if(result.getString("name").equals(name)) {
				System.out.println("Matching");
				break;
				
			}else {
				System.out.println("Not matching");
			}
			
		}
		
		
		
		
		
		
		
		
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		
	}
	
	
}