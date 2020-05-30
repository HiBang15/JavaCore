package Bank_App;

import java.util.*;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum account in array : ");
        int max = Integer.parseInt(sc.nextLine());
        Bank b = new Bank(max);
        do{
            System.out.println("===========MENU============");
            System.out.println("1. Create account.");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("0. Exit");
            System.out.println("===========================");
            System.out.print("Enter your choice : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    try{
                        b.createAccount();
                    }catch (InsufficientFundsException e){
                        System.out.println(e.getMessage());
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Array index out of bounds");
                    }break;
                case 2:
                    try{
                        b.withdraw();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }break;
                case 3:
                    try{
                        b.deposit();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }break;
                case 0: System.exit(0);break;
            }
        }while (true);
	}
}
