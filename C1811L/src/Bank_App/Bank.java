package Bank_App;
import java.util.*;
public class Bank extends Account{
	private static int nextAccount = 0; 
	private int maximumAccounts; 
	private int nextAccountNumber; 
	
	Account[] accounts;
//	ArrayList<Account> listAcc = new ArrayList();
	
	public Bank(int maximumAccount) {
		this.maximumAccounts = maximumAccount;
		accounts = new Account[maximumAccount];
	}
	
	public void displayAccountDetails(Account account) {
//		System.out.println("Customer Name: "+account.getCustomerName() + "|" + "Account Number: "
//							+account.getAccountNumber() + "|"+
//							"Account Balance"+account.getAccountBalance());
		account.toString();
	}
	
	public void createAccount() throws InsufficientFundsException{
		Scanner input = new Scanner(System.in);
			//		Account acc = new Account();
		String customerName, accountNumber; 
		double accountBalance;
		System.out.println("-----------------Create Account---------------");
		System.out.println("Customer Name: ");
		customerName = input.nextLine();
			//		acc.setCustomerName(customerName);
		System.out.println("Account Number: ");
		accountNumber = input.nextLine(); 
			//		acc.setAccountNumber(accountNumber);
		System.out.println("Account Balance: ");
		accountBalance = Double.parseDouble(input.nextLine());
			//		acc.setAccountBalance(accountBalance);
			//		listAcc.add(new Account(customerName, accountNumber, accountBalance));
		if(accountBalance < 100) throw new InsufficientFundsException("Balance < 100");
		accounts[nextAccount] = new Account(customerName, accountNumber, accountBalance);
		nextAccount++;
	}
	
	public void withdraw() throws  InsufficientFundsException{
		Scanner input = new Scanner(System.in);
		boolean check  = false;
		System.out.println("Nhap so tai khoan: ");
		String num = input.nextLine();
		if(Integer.parseInt(num) < 0) throw new InsufficientFundsException("Please account number > 0");
		for(Account a : accounts) {
			if(a.getAccountNumber().equalsIgnoreCase(num)) {
				check = true;
				System.out.println("Nhap so tien ban muon rut: ");
				double money = input.nextDouble();
				double sodu = a.getAccountBalance() - money;
				if( money < 100) throw new InsufficientFundsException("Please money > 100");
				if(sodu > 500) {
					a.setAccountBalance(sodu);
					System.out.println("Tai khoan"+a.getAccountNumber()+" vua rut: "+money);
					System.out.println("So tien con lai trong tai khoan la: "+a.getAccountBalance());
					System.out.println("Giao dich thanh cong");
				}else {
					System.out.println("ban khong du dieu kien rut tien!");
					System.out.println("Giao dich khong thanh cong");
				}	
			}else {
				System.out.println("Khong tim thay tai khoan cua ban!");
			}
		}
		if(check == false) throw new InsufficientFundsException("Account number exist !!!!");
	}
	
	public void deposit() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so tai khoan: ");
		String num = input.nextLine();
		if(Integer.parseInt(num) < 0) throw new InsufficientFundsException("Please account number > 0");
		for(Account a : accounts) {
			if(a.getAccountNumber().equalsIgnoreCase(num)) {
				System.out.println("Nhap so tien ban muon nap: ");
				double money = input.nextDouble();
				double sodu = a.getAccountBalance() + money;
				
					a.setAccountBalance(sodu);
					System.out.println("Tai khoan"+a.getAccountNumber()+" vua nap: "+money);
					System.out.println("So tien con lai trong tai khoan la: "+a.getAccountBalance());
					System.out.println("Giao dich thanh cong");
					
			}else {
				System.out.println("Khong tim thay tai khoan cua ban!");
			}
		}
	}
}
