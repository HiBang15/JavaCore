package Assigment_Bank;
import java.util.Scanner;
public class Bank  {
//	private Account acc;
//	private static int accNumber = 1000000;
	private String bankId; 
	private String bankName; 
	private String branch;
	
	Bank(){
		
	}
	Bank(String bankId, String bankName, String branch){
		this.bankId = bankId; 
		this.bankName = bankName; 
		this.branch = branch;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
//	public Account getAcc() {
//		return acc;
//	}
//	public void setAcc(Account acc) {
//		this.acc = acc;
//	}
	public void displayAccountDetail(Account account) {
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Full Name: "+account.getName());
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Bank code: "+this.bankId);
		System.out.println("Bank Name: "+this.bankName);
		System.out.println("Branch: "+this.branch);
	}
	
	public void createAccount(String userName, double balance) {
//		int accountNumber ;
//		accountNumber = this.accNumber++;
//			Account user = new Account(accountNumber , userName,balance  );
	}
	
	public void withdraw(int accNum,double amount) throws Throwable{
		
//		Account acc = new Account(11111111,"Long",20000);
//		Scanner input = new Scanner(System.in);
		Account acc = new Account();
 
		
		
		if(accNum == acc.getAccountNumber()) {
			if(amount > acc.getBalance()) {
				throw new BankException().initCause(new Exception("vuot qua so tien trong tai khoan"));
			}
			else {
				double AccountBalance;
				AccountBalance = acc.getBalance() - amount;
				acc.setBalance(AccountBalance);
			}
		}
//		else {
//			throw new  AccountException().initCause(new Exception ("Khong ton tai tai khoan!"));
//		}
		
		
		
	}
	public void deposit(int accountNumber,double amount) {
		Account acc = new Account();
		if(accountNumber == acc.getAccountNumber()) {
			double AccountAmount; 
			AccountAmount = amount+acc.getBalance();
			acc.setBalance(AccountAmount);
		}
	}
}
