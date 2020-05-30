package T2_Ex1;

import java.util.Scanner;

public class People {
		private static int id = 100000; 
		private String phoneNo; 
		private String email; 
		private String fullName; 
		private Integer age;
		public People() {
			super();
		}
		public People(String phoneNo, String email, String fullName, int age) {
			this.id++;
			this.phoneNo = phoneNo; 
			this.email = email; 
			this.fullName = fullName; 
			this.age = age;
		}
		
		public static int getId() {
			return id;
		}

		public static void setId(int id) {
			People.id = id;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "ID: "+id+"  |  Phone Number: "+phoneNo+"  |  Email: "+email+"  |  Full Name: "+fullName+"  |  Age: "+age;
		}
		
		public void input() {
			Scanner src = new Scanner(System.in);
			System.out.println("+----------------Nhap thong tin------------------+");
			System.out.println("Phone Number: ");
			phoneNo = src.nextLine();
			while(true)
			{
				if(Validate.testPhone(phoneNo) == true) {
					break;
				}else {
					System.out.println("Phone Number: ");
					phoneNo = src.nextLine();
				}
			}
			System.out.println("Email: ");
			email = src.nextLine();
			while(true)
			{
				if(Validate.testEmail(email) == true) {
					break;
				}else {
					System.out.println("Email: ");
					email = src.nextLine();
				}
			}
			System.out.println("Full Name: ");
			fullName = src.nextLine();
			System.out.println("Age: ");
			age = src.nextInt();
			src.nextLine();
		}
	
}
