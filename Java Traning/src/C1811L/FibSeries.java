package C1811L;
import java.util.Scanner;
public class FibSeries {
	
	FibSeries(){}
	public void count( int tong,int[] num,int FibLength){
		for(int i=0; i<FibLength; i++) {
			if(num[i]%2 == 0) {
				tong +=num[i];
			}
		}
		System.out.println("Tong cac so Fibonancy chan la: "+tong);
		
	}
	
	public static void results( int tong,int[] num,int FibLength){
		for(int i=0; i<FibLength; i++) {
			if(num[i]%2 == 0) {
				tong +=num[i];
			}
		}
		System.out.println("Tong cac so Fibonancy chan la: "+tong);
		
	}
	public static boolean isFibonancy(int x) {
		int[] num = new int[20];
		num[0]=0;
		num[1]=1;
	
		for(int i=2;i<20;i++) {
			num[i]=num[i-1]+num[i-2];
		}
		for(int i=0; i<20; i++) {
			if(x == num[i]) {
				return true;	
				}
		}
		return false;
	}
	public static boolean isFobi(int x) {
		int x1=0; 
		int y=1;
		while(y<x) {
			y=x1+y;
			x1 = y-x1;
		}
		if(y==x)return true;
		else return false;
	}
	public static void Fibonancy(int k) {
		System.out.println("Day fibo tu 0->n la: ");
		for(int i=0; i<=k ;i++) {
			if(isFobi(i) ==true) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		int FibLength;
		int tong =0;
		FibSeries f = new FibSeries();
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
		FibLength = scr.nextInt();
		
		int[] num = new int[FibLength];
		num[0]=0;
		num[1]=1;
		for(int i=2; i<FibLength; i++) {
			num[i]=num[i-1]+num[i-2];
		}
		System.out.println("Fibonancy Series: ");
		for(int i=0; i<FibLength;i++) {
			System.out.println(num[i] + " ");
		}
		//Tong cac so fibo chan
		f.count(tong,num,FibLength);
		FibSeries.results(tong,num,FibLength);
		//Kiem tra xem phai so Fibonancy khong?
		int x;
		
		System.out.print("Please Enter the number: ");
		x = scr.nextInt();
		if(FibSeries.isFobi(x) == true) {
			System.out.println(x+" is Fibonancy!");
		}else {
			System.out.println(x+" is not Fibonancy!");
		}
		
		int k;
		System.out.println("Please Enter the number: ");
		k = scr.nextInt();
		FibSeries.Fibonancy(k);
		
	}
}
