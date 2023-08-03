package sql_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PreparedStatement p;
		
		
		
		
		try {
			
			//Step ! -- Load or 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			
			
			//Step - 2 _ Estatblish Connection
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Arjun-15");
			
			
			String Drop = "DROP TABLE ARJUN_DETAILS";
			 p = con.prepareStatement(Drop);
			 p.executeUpdate();
			
			String create_table = "CREATE TABLE ARJUN_DETAILS "
					+ "(ID INTEGER NOT NULL, "
					+ "NAME VARCHAR(20),"
					+ "AGE INT ,"
					+ "CITY VARCHAR(20))";
					
			
			p = con.prepareStatement(create_table);
			System.out.println("Table craeted");
			
			p.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
