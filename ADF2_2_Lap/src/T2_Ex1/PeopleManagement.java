package T2_Ex1;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

class PeopleManagement {
	List<People> listP = new ArrayList<>();
	
//	public static void input() {
//		Scanner src = new Scanner(System.in);
//		String phoneNo,email,fullName;
//		Integer age;
//		People p = new People();
//		System.out.println("+----------------Nhap thong tin------------------+");
//		System.out.println("Phone Number: ");
//		phoneNo = src.nextLine();
//		while(true)
//		{
//			if(Validate.testPhone(phoneNo) == true) {
////				System.out.println("123");
//				p.setPhoneNo(phoneNo);
//				break;
//			}else {
//				System.out.println("Phone Number: ");
//				phoneNo = src.nextLine();
//			}
//		}
//		System.out.println("Email: ");
//		email = src.nextLine();
//		while(true)
//		{
//			if(Validate.testEmail(email) == true) {
//				p.setEmail(email);
//				break;
//			}else {
//				System.out.println("Email: ");
//				email = src.nextLine();
//			}
//		}
//		System.out.println("Full Name: ");
//		fullName = src.nextLine();
//		p.setFullName(fullName);
//		System.out.println("Age: ");
//		age = src.nextInt();
//		src.nextLine();
//		p.setAge(age);
//	}
	
	public void inputList() {
		People p = new People();
		System.out.println("+------------Nhap thong  tin danh sach-------------+");
		for(int i=0; i<5; i++) {
			p.input();
			People s = new People(p.getPhoneNo(), p.getEmail(), p.getFullName(), p.getAge());
//			System.out.println(s);
			listP.add(s);
		}
	}
	
	public void hienThiThongTin() {
		System.out.println("+----------------Danh sach-------------------+");
		for(People p : listP) {
			System.out.println(p);
		}
	}
	
	public void ageMax() {
		Collections.sort(listP, (p1,p2) -> p1.getAge().compareTo(p2.getAge()));
		System.out.println(listP.get(0));
	}
	
	public void ageMin() {
		Collections.sort(listP, (p1,p2) -> p2.getAge().compareTo(p1.getAge()));
		System.out.println(listP.get(0));
	}
	
}
