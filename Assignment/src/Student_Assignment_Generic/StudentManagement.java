package Student_Assignment_Generic;
import java.util.*;
//import java.util.Scanner;
public class StudentManagement {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
//		List<diem> listD = new ArrayList<>();
		Student<Float> std = new Student();
		List<Student< Float>> ListStd = new ArrayList();
		
		Student newStd = CreateNewStd(ListStd);
		ListStd.add(newStd);
		ListStd.forEach(a->System.out.println(a));
	}
	private static void hienThi(List<Student <Float>> listStd) {
		for(Student s : listStd ) {
			s.toString();
		}
		
	}
	private static Student CreateNewStd(List<Student<Float>> listStd) {
			Student<Float> std = new Student();
			Map<String, Float> diems = new HashMap();
			
			System.out.println("Roll Number: ");
			String rollNo = NhapRoll(listStd);
			
			System.out.println("Full Name: ");
			String fullName = in.nextLine();
			

			int soDiem;  
			System.out.println("Nhap so diem ban muon them");
			soDiem = nhapInt();
			for(int j=0; j<soDiem; j++)
			{
				System.out.println("Nhap ten mon hoc: ");
				String name = in.nextLine();
				System.out.println("Diem: ");
				float score = nhapFloat();
				diems.put(name,  score);
			}
			
			return new Student(rollNo, fullName, diems);
			
	}
	private static float nhapFloat() {
		while (true) {
            try {
                return Float.parseFloat(in.nextLine());
            } catch (Exception ex) {
                System.out.println("Huuu, nhap lai di");
            }
        }
	}
	private static int nhapInt() {
		while (true) {
            try {
                return Integer.parseInt(in.nextLine());
            } catch (Exception ex) {
                System.out.println("Huuu, nhap lai di");
            }
        }
	}
	private static String NhapRoll(List<Student<Float>> listStd) {
		while(true) {
			String roll = in.nextLine();
			long count = listStd.stream().filter(a -> a.getRollo().equals(roll)).count();
			if(count>0) {
				System.out.println("Roll Number da ton tai!");
				continue;
			}
			return roll;
		}
	}
}
