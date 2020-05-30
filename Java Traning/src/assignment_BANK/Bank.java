package assignment_BANK;

import java.lang.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
	ArrayList<Account> listAccount;
	Scanner input;
	File file = new File("MyData.txt");
	public Bank() {
		listAccount = new ArrayList<>();
		input = new Scanner(System.in);
		//load du lieu tu file luu tru
		if(!(file.exists())) {
			try {
				//file chua co
				file.createNewFile();
			}catch(IOException ex) {
				System.out.println("Loi khi tao file");
			}
		}else if(file.length() == 0) {
			//file da cho nhung khong co du lieu 
			System.out.println("File rong!");
		}else {
			//load du lieu -> lam 1 lan day nhat khi load chuong trinh  
			loadData();
		}
	}
	private void loadData() {
		try {
			ObjectInputStream objectIS = new ObjectInputStream(
					new FileInputStream(file));
			if(objectIS.available() != -1) {
				listAccount = (ArrayList<Account>) objectIS.readObject();
			}
			
			objectIS.close();
		}catch(Exception ex) {
			System.out.println("Loi khi try cap file!");
		}
		
	}
	public void createAccount(Account objAccount) {
		try {
			if(objAccount.getAccountBalance() < 100) {
				//so tien goi khong hop le->khong tao tai khoan
				throw new Exception("So tien phai gui > $100");
			}
			//luu tru tai khoan
			listAccount.add(objAccount); 
			//cap nhat lai du lieu trong file MyData.txt
			ObjectOutputStream objectOS = new ObjectOutputStream(
					new FileOutputStream(file));
			objectOS.writeObject(listAccount);
			objectOS.flush();
			objectOS.close();
			System.out.println("Tao tai khoan thanh cong!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void withdraw() {
		try {
			
			String accountNumber; 
			double amount; 
			double updateBalance = 0.0;
			boolean find = false;
			System.out.println("So tai khoan :");
			accountNumber = input.nextLine();
			System.out.println("So tien can rut: ");
			amount = input.nextDouble();
			accountNumber = input.nextLine();
			
			for(Account account : listAccount) {
				if(account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
					find = true; 
					//so tai khoan hop le;
					//cap nhap so tai khoan 
					updateBalance = account.getAccountBalance() - amount;
					if(updateBalance  < 500) {
						//so tien con lai trong tai khoan khong hop len
						//thong bao va khong cho rut
						System.out.println("So tien con lai khong hop le!");
						break;
					}
					
				}
				//cap nhap du lieu cua tai khaon vao file
				// cap nhat tai khoan trong Array List
				account.setAccountBalance(updateBalance);
				// luu ArrayLuist vao file
				ObjectOutputStream ost = new ObjectOutputStream(
						new FileOutputStream(file));
				ost.writeObject(listAccount);
				ost.flush();
				ost.close();
				if(find == false || updateBalance == 0.0) {
					System.out.println("Khong tim thay tai khoan!");
				}
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void display() {
		String accountNumber;
		System.out.println("Nhap tai khoan can tim: ");
		accountNumber = input.nextLine();
		for(Account account : listAccount) {
			
			if(account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				account.displayAccount();
			}
		}
	}
	
	public void displayList() {
		for(Account account:listAccount) {
			account.displayAccount();
		}
	}
	
	public void deposit() {
		
	}
}
