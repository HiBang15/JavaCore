package E10_2;

public class SavingsAccount {
	private static double annaulInterestRate ;
	private double savingsBalance;
	
	SavingsAccount(){
		
	}
	SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
//		SavingsAccount.annaulInterestRate = annaulInterestRate;
	}
	
	
	public double getAnnaulInterestRate() {
		return annaulInterestRate;
	}
	public void setAnnaulInterestRate(double annaulInterestRate) {
		SavingsAccount.annaulInterestRate = annaulInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest() {
		double rate; 
		rate = savingsBalance*annaulInterestRate/12;
		return rate;
		
	}
	
	public static double modifyInterestRate(double mRate) {
		return annaulInterestRate = mRate;
	}
}
