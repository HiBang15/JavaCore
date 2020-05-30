package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAO{
	private int lastID; 
	
	public int getLastID() {
		return lastID;
	}

	private static Connection con = DBUtil.open();
	public boolean insert(String sql)
	{
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		try {
			stm = con.prepareStatement(sql);
			int rss = stm.executeUpdate();
			rs = stm.getGeneratedKeys();
			this.lastID = rs.getInt(1);
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


	public static boolean edit(String table, String data, String where)
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

	public static boolean delete(String table, String where)
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
}
