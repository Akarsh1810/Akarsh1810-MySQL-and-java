import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class queries {
	private static Statement selectStmt;
	private static Connection connection;

	public static void main(String[] args) {
        connection = null;
        selectStmt = null;
	        try (Connection conn = DriverManager.getConnection(
		    		  "jdbc:mysql://localhost:3308/moviesdb","root","root");
			         
			    ){
	        	// Execute a query
	        	System.out.println("Querying from the MOVIES table...");
	        	Statement selectStmt = conn.createStatement();
	        	
	            ResultSet rs = selectStmt
	            		.executeQuery("SELECT ID, MOV_NAME, DIRECTOR, REL_YEAR, GENRE FROM MOVIES");
	            
	            while(rs.next()){
	            	System.out.println(rs.getString(1));    //First Column
	                System.out.println(rs.getString(2));    //Second Column
	                System.out.println(rs.getString(3));    //Third Column
	                System.out.println(rs.getString(4));    //Fourth Column
	                System.out.println(rs.getString(5));    //Fifth column 
	            }
	             
	        }catch (Exception e) {
	        	e.printStackTrace();
	        }finally {
	            try {
	                selectStmt.close();
	                //insertStmt.close();
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	}
}