package C1811L;

public class Employee extends Person {
	private double salary;
	private int year_start;
	private String national_insuarace_num;

	Employee(String name,double salary,int year_start,  String national_insuarace_num){
		super(name);
		this.year_start = year_start;
		this.national_insuarace_num = national_insuarace_num;
		this.salary=salary;
		
	}
	public void setSalary(double _salary) {
		this.salary = _salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setYear(int _year_start) {
		this.year_start = _year_start;
	}
	public int getYear() {
		return year_start;
	}
	public void setNum(String _national_insuarace_num) {
		this.national_insuarace_num = _national_insuarace_num;
	}
	public String getNum() {
		return national_insuarace_num;
	}
}
