package assignment_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DAO {
	private static Scanner input = new Scanner(System.in);
	private String table; 
	
	
	public String gettable() {
		return table;
	}

	public void settable(String table) {
		this.table = table;
	}
	
	public static boolean insert(Connection con, String sql)
	{
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement(sql);
			int rss = stm.executeUpdate();
			if(rss>0) {
				return true;
			}else {
				return false;
			}		
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	
	public static boolean delete(Connection con, String table, String where)
	{
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("DELETE FROM ? WHERE ?");
			stm.setString(1, table);
			stm.setString(2,where);
			int rss = stm.executeUpdate();
			if(rss>0) {
				return true;
			}else {
				return false;
			}		
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	public static boolean edit(Connection con, String table, String data, String where)
	{
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("UPDATE ? SET ?  WHERE ?");
			stm.setString(1, table);
			stm.setString(2, data);
			stm.setString(3, where);
			int rss = stm.executeUpdate();
			if(rss>0) {
				return true;
			}else {
				return false;
			}		
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	public static List fetchAll(Connection con, String table, String where)
	{
		PreparedStatement stm = null; 
		ResultSet rs = null ; 
		
		String label = String.format("|%3s|%20s|%20s|%20s|%20s|%20s|","id", "title", "summary", "content", "created_at", "ten_danh_muc");
		System.out.println(label);
		try {
			stm  = con.prepareStatement("SELECT * FROM t_bai_viet as b INNER JOIN t_danh_muc as d ON b.danh_muc_id = d.id ");
			rs = stm.executeQuery();
			return rs;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	public static int timIdDanhMuc(Connection con,String name) {
		int id=0;
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		
		try {
			stm = con.prepareStatement("SELECT * FROM  t_danh_muc WHERE ten_danh_muc LIKE name");
			rs = stm.executeQuery();
			if(rs.next()) {
				id = rs.getInt("id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			return 0;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return id;
		
		
	}
	
	public static void themBaiViet() {
		Connection con = DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Enter the Title: ");
		String title = input.nextLine();
		
		System.out.println("Enter the Summary: ");
		String summary = input.nextLine();
		
		System.out.println("Enter the content: ");
		String content = input.nextLine();
		
		String created_at = dt.format(now);
		
		System.out.println("Nhap ten danh muc: ");
		String tenDanhMuc = input.nextLine();
		
		int danh_muc_id = timIdDanhMuc(con,tenDanhMuc);
		
		if(danh_muc_id == 0) {
			System.out.println("Khong tim thay danh muc!");
			return;
		}else {
			try {
				stm = con.prepareStatement("INSERT INTO t_bai_viet(title, summary, content, created_at, danh_muc_id) VALUE(?, ?, ?, ?, ?)");
				stm.setString(1, title);
				stm.setString(2, summary);
				stm.setString(3, content);
				stm.setString(4, created_at);
				stm.setInt(5, danh_muc_id);
				int ins = stm.executeUpdate();
				if(ins >0) {
					System.out.println("Them bai viet thanh cong!");
				}else {
					System.out.println("That bai!");
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}finally {
				DBUtil.closeAll(con, stm, rs);
			}
		}
	
	}
	
	public static void viewAllBaiViet() {
		
		Connection con = (Connection) DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null ; 
		
		String label = String.format("|%3s|%20s|%20s|%20s|%20s|%20s|","id", "title", "summary", "content", "created_at", "ten_danh_muc");
		System.out.println(label);
		try {
			stm  = con.prepareStatement("SELECT * FROM t_bai_viet as b INNER JOIN t_danh_muc as d ON b.danh_muc_id = d.id ");
			rs = stm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title"); 
				String summary = rs.getString("summary");
				String content = rs.getString("content");
				String created_at = rs.getString("created_at");
				String ten_danh_muc = rs.getString("ten_danh_muc");
				
				String msg = String.format("|%3d|%20s|%20s|%20s|%20s|%20s|",id, title, summary, content, created_at, ten_danh_muc);
				System.out.println(msg);
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
}
