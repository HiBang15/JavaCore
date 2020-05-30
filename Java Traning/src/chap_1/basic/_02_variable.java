package chap_1.basic;

public class _02_variable {
	//TYPE
	public static void main(String[] args) {
		int n	   = 1;
		int b;
		b=2;
		double a   = 2017.01;
		String name  = "Kieu Tuan Long";
		
		System.out.println("n: "+n);
		System.out.println("a: " + a);
		System.out.println("name: " + name);
		System.out.println(b);
	}
	//CONSTANT
	public static void main02(String[] args) {
		final int AGE  = 19;
		System.out.println("AGE: " + AGE);
	}
	//VARIABLE
	public static void main01(String[] args) {
		//Khai bao bien
		/*int age;
		int year;
		char name;
		char city;*/
//		int age, year;
//		char name, city;
		
		//First name
//		char firstname;   //nomal
//		char  firstName;  //canelCase
//		char first_name;  //underscrores
//		char first-name;  //hyphen
		int age      =8;
		int year     =2019;
		char name    = 'n';
		
		System.out.print("age: " + age + "\n");
		System.out.println("year: "+year);
		System.out.println("name: "+name);
	}

}
