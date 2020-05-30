package FPT;

public class hinhchunhat {
	private double chieudai;
	private double chieurong;
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	public double getChuVi() {
		//this.chieudai = chieudai;
		//this.chieurong = chieurong;
//		double chuvi;
		double chuvi = (this.chieudai+this.chieurong)*2;
		
		return chuvi;
	}
}
