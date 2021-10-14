
import java.sql.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mov_details {

	public static void main(String[] args, String mov_name, String id, String Director, String Rel_year, String Genre) throws Exception {
			//MySQL DB Connection
		try (Connection conn = DriverManager.getConnection(
	    		  "jdbc:mysql://localhost:3308/moviesdb","root","root");
		         
		    ) {
				Statement selectStmt = conn.createStatement();
			
				ResultSet rs=selectStmt
						.executeQuery("SELECT * FROM movies");
			
				while(rs.next())
				System.out.println(rs.getInt(id)+" "+rs.getString(mov_name)+"\t "+rs.getString(Director)+"\t "+rs.getString(Rel_year)+"\t "+rs.getString(Genre));
				conn.close();
			 }catch(Exception e) { 
				System.out.println(e);}
		}

}




