import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Moviesdb_conn {

	public static void main(String[] args) throws SQLException {
		// JDBC connection
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//Getting the connection with JDBC Driver
	    String mysqlUrl = "jdbc:mysql://localhost/moviesdb";
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/moviesdb", "root", "root");
	    System.out.println("Connection established......");

	  //Creating the Statement
	      Statement stmt = con.createStatement();
	      
	    //Query to create a table
	      String query = " CREATE TABLE MOVIES("
	    		  	   + " ID SERIAL PRIMARY KEY, "
	                   + " MOV_NAME TEXT NOT NULL, "
	                   + " DIRECTOR TEXT, "
	                   + " REL_YEAR INT, "
	                   + " GENRE TEXT ) ";
	      stmt.execute(query);
	      System.out.println("Table Created......");
	}

}



