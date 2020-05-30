package aptech;

public class Manage extends Employee implements Tax{
	
	private double bonus;

	public Manage(){
		
	}
	public Manage(String name, int age, double salary) {
		super(name, age, salary);
	}
	
	@Override
	public double calculateTax() {
		double tax = getSalary()*0.1;
		bonus = getSalary()*0.3;
		
		return getSalary() + bonus - tax ;
	}
	
	@Override
	public void display() {
		System.out.println("Name: "+this.getName() + "\t|"+"Age: "+this.getAge()
									+"\t|" + "Salary: "+getSalary() 
										+ "\t|"+"bonus: "+bonus);; 
	}
}
