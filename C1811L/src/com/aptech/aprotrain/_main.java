package com.aptech.aprotrain;
import java.util.*;

public class _main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		StudentManagement s = new StudentManagement() {};
		int choose;
		do {
			System.out.println("+----------------Menu---------------+");
			System.out.println("1. Add Student");
			System.out.println("2. Show All");
			System.out.println("3.Sort");
			System.out.println("4. Exit");
			choose = src.nextInt();
			
			switch(choose) 
			{
				case 1:s.addStudent();break;
				case 2:s.showStudent();break;
				case 3:s.sortStudentByMark();break;
				case 4:System.exit(0);break;
			}
		}while(choose != 4 );
		
	}
}
