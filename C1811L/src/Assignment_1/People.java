package Assignment_1;
import java.util.Scanner;
public class People {
	private String ID; 
	private String Name; 
	protected double Salary;
	protected double luong;
	
	Scanner input = new Scanner(System.in);
	public People() {
		super();
	}
	
	public People(String ID, String Name, double Salary) {
		this.ID = ID; 
		this.Name = Name; 
		this.Salary = Salary;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	public void Input() {
		System.out.println("ID: ");
		ID = input.nextLine();
		System.out.println("Name: ");
		Name = input.nextLine();
		System.out.println("Salary: ");
		Salary = input.nextDouble();
		
	}
	public double tinhluong() {
		return 0;
	}
//	public void Display() {
//		System.out.print("ID: "+this.ID + "\tName: "+this.Name + "\tSalary: "+this.Salary );
//	}
	
	@Override
	public String toString() {
		return "People [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", luong=" + luong 
				+ "]";
	}
}
