package aptech;

import java.util.*;

public class Person {
	private String name; 
	private int age;
	Scanner input = new Scanner(System.in);
	public Person() {
		
	}
	Person(String name, int age){
		this.name = name; 
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {
		System.out.println("Fill the information!");
		System.out.println("Name: ");
		name = input.nextLine();
		System.out.println("Age: ");
		age = input.nextInt();
		input.nextLine();
	}
	
	public void display() {
		System.out.println("Name: "+this.getName() + "\t|"+"Age: "+this.getAge());
	}
}
