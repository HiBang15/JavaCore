package T3_Ex3;
import java.util.Scanner;
public class Student {
	private String rollNo; 
	private String clazz; 
	private float diemToan,  diemLy, diemHoa, diemAnh, diemVan, trungbinh;
	private String xeploai;
	
	Student(){
		super();
	}
	Student(String rollNo, String clazz, float toan, float ly, float hoa, float anh, float van)
	{
		this.rollNo = rollNo; 
		this.clazz = clazz; 
		this.diemToan = toan; 
		this.diemLy = ly; 
		this.diemHoa = hoa; 
		this.diemVan =  van; 
		this.diemAnh = anh;
		this.trungbinh = (float)(toan+ly+hoa+anh+van)/5;
        if(trungbinh < 5 && trungbinh >= 0) this.xeploai="YEU";
        if(trungbinh <= 6 && trungbinh>= 5) this.xeploai ="TB";
        if(trungbinh <= 8 && trungbinh > 7 ) this.xeploai="KHA";
        if(trungbinh <10 && trungbinh >= 9) this.xeploai="GIOI";
	}
	
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemAnh() {
		return diemAnh;
	}
	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}
	public float getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	
	 public String getXeploai() {
	        return xeploai;
	 }
	 public float getDiemTrungBinh() {
	        return trungbinh;
	 }
	
    public float tinhtrungbinh(float a, float b, float c,float d, float e) {
        return (a + b + c+d+e) / 5;
    }
     
    
    public String xepLoaiHocLuc( float diemTB) {
        if (diemTB >= 8 && diemTB <= 10) {
            return "Gioi";
        }
        if (diemTB >= 6.5 && diemTB < 8) {
            return "Kha";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung binh";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yeu";
        }
        return "Khong xep loai";
    }

	public void display() {
//		float s = tinhtrungbinh(diemToan, diemLy, diemHoa, diemAnh,  diemVan);
		System.out.println("rollNo: " + rollNo + "  | clazz: " + clazz + "  | diemToan: " + diemToan 
				+ "  | diemLy: " + diemLy
				+ "  | diemHoa: " + diemHoa + "  | diemAnh: " + diemAnh +
				"  | diemVan: " + diemVan + "  | Trung binh: " 
				+ trungbinh + "  | Xep  loai: "+xeploai);
	}
	
	void input() {
		Scanner src = new Scanner(System.in);
		System.out.println("Ma sinh vien: ");
		rollNo = src.nextLine();
		System.out.println("Lop: ");
		clazz = src.nextLine();
		System.out.println("Diem Toan: ");
		diemToan = src.nextFloat();
		System.out.println("Diem  Van: ");
		diemVan = src.nextFloat(); 
		System.out.println("Diem Anh: ");
		diemAnh = src.nextFloat(); 
		System.out.println("Diem Ly: ");
		diemLy = src.nextFloat();
		System.out.println("Diem Hoa: ");
		diemHoa = src.nextFloat();
	}
	
	
}