package E10_2;
import java.util.*;
public class test {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		SavingsAccount saver1 = new SavingsAccount( 2000);
		SavingsAccount saver2 = new SavingsAccount( 3000);
		SavingsAccount.modifyInterestRate(0.04);
		System.out.println("Saver 1: "+saver1.calculateMonthlyInterest());
		for(int i=0; i<12; i++) {
			double newBalance = saver1.getSavingsBalance() + saver1.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) +": " + newBalance);
			saver1.setSavingsBalance(newBalance);
		}
		System.out.println(saver1.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("Saver 1 new :" + saver1.calculateMonthlyInterest());
	}
}
