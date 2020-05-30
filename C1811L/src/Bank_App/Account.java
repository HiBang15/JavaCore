package Bank_App;

public class Account {
	private String customerName; 
	private String accountNumber; 
	private double accountBalance;
	
	public Account() {
		
	}
	public Account(String customerName, String accountNumber, double accountBalance) {
		this.customerName = customerName; 
		this.accountNumber =  accountNumber; 
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
