package FPT;
import java.util.Scanner;
public class displaySV {
	public static void main(String[] args) {
		SinhvienIT sv = new SinhvienIT();
		Scanner src = new Scanner(System.in);
		String hoTen;
		double diemCss, diemJava,diemHtml;
	
		System.out.println("Ho va ten: ");
		hoTen = src.nextLine();
		sv.setHoTen(hoTen);
		System.out.println("Diem Java: ");
		diemJava= src.nextDouble();
		System.out.println("Diem Html: ");
		diemHtml = src.nextDouble();
		System.out.println("Diem Css: ");
		diemCss = src.nextDouble();
		
		sv.setDiem(diemJava, diemHtml, diemCss);
		System.out.println("+------------------------------------------------+");
		System.out.println("Ho va Ten : "+sv.getHoTen());
		System.out.println("Nganh: "+sv.getNganh());
		System.out.println("Diem trung binh "+sv.getDiem());
	}
	public static void main1(String[] args) {
		Scanner src = new Scanner(System.in);
		String hoTen,nganh,hocluc;
		double diem;
		sinhvienPTIT sv = new sinhvienPTIT();
		System.out.println("Ho va Ten: ");
		hoTen = src.nextLine();
		sv.setHoTen(hoTen);
		System.out.println("Chuyen Nganh: ");
		nganh = src.nextLine();
		sv.setNganh(nganh);
		System.out.println("Diem trung binh: ");
		diem = src.nextDouble();
		sv.setDiem(diem);
		
		if(diem<5) {
			hocluc = "Yeu";
			sv.setHocluc(hocluc);
		}else if(diem>5 && diem<=6.5) {
			hocluc = "Trung binh";
			sv.setHocluc(hocluc);
		}else if(diem>6.5 && diem<=7.5) {
			hocluc = "Kha";
			sv.setHocluc(hocluc);
		}else if(diem>7.5 && diem<=9) {
			hocluc="Gioi";
			sv.setHocluc(hocluc);
		}else if(diem>9) {
			hocluc="Xuat sac";
			sv.setHocluc(hocluc);
		}
//		sv.setHocluc(hocluc);
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("Ho va Ten: "+sv.getHoTen());
		System.out.println("Chuyen nganh: "+sv.getNganh());
		System.out.println("Diem trung binh: "+sv.getDiem());
		System.out.println("Hoc luc: "+sv.getHocluc());
		
	}
}
