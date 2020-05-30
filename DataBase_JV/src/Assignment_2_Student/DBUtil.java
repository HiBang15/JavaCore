package Assignment_2_Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	public static Connection open() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	public static void closeAll(Connection con, PreparedStatement stm, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
		if(stm != null) {
			try {
				stm.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
}
