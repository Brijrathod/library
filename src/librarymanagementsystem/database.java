    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author Yajurved
 */
import java.sql.*;

public class database {

	private String user = "user";
	private String password = "#1#2#3%1%2%3";
	private String url = "jdbc:mysql://localhost/library";
	private Statement statement;
	
	public database() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatement() {
		return statement;
	}
}


