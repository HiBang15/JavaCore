package aptech;

import java.util.*;

public class Employee  extends Person{

	private double salary;
	public Employee() {
		
	}
	Employee(String name, int age, double salary){
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		this.salary = d;
	}
	public double increaseSalary(int x){
        salary = salary + x;
        return salary;
    }
    public double increaseSalary(double x){
        salary = salary * x;
        return salary;
    }

	
}
