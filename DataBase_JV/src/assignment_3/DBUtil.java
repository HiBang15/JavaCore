package assignment_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	public static Connection open() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "");
		}catch(Exception ex) {
			return null;
		}
	}
	
	public static void closeAll(Connection con, PreparedStatement stm, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		if(stm != null) {
			try {
				stm.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
