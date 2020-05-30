package Merchants_Bank;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Bank {
	private int lastAccountNumber;
//	Account[] account;
	ArrayList<Account> listAccount;
	Scanner input;
	File file = new File("Merchants_Bank.txt");
	
	public Bank() {
		listAccount = new ArrayList<>();
		input = new Scanner(System.in);
		
		if(!(file.exists())) {
			try {
				//file chua co
				file.createNewFile();
			}catch(IOException e) {
				System.out.println("Loi khi tao file!");
			}
		}else if(file.length() == 0) {
			System.out.println("File rong!");
		}else {
			//Load du lieu
			loadData();
		}
	}
	
	private void loadData() {
		try {
			ObjectInputStream ObjectIS = new ObjectInputStream(
					new FileInputStream(file));
			if(ObjectIS.available() == -1) {
				listAccount = (ArrayList<Account>) ObjectIS.readObject();
			}
			ObjectIS.close();
		}catch(Exception e) {
			System.out.println("Loi truy cap file");
		}
	}
	public void CreateAccount(Account account) {
		try {
			if(account.getAccountBalance() <100) {
				throw new Exception("So tien phai gui > 100");
			}
			listAccount.add(account);
			ObjectOutputStream ObjectOS = new ObjectOutputStream(
					new FileOutputStream(file));
			ObjectOS.writeObject(account);
			ObjectOS.flush();
			ObjectOS.close();
			System.out.println("Tao tai khoan thanh cong!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void withdraw() {
		try {
			int accountNumber;
			double amount;
			double updateBalance = 0; 
			boolean find = false;
			
			System.out.println("Nhap so tai khoan: ");
			accountNumber = input.nextInt();
			System.out.println("Nhap so tien muon rut: ");
			amount = input.nextDouble();
			
			for(Account acc : listAccount) {
				if(acc.getAccountNumber()==accountNumber) {
					find = true;
					updateBalance = acc.getAccountBalance() - amount;
					if(updateBalance < 500) {
						System.out.println("So tien con lai khong hop le!\nGiao dich khong thanh cong!");
						break;
					}
					//cap nhap du lieu vao file
					acc.setAccountBalance(updateBalance);
					//Luu ArrayList vao file
					ObjectOutputStream ost = new ObjectOutputStream(
							new FileOutputStream(file));
					ost.writeObject(listAccount);
					ost.flush();
					ost.close();
				}
				
			}
			if(find == false || updateBalance == 0.0) {
				System.out.println("Khong co tai khoan.");
			}else {
				System.out.println("Rut tien thanh cong!");
				System.out.println("So du trong tai khoan"+updateBalance);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deposit() {
		try {
			int accountNumber;
			double amount;
			double updateBalance = 0; 
			boolean find = false;
			
			System.out.println("Nhap so tai khoan: ");
			accountNumber = input.nextInt();
			System.out.println("Nhap so tien muon nap: ");
			amount = input.nextDouble();
			
			for(Account acc : listAccount) {
				if(acc.getAccountNumber() == accountNumber) {
					find = true;
					updateBalance = amount + acc.getAccountBalance();
				}
				acc.setAccountBalance(updateBalance);
				
				ObjectOutputStream ost = new ObjectOutputStream(
						new FileOutputStream(file));
				ost.writeObject(listAccount);
				ost.flush();
				ost.close();
			}
			if(find = false) {
				System.out.println("Khong tim thay tai khoan!");
			}else {
				
				System.out.println("Giao dich thanh cong!");
				System.out.println("so du trong tai khoan cua ban la: "+updateBalance);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void display() {
		int accountNumber;
		System.out.println("Nhap tai khoan can tim: ");
		accountNumber = input.nextInt();
		for(Account account : listAccount) {
			if(account.getAccountNumber() == accountNumber) {
				account.displayAccount();
			}
		}
	}
	public void displayList() {
		for(Account acc : listAccount) {
			acc.displayAccount();
		}
	}
	
}
