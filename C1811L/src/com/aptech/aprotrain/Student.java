package com.aptech.aprotrain;
import java.util.Scanner;
public class Student implements IStudent{
	private int id; 
	private String fullName; 
	private String email; 
	private float 	mark;
	Scanner input = new Scanner(System.in);
	public Student() {
		
	}
	public Student(int id, String fullName, String email, float mark) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	
	@Override
	public void input() {
		System.out.println("Student Information");
		System.out.println("ID Student: ");
		id=input.nextInt();
		input.nextLine();
		System.out.println("Full Name: ");
		fullName = input.nextLine();
		//check NAme
		while(!Check.isName(fullName)) {
			System.out.println("Full Name: ");
			fullName = input.nextLine();
		}
		System.out.println("Email: ");
		email = input.nextLine();
		//Check Email
		while(!Check.isEmail(email)) {
			System.out.println("Email: ");
			email = input.nextLine();
		}
		System.out.println("Mark: ");
		mark = input.nextFloat();
		input.nextLine();
		
	}
	@Override
	public void display() {
		System.out.println("ID: "+id +"\t| Full Name:" +fullName+"\t | Email" + email + "\t\t|Mark" + mark );
	}
}
