package Assignment_2_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
	public static void findAll(){
		List<Student> list = new ArrayList<>();
		Connection con = (Connection) DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null;
		try {
			stm = con.prepareStatement("SELECT rollNo, fullName, className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai FROM tb_student");
			rs = stm.executeQuery();
			while(rs.next()) {
				String rollNo = rs.getString("rollNo");
				String fullName = rs.getString("fullName");
				String className = rs.getString("className");
				float diemToan = rs.getFloat("diemToan");
				float diemLy = rs.getFloat("diemLy");
				float diemHoa = rs.getFloat("diemHoa");
				float diemVan = rs.getFloat("diemVan");
				float diemAnh = rs.getFloat("diemAnh");
				float TB = rs.getFloat("TB");
				String xepLoai = rs.getString("xepLoai");
				
//				list.add(new Student(rollNo, fullName, className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai));
				String msg = String.format("|%10s|%26s|%10s|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10s|",rollNo, fullName,className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai );
				System.out.println(msg);
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	
	public static void findByName(String name) {
		Student std = null;
		Connection con = (Connection) DBUtil.open();
		PreparedStatement stm = null; 
		ResultSet rs = null; 
		
		try {
			stm = con.prepareStatement("SELECT rollNo, fullName, className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai FROM tb_student WHERE fullName Like ?");
			stm.setString(1,"%"+ name+"%");
			rs = stm.executeQuery();
			if(rs.next()) {
				String rollNo = rs.getString("rollNo");
				String fullName = rs.getString("fullName");
				String className = rs.getString("className");
				float diemToan = rs.getFloat("diemToan");
				float diemLy = rs.getFloat("diemLy");
				float diemHoa = rs.getFloat("diemHoa");
				float diemVan = rs.getFloat("diemVan");
				float diemAnh = rs.getFloat("diemAnh");
				float TB = rs.getFloat("TB");
				String xepLoai = rs.getString("xepLoai");
				
				String msg = String.format("|%10s|%26s|%10s|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10s|",rollNo, fullName,className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai );
				System.out.println(msg);
				
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			DBUtil.closeAll(con, stm, rs);
		}
	}
	
	public static boolean AddNewStd(Student std) {
		String rollNo = std.getRollNo(); 
		String fullName = std.getFullName(); 
		String className = std.getClassName();
		float diemToan   = std.getDiemToan();
		float diemLy   = std.getDiemLy();
		float diemHoa   = std.getDiemHoa();
		float diemVan   = std.getDiemVan();
		float diemAnh   = std.getDiemAnh();
		float TB   = std.getDiemToan();
		String xepLoai = std.getXepLoai();
		
		Connection con = (Connection) DBUtil.open();
		PreparedStatement stm = null; 
		
		try {
			stm = con.prepareStatement("INSERT INTO tb_student(rollNo, fullName, className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai) VALUE(?, ?,?, ?,?, ?,?, ?,?, ?)");
			stm.setString(1,rollNo);
			stm.setString(2, fullName);
			stm.setString(3, className);
			stm.setFloat(4, diemToan);
			stm.setFloat(5, diemLy);
			stm.setFloat(6, diemHoa);
			stm.setFloat(7, diemVan);
			stm.setFloat(8, diemAnh);
			stm.setFloat(9, TB);
			stm.setString(10, xepLoai);
			
			int rs = stm.executeUpdate();
			if(rs>0) {
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
	
	public static boolean DeleteStd(String roll) {
        Connection con = DBUtil.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("delete from t_user where id=?");
            stm.setString(1, roll); 

            int kq = stm.executeUpdate();
            if (kq > 0) {
                return true;
            }else {
            	return false;
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
            return false;
        } finally {
            DBUtil.closeAll(con, stm, null);
        }

	}
	
	public static void UpdateStd(String roll) {
		Scanner in =  new Scanner(System.in);
		Connection con = DBUtil.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
		try {
            stm = con.prepareStatement("select* from t_user where id=?");
            stm.setString(1, roll); 
            rs = stm.executeQuery();
            int kqq = stm.executeUpdate();
            
            if (rs.next() ) {
                System.out.println("Tim thay thong tin ");
                
                String rollNo = rs.getString("rollNo");
				String fullName = rs.getString("fullName");
				String className = rs.getString("className");
				float diemToan = rs.getFloat("diemToan");
				float diemLy = rs.getFloat("diemLy");
				float diemHoa = rs.getFloat("diemHoa");
				float diemVan = rs.getFloat("diemVan");
				float diemAnh = rs.getFloat("diemAnh");
				float TB = rs.getFloat("TB");
				String xepLoai = rs.getString("xepLoai");
				
				String msg = String.format("|%10s|%26s|%10s|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10.2f|%10s|",rollNo, fullName,className, diemToan, diemLy, diemHoa, diemVan, diemAnh, TB, xepLoai );
				System.out.println(msg);
				
				String id,fullN,classN;
				float toan, ly, hoa, van, anh;
				System.out.println("id: ");
				id = in.nextLine();
				System.out.println("Full Name: ");
				fullN = in.nextLine();
				System.out.println("Class Name: ");
				classN = in.nextLine();
				System.out.println("Diem Toan");
				toan = Float.parseFloat(in.nextLine());
				System.out.println("Diem Ly: ");
				ly = Float.parseFloat(in.nextLine());;
				System.out.println("Diem Hoa: ");
				hoa = Float.parseFloat(in.nextLine());
				System.out.println("Diem Van: ");
				van = Float.parseFloat(in.nextLine());;
				System.out.println("Diem Anh: ");
				anh = Float.parseFloat(in.nextLine());
				Student std = new Student(id, fullN, classN, toan, ly, hoa, van, anh);
				
				stm = con.prepareStatement("UPDATE t_user SET  fullName=?, className=?, diemToan=?, diemLy=?, diemHoa=?, diemVan=?, diemAnh=?, TB=?, xepLoai=? WHERE id=?");
				stm.setString(10,rollNo);
				stm.setString(1, std.getFullName());
				stm.setString(2, std.getClassName());
				stm.setFloat(3, std.getDiemToan());
				stm.setFloat(4, std.getDiemLy());
				stm.setFloat(5, std.getDiemHoa());
				stm.setFloat(6, std.getDiemVan());
				stm.setFloat(7, std.getDiemAnh());
				stm.setFloat(8, std.getDiemTrungBinh());
				stm.setString(9, std.getXepLoai());
				
				int check = stm.executeUpdate();
				if(check > 0) {
					System.out.println("Thanh cong!");
				}else {
					System.out.println("Khong thanh cong!");
				}
				
            }else {
            	System.out.println("Not Fornd");
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
        } finally {
            DBUtil.closeAll(con, stm, null);
        }
	}
}
