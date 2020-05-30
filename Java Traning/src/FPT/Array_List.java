package FPT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array_List {
	ArrayList<String> list ;

	Array_List(){}
	public void setList(ArrayList list) {
		this.list = list;
	}
	public ArrayList<String> getList(){
		return this.list;
	}
//	Array_List(ArrayList<String> list){
//		this.list = list;
//	}
	public void hienthi() {
		System.out.println("Danh sach ten ban vua nhap la:");
		for(int i=0;i<list.size();i++) {
			int j=1;
			String name = list.get(i);
			System.out.println(j + ". "+name);
			j++;
		}
	}
	public void ngaunhien() {
		ArrayList<String> listName = new ArrayList<String>();
		 Collections.shuffle(list);
		for(int i=0;i<list.size();i++) {
			int j=1;
			String name = listName.get(i);
			System.out.println(j + ". "+name);
			j++;
		}
		
	}
	public static void main(String[] args) {
		
		ArrayList<String> listName = new ArrayList<String>();
		Scanner src = new Scanner(System.in);
		String name;
		Array_List ar = new Array_List();
		while(true){
			System.out.println("Name: ");
			name = src.nextLine();
			listName.add(name);
			
			System.out.println("Do you want to add name?(Y/N) ");
			if(src.nextLine().equals("N")) {
				break;
			}
		}
		ar.setList(listName);
		System.out.println("+-------------------------------------------------------+");
		System.out.println("+                         MENU                          +");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("1.Hien thi danh sach vua nhap.");
		System.out.println("2.Xuat danh sach ngau nhien");
		System.out.println("3.Hien thi danh sach theo thu tu giam dan");
		System.out.println("4.Tim va xoa ho ten nhap tu ban phim.");
		System.out.println("5.Ket thuc");
		int choose;
		choose = src.nextInt();
		switch(choose) {
			case 1: ar.hienthi();
			case 2: ar.ngaunhien();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main11(String[] args) {
//		ArrayList<Double> listDouble = new ArrayList<Double>();
//		String rs;
//		Scanner src = new Scanner(System.in);
//		
//		while(true) {
//			double x;
//			System.out.println("input x: ");
//			x = src.nextDouble();
//			listDouble.add(x);
//			System.out.println("Do you want to add to list?(Y/N)");
//			if(src.nextLine().equals("N")) {
//				break;
//			}
//		}
//		System.out.println("Mang ban vua nhap la: ");
//		for(int i=0; i<listDouble.size();i++) {
//			double a = listDouble.get(i);
//			System.out.print(a+"\t");
//		}
//	}
}
