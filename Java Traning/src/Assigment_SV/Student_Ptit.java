package Assigment_SV;
import java.util.Scanner;
public abstract class Student_Ptit {
	private String MaSV;
	private String TenSV; 
	private String NganhHoc; 
	private String LopHoc;
	
	
	//Ham tao tham so
	
	public void setSV() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		MaSV = scr.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		TenSV = scr.nextLine(); 
		System.out.println("Nganh hoc: ");
		NganhHoc = scr.nextLine();
		System.out.println("Lop: ");
		LopHoc = scr.nextLine();
	}
	public void viewSv() {
		System.out.println("+---------------------------------------------------------+");
		System.out.println("Thong tin cua sinh vien");
		System.out.println("Ma sinh vien: "+MaSV);
		System.out.println("Ten sinh vien: "+TenSV);
		System.out.println("Nganh: "+NganhHoc);
		System.out.println("Lop: "+LopHoc);
	}
	Student_Ptit(String MaSV, String TenSV, String NganhHoc, String LopHoc){
		this.MaSV = MaSV; 
		this.TenSV = TenSV; 
		this.NganhHoc = NganhHoc; 
		this.LopHoc = LopHoc;
	}
	public abstract void diemtrungbinh();
}
