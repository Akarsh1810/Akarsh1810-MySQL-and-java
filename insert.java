import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
	 static final String DB_URL = "jdbc:mysql://localhost:3308/moviesdb";
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	  public static void main(String[] args) {
		      // Open a connection
		      try(Connection conn = DriverManager.getConnection(
		    		  "jdbc:mysql://localhost:3308/moviesdb","root","root");
		         Statement stmt = conn.createStatement();
		      ) {		      
		         // Execute a query
		         System.out.println("Inserting records into the table...");          
		         
		         String sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES ('The Lost World', 'Steven Spielberg', 1997, 'sci-fi')";
		         stmt.executeUpdate(sql);
		         
		         sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES ('Pirates of the Caribbean: The Curse of the Black Pearl', 'Gore Verbinski', 2003, 'fantasy')";
		         stmt.executeUpdate(sql);
		         
		         sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES ('Harry Potter and Goblet of Fire', 'Mike Newell', 2005, 'fantasy')";
		         stmt.executeUpdate(sql);
		         
		         sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES('The Hobbit: An Unexpected Journey', 'Peter Jackson', 2012, 'fantasy')";
		         stmt.executeUpdate(sql);
		         
		         sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES('The Lord of the Rings: The Fellowship of the Ring', 'Peter Jackson', 2001, 'fantasy')";
		         stmt.executeUpdate(sql);
		         
		         sql = "INSERT INTO movies (Mov_name,  director, rel_year, genre) VALUES('The Lord of the Rings: The Two Towers', 'Peter Jackson', 2002, 'fantasy')";
		         stmt.executeUpdate(sql);
		         
		         System.out.println("Inserted records into the table...");   	  
		      
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		      
		   }
		}
	   


