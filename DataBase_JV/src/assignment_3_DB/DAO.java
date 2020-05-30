package assignment_3_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class DAO {
	private static Scanner input = new Scanner(System.in);
	
	public static boolean themBaiViet(baiViet bv) {
		Connection con = DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("INSERT INTO t_bai_viet(title, summary, content, created_at, danh_muc_id) VALUE(?, ?, ?, ?, ?)");
			stm.setString(1, bv.getTitle());
			stm.setString(2, bv.getSummary());
			stm.setString(3, bv.getContent());
			stm.setDate(4, new java.sql.Date(bv.getCreated_at().getDate()));
			stm.setInt(5, bv.getDanh_muc_id());
			int ins = stm.executeUpdate();
			if(ins >0) {
				return true;
			}else {
				return false;
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		
	}
	
	public static List<baiViet> findAll(){
		List<baiViet> list = new ArrayList(); 
		Connection con = DBUtil.open(); 
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("SELECT * FROM t_bai_viet"); 
			rs = stm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title"); 
				String summary = rs.getString("summary");
				String content = rs.getString("content");
				java.util.Date created_at = rs.getDate("created_at");
				int danhMucId = rs.getInt("danh_muc_id");
				
				list.add(new baiViet(title, summary, content, (java.sql.Date) created_at, danhMucId));
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return list;
	}
	
	
	public static List<danhMuc> findAllDanhMuc(){
		List<danhMuc> list = new ArrayList(); 
		Connection con = DBUtil.open(); 
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("SELECT * FROM t_danh_muc"); 
			rs = stm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String ten_danh_muc = rs.getString("ten_danh_muc"); 
				
				list.add(new danhMuc(id, ten_danh_muc));
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return list;
	}
	
	public static baiViet findByTitle(String name) {
		baiViet bv = null;
		Connection con = DBUtil.open(); 
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement("SELECT * FROM WHERE title = ?");
			stm.setString(1, "%"+name+"%");
			rs = stm.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title"); 
				String summary = rs.getString("summary");
				String content = rs.getString("content");
				java.util.Date created_at = rs.getDate("created_at");
				int danhMucId = rs.getInt("danh_muc_id");
				
				bv = new baiViet(title, summary, content, (java.sql.Date) created_at, danhMucId);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return bv;
	}
}
