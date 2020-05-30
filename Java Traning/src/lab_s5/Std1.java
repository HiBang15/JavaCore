package lab_s5;
import java.util.Scanner;
public class Std1 {
	public static void Info() throws MarkException,GradeException{
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
		
//		System.out.println("Subject: ");
//		sjName = src.nextLine();
//		System.out.println("Coeficient of Sj: ");
//		w = src.nextFloat();
//		System.out.println("Mark: ");
//		diem = src.nextDouble();
//		System.out.println("Bonus: ");
//		bonus = src.nextInt();
//		
//		double T1 = (diem*w)/w;
//		double T = diem*(1+(double)bonus/100);
		float tongheso=0;
		double tongdiem =0;
		double [] tong = new double[100];
		for(int i=0; i<n; i++) {
			tongheso +=w[i];
			tong[i] = diem[i]*(1+(double)bonus[i]/100)*w[i];
			tongdiem += diem[i]*(1+(double)bonus[i]/100)*w[i];
		}
		double T = tongdiem/tongheso;
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println("Name: "+fullName);
		System.out.println("Mon"+"\t"+"diem"+"\t"+"he so"+"\t"+"Thuong"+"\t"+"tongdiem");
		for(int i=0; i<n; i++) {
			System.out.println(sjName[i] + "|"+diem[i]+"|"+w[i]+"|"+bonus[i]+"|"+tong[i]);
		}
		
		if(T>100) throw new MarkException();
		else throw new GradeException(T);
		
	}
	
	
}
