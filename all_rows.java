
import java.sql.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class all_rows {

	public static void main(String[] args) throws Exception {
			//MySQL DB Connection open
		try (Connection conn = DriverManager.getConnection(
	    		  "jdbc:mysql://localhost:3308/moviesdb","root","root");
		         
		    ) {
				Statement selectStmt = conn.createStatement();
			
				ResultSet rs=selectStmt
						.executeQuery("SELECT * FROM movies");
			
				while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"\t "+rs.getString(3)+"\t "+rs.getString(4)+"\t "+rs.getString(5));
				conn.close();
			 }catch(Exception e) { 
				System.out.println(e);}
		}

}


