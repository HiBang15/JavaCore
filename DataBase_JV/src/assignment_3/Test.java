package assignment_3;

public class Test {
	public static void main(String[] args) {
		
		int a = DAO.timIdDanhMuc(DBUtil.open(), "Xa hoi");
		System.out.println(a);
	}
}
