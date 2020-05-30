package FPT;
import FPT.sinhvienPTIT;
public class SinhvienIT extends sinhvienPTIT{
	SinhvienIT(){}
	String nganh = "Cong nghe thong tin";
	
	private double diemJava;
	private double diemHtml;
	private double diemCss;
	public double getDiemJava() {
		return diemJava;
	}
	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}
	public double getDiemHtml() {
		return diemHtml;
	}
	public void setDiemHtml(double diemHtml) {
		this.diemHtml = diemHtml;
	}
	public double getDiemCss() {
		return diemCss;
	}
	public void setDiemCss(double diemCss) {
		this.diemCss = diemCss;
	}
	public void setDiem(double diemJava,double diemHtml,double diemCss) {
		this.diem = (diemJava+diemHtml+diemCss)/3;
	}
	public double getDiem() {
//		diem = (this.diemJava + this.diemHtml +this.diemCss)/3;
		return diem;
	}
	public void setNganh(String nganh) {
		this.nganh = "Cong nghe thong tin";
	}
	public String getNganh() {
		return this.nganh;
	}
}
