package assignment_BANK;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Account account = new Account(); 
		int menu;
		do {
		System.out.println("1. Create a new account.");
		System.out.println("2. Withdraw cash.");
		System.out.println("3. Deposit cash");
		System.out.println("4. Display account details");
		System.out.println("5. Display list account.");
		System.out.println("6. Exit");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choice menu: ");
		menu = input.nextInt();
		input.nextLine();
		switch(menu) {
			case 1: 
				System.out.println("\tAccountNumber: ");
				account.setAccountNumber(input.nextLine());
				System.out.println("\tFirst Name: ");
				account.setFirstName(input.nextLine());
				System.out.println("\t Last Name: ");
				account.setLastName(input.nextLine());
				System.out.println("\tBalance: ");
				account.setAccountBalance(input.nextDouble());
				
				bank.createAccount(account);
				break;
			case 2: 
				bank.withdraw();
				break;
			case 3: 
				bank.deposit();
				break;
			case 4:
				bank.display();
				break;
			case 5: 
				bank.displayList();
				break;
			case 6:
				System.exit(0);
				break;
		}
		}while(menu !=6);
	}
}
