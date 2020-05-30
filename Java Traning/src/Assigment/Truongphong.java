package Assigment;

public class Truongphong extends Nhanvien{
	
	private double trachnhiem;

	public double getTrachnhiem() {
		return trachnhiem;
	}

	public void setTrachnhiem(double trachnhiem) {
		this.trachnhiem = trachnhiem;
	}
	public void viewNV() {
		System.out.println("Ma nhan vien: "+getId());
		System.out.println("Ho va ten: "+getHoten());
		System.out.println("Luong: "+getLuong());
	}
}
