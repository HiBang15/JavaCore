package sinhvien;
import java.util.Scanner;

public class sinhvienPtit {
	private String maSV;
	private String hoTen; 
	private double diem; 
	private String xeploai;
	
	private static final int DIEM = 0; 
	private static final String XEPLOAI = "Chua xep loai";
	private static String Ma_SV = "Chua co ma SV";
	private static String HOTEN = "Chua co ho ten";
	
	sinhvienPtit(String maSV, String hoTen, double diem, String xeploai) {
		this.maSV = maSV; 
		this.hoTen = hoTen; 
		this.diem = diem; 
		this.xeploai = xeploai;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}
	
	
	
}
