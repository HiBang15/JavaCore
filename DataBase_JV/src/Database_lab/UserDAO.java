package Database_lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	public static List<User> findAll(){
		List<User> list = new ArrayList<>();
		Connection con =(Connection) DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null;
		
		try {
			stm =  con.prepareStatement("select id, email, pass, full_name from tb_user");
			rs = stm.executeQuery();
			System.out.println("aaaaa");
			while(rs.next()) {
				String id = rs.getString("id");
				String full_name = rs.getString("full_name");
				String email = rs.getString("email");
				String pass = rs.getString("pass");
				
				list.add(new User(id, email, pass, full_name));
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		
		return list;
		
	}
	public static User findById(String id) {
		User u = null; 
		Connection con = DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("SELECT id, full_name, email, pass from tb_user WHERE id = ?");
			stm.setString(1, id);
			rs = stm.executeQuery();
			if(rs.next()) {
				String full_name = rs.getString("full_name");
				String email = rs.getString("email");
				String pass = rs.getString("pass");
				
				u = new User(id, full_name, email, pass);
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return u;
	}
	
	public static boolean AddNew(User u) {
		String id = u.getId(); 
		String full_name = u.getFull_name(); 
		String email = u.getEmail(); 
		String pass = u.getPass();
		
		Connection con = DBUtil.open(); 
		PreparedStatement stm = null; 
		
		try {
			stm = con.prepareStatement("INSERT INTO tb_user(id, full_name, email, pass) VALUE (?, ?, ?, ?)");
			stm.setString(1, id);
			stm.setString(2, full_name);
			stm.setString(3, email);
			stm.setString(4, pass);
			int kq = stm.executeUpdate();
			if(kq>0) {
				return true;
			}else {
				return false;
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			DBUtil.closeAll(con, stm, null);
		}
	}
	
	public static boolean Update(String id, String full_name, String email, String pass) {
		
		Connection con = DBUtil.open(); 
		PreparedStatement stm = null;
			
		try {
			stm = con.prepareStatement("UPDATE tb_user set full_name = ?, email = ?, pass = ? where id = ?");
			stm.setString(1, full_name);
			stm.setString(2, email);
			stm.setString(3, pass);
			stm.setString(4, id);
			int kq = stm.executeUpdate();
			if(kq>0) {
				return true;
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			DBUtil.closeAll(con, stm, null);
		}
		return true;
	}
}
