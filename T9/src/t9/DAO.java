package t9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAO {
	public static List<Follower> findAllFollower(){
		List<Follower> list = new ArrayList();
		
		Connection con = DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		
		try {
			stm = con.prepareStatement("SELECT * FROM tb_followers");
			rs = stm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String full_name = rs.getString("full_name");
				
				list.add(new Follower(id, full_name));
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return list;
	}
	
	public static List<Post> findAllPost(){
		List<Post> list = new ArrayList();
		
		Connection con = DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		
		try {
			stm = con.prepareStatement("SELECT * FROM tb_posts");
			rs = stm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				int noOfLike   = rs.getInt("noOfLike");
				Date created_at = rs.getDate("created_at");
				
				list.add(new Post(id, title, content, noOfLike, created_at));
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return list;
	}	
	
	public static boolean addNewFollower(Follower fl) {
		Connection con = DBUtil.open();
		PreparedStatement stm = null;
		ResultSet rs  = null ; 
		
		try {
			stm = con.prepareStatement("INSERT INTO tb_followers(id, full_name) VALUE(?,?)");
			stm.setInt(1, fl.getId());
			stm.setString(2, fl.getFullName());
			
			int kq = stm.executeUpdate();
			
			if(kq>0) {
				return true;
			}else {
				return true;
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	
	public static boolean addNewPost(Post p) {
		Connection con = DBUtil.open();
		PreparedStatement stm = null;
		ResultSet rs  = null ; 
		
		try {
			stm = con.prepareStatement("INSERT INTO tb_post(id, title, content, noOfLike, created_at) VALUE(?,?,?,?,?)");
			stm.setInt(1, p.getId());
			stm.setString(2, p.getTitle());
			stm.setString(3, p.getContent());
			stm.setInt(4, p.getNoOfLike());
			stm.setDate(5, new java.sql.Date(p.getCreated_at().getTime()));
			
			int kq = stm.executeUpdate();
			
			if(kq>0) {
				return true;
			}else {
				return true;
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	
	public static Post findByTitle(String tit) {
		Post p = null; 
		Connection con = DBUtil.open();
		PreparedStatement stm = null;
		ResultSet rs  = null ; 
		
		try {
			stm = con.prepareStatement("SELECT * FROM  tb_posts WHERE title LIKE ?");
			stm.setString(1, "%"+tit+"%");
			
			rs = stm.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				int noOfLike   = rs.getInt("noOfLike");
				Date created_at = rs.getDate("created_at");
				
				p=new Post(id, title, content, noOfLike, created_at);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
		return p;
		
	}
	
	
		
}
