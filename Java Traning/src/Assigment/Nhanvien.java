package Assigment;

public abstract class Nhanvien {
	private String id; 
	private String hoten;
	private  double luong;
	
	Nhanvien(){}
	Nhanvien(String id,String hoten, double luong){
		this.id = id;
		this.hoten = hoten; 
		this.luong = luong;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getLuong() {
		return luong;
	}
//	public void setLuong(double luong) {
//		if(luong <9000000) {
//			this.luong = luong;
//		}
//		if(luong >=9000000 && luong<= 15000000) {
//			luong = luong*0.9;
//			this.luong = luong;
//		}
//		if(luong > 15000000) {
//			luong = luong *(1-0.12);
//			this.luong = luong;
//		}
//		
//	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	
	
}
