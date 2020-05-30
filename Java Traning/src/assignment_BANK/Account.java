package assignment_BANK;

import java.io.Serializable;

public class Account implements Serializable {
	private String accountNumber;
	private String firstName; 
	private String lastName; 
	private double accountBalance;
	
	public Account() {
		
	}
	public Account(String accountNumber, String firstName, String lastNAme, double accountBalance) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void displayAccount() {
		System.out.println("+ Account Number: "+getAccountNumber() + 
				"\n+ First Name: "+getFirstName()+
				"\n+ Last Name: "+getLastName()+
				"\n+ Account Balance: "+getAccountBalance());
	}
	
	
}
