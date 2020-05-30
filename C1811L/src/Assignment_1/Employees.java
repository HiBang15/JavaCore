package Assignment_1;

public class Employees extends People {	
	private double hoahong; 
	private double doanhso; 
	
	public Employees(String ID, String Name, double Salary, double hoahong, double doanhso) {
		super(ID, Name, Salary);
		this.hoahong = hoahong; 
		this.doanhso = doanhso;
	}
	
	public Employees() {
		super();
	}

	public double getHoahong() {
		return hoahong;
	}

	public void setHoahong(double hoahong) {
		this.hoahong = hoahong;
	}

	public double getDoanhso() {
		return doanhso;
	}

	public void setDoanhso(double doanhso) {
		this.doanhso = doanhso;
	}

	@Override
	public void Input() {
		super.Input();
		System.out.println("Doanh so: ");
		doanhso = input.nextDouble();
		System.out.println("Hoa hong: ");
		hoahong = input.nextDouble();
	}
	@Override
	public double tinhluong() {
		this.luong = this.Salary + this.Salary * this.doanhso + this.Salary*this.hoahong; 
		return this.luong;
	}

	@Override
	public String toString() {
		return super.toString()+"Employees [hoahong=" + hoahong + ", doanhso=" + doanhso + "]";
	}
	
	
}
	
