package Student_Assignment_Generic;

import static Student_Assignment_Generic.XepLoai.YEU;

import java.util.Map;

import static Student_Assignment_Generic.XepLoai.TB;
import static Student_Assignment_Generic.XepLoai.KHA;
import static Student_Assignment_Generic.XepLoai.GIOI;

public class Student< E extends Number> {
	private String rollNo; 
	private String fullName; 
	private Map<String, E> diem; 
	private double diemTB;
	public String getRollo() {
		return rollNo;
	}
	public void setRollo(String rollo) {
		this.rollNo = rollo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Map<String, E> getDiem() {
		return diem;
	}
	public void setDiem(Map<String, E> diem) {
		this.diem = diem;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public String getXepLoai() {
		if(this.diemTB < 5) {
			return YEU;
		}else if(5<= this.diemTB && this.diemTB <6.5) {
			return TB;
		}else if (6.5 <= this.diemTB && this.diemTB <= 8) {
            return KHA;
        } else {
            return GIOI;
        }
		
	}
	Student(){
		super();
	}
	
	Student(String rollNo, String fullName, Map<String, E> diem){
		this.rollNo = rollNo; 
		this.fullName = fullName; 
		this.diem = diem;
		
		Double sum =  diem.values().stream().map(a->a.doubleValue()).reduce((a,b) -> a+b).get();
		double diemTb = sum/diem.size();
		this.diemTB = diemTb;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", diem=" + diem + ", diemTB=" + diemTB + "]";
	}
	
	
	

}
