package d1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) 
	{
		//step 1: load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//protocall:subprocall:DB.specific information
			//jdbc:mysql
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
			
			String query = "Select * from doctors_info ";
			Statement stmt = con.createStatement();
			PreparedStatement ptmt = con.prepareStatement(query);
//			rs.next();
//			while(rs.next()) {
//			System.out.println(rs.getString(1) + " " + rs.getString(2) );
		}
		}
			catch (SQLException e) {
				e.printStackTrace();
			
			String query = "Select * from medicine  ";
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}


}
