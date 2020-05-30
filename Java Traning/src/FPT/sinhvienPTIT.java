package FPT;

public class sinhvienPTIT extends sinhvien {
	protected double diem; 
	private String hocluc;
	sinhvienPTIT(){}
	sinhvienPTIT(String hoTen,String nganh,double diem){
		super();
		this.diem = diem;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public String getHocluc() {
		return hocluc;
	}
	public void setHocluc(String hocluc) {
		this.hocluc = hocluc;
	} 

}
