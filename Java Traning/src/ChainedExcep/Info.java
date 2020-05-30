package ChainedExcep;

import java.util.Scanner;

public class Info {
	public static void stu() throws Throwable{
		Scanner src = new Scanner(System.in);
		String sid,fullName;
		String[] sjName = new String[100];
		double[] diem = new double[100];
		float[] w= new float[100];
		int[] bonus = new int[100];
		int n;
		System.out.println("Name Student: ");
		fullName = src.nextLine();
		System.out.println("So mon hoc cua ban: ");
		n = src.nextInt();
		src.nextLine();
		for(int i=0; i<n; i++) {
			System.out.println("Mon hoc thu "+(i+1)+" :");
			sjName[i] = src.nextLine();
			
			System.out.println("He so mon hoc: ");
			w[i]= src.nextInt();
			
			System.out.println("Diem mon hoc la: ");
			diem[i] = src.nextDouble();
			System.out.println("Thuong : ");
			bonus[i] = src.nextInt();
			src.nextLine();
		}
		float tongheso=0;
		double tongdiem =0;
		double [] tong = new double[100];
		for(int i=0; i<n; i++) {
			tongheso +=w[i];
			tong[i] = diem[i]*(1+(double)bonus[i]/100)*w[i];
			tongdiem += diem[i]*(1+(double)bonus[i]/100)*w[i];
		}
		double T = tongdiem/tongheso;
		if(T<=100) {
			System.out.println("+-------------------------------------------------------------------------+");
			System.out.println("Name: "+fullName);
			System.out.println("Mon"+"\t"+"diem"+"\t"+"he so"+"\t"+"Thuong"+"\t"+"tongdiem");
			for(int i=0; i<n; i++) {
				System.out.println(sjName[i] + "\t|"+diem[i]+"\t|"+w[i]+"\t|"+bonus[i]+"\t|"+tong[i]);
			}
			System.out.println("AVG: "+T);
		}else {
			throw new MarkException().initCause(new Exception("Mark score above 100!"));
		}
		if(T<40) throw new GradeException().initCause(new Exception("Fail!"));
		if(T>=40 && T<=60) throw new GradeException().initCause(new Exception("Pass!"));
		if(T>=60&&T<=80) throw new GradeException().initCause(new Exception("Credit!"));
		if(T>=80 && T<=100) throw new GradeException().initCause(new Exception("Distinction!"));
		
//		if(T>100) {
//			throw new MarkException().initCause(new Exception("Error Point!"));
//		}
//		else {
//			throw new GradeException(T);
//		}
	}
}
