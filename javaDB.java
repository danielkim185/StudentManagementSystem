package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javaDB
{
	public static void main(String[] args)
	{
		String connectionString = "jdbc:sqlserver://DESKTOP-40QNJ27;Database=StudentManagementSystem;IntegratedSecurity=true";
		
		try 
		{
			try (Connection connection = DriverManager.getConnection(connectionString))
			{
				System.out.println("Connection established.");
			}
		}
		catch (SQLException e)
		{
			System.out.println("Error connection to the database.");
			e.printStackTrace();
		}
	}
}


//import java.sql.*;
//import javax.sql.*;


/*
public class javaDB{

public static void main(String args[]){
String dbtime;
String dbUrl = "jdbc:mysql://your.database.domain/yourDBname";
String dbClass = "com.mysql.jdbc.Driver";
String query = "Select * FROM users";

try {

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection (dbUrl);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);

while (rs.next()) {
dbtime = rs.getString(1);
System.out.println(dbtime);
} //end while

con.close();
} //end try

catch(ClassNotFoundException e) {
e.printStackTrace();
}

catch(SQLException e) {
e.printStackTrace();
}

}  //end main

}  //end class
*/








