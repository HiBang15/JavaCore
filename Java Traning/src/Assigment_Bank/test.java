package Assigment_Bank;
import java.util.Scanner;
public class test {
	public static void main(String[] args) throws Throwable {
		Account acc = new Account(11111111,"Long",20000);
//		Account acc = new Account();
		Scanner src = new Scanner(System.in);
		Bank bank =  new Bank();
		int accNum;
		double amount;
//		System.out.println("Nhap so tai khoan: ");
//		accNum = src.nextInt();
		//Rut tien
		
		System.out.println("Nhap so tien muon rut");
		amount = src.nextDouble();
			try {
				bank.displayAccountDetail(acc);
				bank.withdraw(11111111,amount);
				System.out.println("Ban vua rut: "+amount);
				System.out.println("So du trong tai khoan ban la: "+acc.getBalance());
			}catch(Exception e) {
				System.out.println(e.getCause().getMessage());
			}
		/*System.out.println("So tien ban muon nap: ");
		amount = src.nextDouble();
		bank.deposit(11111111, amount);
		System.out.println("So tien "+amount+" duoc ban nap vao so tai khoan "+acc.getAccountNumber());
		System.out.println("So du trong tai khoan cua ban la: "+acc.getBalance());*/
			
	}
}
