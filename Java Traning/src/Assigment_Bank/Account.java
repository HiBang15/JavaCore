package Assigment_Bank;

public class Account {
	private String idAcc; 
	private String name; 
	private double balance;
	private int accountNumber;
	Account(){}
	Account(int accountNumber, String name, double balance){
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		
	}
	
	public String getIdAcc() {
		return idAcc;
	}
	public void setIdAcc(String idAcc) {
		this.idAcc = idAcc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
//	public void withdraw(int accNum,double amount) throws Throwable{
//		double bal;
////		Account acc = new Account();	
//		if(accNum == getAccountNumber()) {
//			if(amount > getBalance()) {
//				throw new BankException().initCause(new Exception("vuot qua so tien trong tai khoan"));
//			}
//			else {
//				
//				bal = getBalance() - amount;
//				setBalance(bal);
//			}
//		}
////			else {
////			throw new  AccountException().initCause(new Exception ("Khong ton tai tai khoan!"));
////		}
//		
//	}
	
}
