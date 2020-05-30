package Merchants_Bank;

import java.io.Serializable;

public class Account implements Serializable{
	private int accountNumber;
	private String firstName;
	private String lastName;
	private double accountBalance;
	
	Account(){
		
	}
	Account(int aaccountNumber, String firstName, String lastName, double accountBalance){
		this.accountNumber = accountNumber;
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
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
