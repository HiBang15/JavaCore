package Assignment_2_Student;

import java.util.Scanner;

public class Student {
	private String rollNo; 
	private String fullName;  
	private String className;
	private float diemToan; 
	private float diemLy;
	private float diemHoa; 
	private float diemVan; 
	private float diemAnh;
	private float diemTrungBinh; 
	private String xepLoai;
	
	Student(){
		super();
	}
	
	public Student(String rollNo, String fullName,String className, float diemToan, float diemLy
			, float diemHoa, float diemVan, float diemAnh) {
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.className = className;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemAnh = diemAnh; 
		this.diemVan = diemVan;
		this.diemTrungBinh = (diemToan + diemLy+diemHoa+diemVan+diemAnh)/5;
		if(this.diemTrungBinh < 5) {
			this.xepLoai = "YEU";
		}else if(this.diemTrungBinh >=5 && this.diemTrungBinh <6.5) {
			this.xepLoai = "Trung binh";
		}else if(this.diemTrungBinh >=6.5 && this.diemTrungBinh <8){
			this.xepLoai = "Kha";
		}else if( this.diemTrungBinh >=8 && this.diemTrungBinh <9) {
			this.xepLoai = "Gioi";
		}else if(this.diemTrungBinh >=9 && this.diemTrungBinh < 10) {
			this.xepLoai = "Xuat sac";
		}
		
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public float getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}
	public float getDiemAnh() {
		return diemAnh;
	}
	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", diemToan=" + diemToan + ", diemLy=" + diemLy
				+ ", diemHoa=" + diemHoa + ", diemVan=" + diemVan + ", diemAnh=" + diemAnh + ", diemTrungBinh="
				+ diemTrungBinh + ", xepLoai=" + xepLoai + "]";
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("id: ");
		rollNo = in.nextLine();
		System.out.println("Full Name: ");
		fullName = in.nextLine();
		System.out.println("Class Name: ");
		className = in.nextLine();
		System.out.println("Diem Toan");
		diemToan = Float.parseFloat(in.nextLine());
		System.out.println("Diem Ly: ");
		diemLy = Float.parseFloat(in.nextLine());;
		System.out.println("Diem Hoa: ");
		diemHoa = Float.parseFloat(in.nextLine());
		System.out.println("Diem Van: ");
		diemVan = Float.parseFloat(in.nextLine());;
		System.out.println("Diem Anh: ");
		diemAnh = Float.parseFloat(in.nextLine());
	}
	
}
