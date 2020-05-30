package chap_1.basic;

public class Getter_Setter {
	private String IdStudent;
	private String nameStudent;
	private String DOB;
	private String Major;
	
	public void  setID(String IdStudent) {
		this.IdStudent = IdStudent;
	}
	public String getID() {
		return IdStudent;
	}
	public void setName(String name) {
		this.nameStudent = name;
	}
	public String getName() {
		return nameStudent;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getDOB() {
		return DOB;
	}
	public void getMajor(String Major) {
		this.Major = Major;
	}
	public String setMajor() {
		return Major;
	}
}
