//package Assignment_1;
//import java.util.Scanner;
//public class _main {
//	public static void main(String[] args) {
//		double luongtrungbinh, luong; 
//		Scanner src = new Scanner(System.in);
//		System.out.println("Nhap so nhan vien: ");
//		int sonhanvien = src.nextInt();
//		People[] listP = new People[sonhanvien];
//		System.out.println("Nhap thong tin cho nhan vien: ");
//		for(int i=0; i<sonhanvien ; i++) {
//			System.out.println("Nhap thong tin nhan vien thu"+(i+1)+" :");
//			System.out.println("Chon loai nhan vien:\n1. Tiep Thi \n2.Truong phong ");
//			int choose = src.nextInt();
//			
//			if(choose == 1) {
//				listP[i] = new Employees();
//			}else if(choose == 2) {
//				listP[1] = new Leader();
//			}
//			listP[i].Input();
//			listP[i].tinhluong();
//		}
//		System.out.println("+------------------------------------------------------+");
//		System.out.println("Thong tin nhan vien cong ty!");
//		for(int i=0; i<sonhanvien; i++) {
//			System.out.println(listP[i].toString()2);
//		}
//	}
//}
