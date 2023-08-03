package sql_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class crud_operation {
 static	Connection con ;
	
static	PreparedStatement p;

static Scanner sc = new Scanner(System.in);
	
	
	public static void insert() {
		
	
		
		try {
			
			System.out.println("Enter your Id");
			int id = sc.nextInt();
			System.out.println("Enter your Name");
			String Name = sc.next();
			
			System.out.println("Enter your Age");
			int Age = sc.nextInt();
			System.out.println("Enter your City");
			String City = sc.next();
			
		 String Querry = "INSERT INTO ARJUN_DETAILS(ID,NAME,AGE,CITY) VALUES (?,?,?,?)";
		 
		 
			
			p=con.prepareStatement(Querry);
			p.setInt(1, id);
			p.setString(2, Name);
			p.setInt(3, Age);
			p.setString(4, City);
			 p.executeUpdate();
			 
		   Statement stmt = con.createStatement();
		   
		   ResultSet result = stmt.executeQuery("SELECT * FROM ARJUN_DETAILS");
			
			
			
		
		
       
		while(result.next()) {
			
			int i = result.getInt( "id");
			System.out.println("Id is  " + i);
			String n = result.getString( "Name");
			System.out.println("Your Name is " + n);
			int A= result.getInt("Age");
			System.out.println( "Your Age is "+A);
			String c = result.getString( "City");
			System.out.println("Your City is " +c);
			System.out.println("=======================================");
		}
		
			 
			 
			 
	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
}
	
	
	public void search() {
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Arjun-15");
			 insert();
			 
				
			System.out.println("Insert Suceesfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		//Step - 2 _ Estatblish Connection
		
		

	}

}
