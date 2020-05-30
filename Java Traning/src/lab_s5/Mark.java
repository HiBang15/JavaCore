package lab_s5;

public class Mark {
	private Students s; // diem nay cua sinh vien nao
	private Subject[] sj; //diem nay cua mon hoc nao
	private double[] m; //diem mon hoc sj
	private int bonus;//%ren luyen
	public Students getS() {
		return s;
	}
	public void setS(Students s) {
		this.s = s;
	}
	public Subject[] getSj() {
		return sj;
	}
	public void setSj(Subject[] sj) {
		this.sj = sj;
	}
	public double[] getM() {
		return m;
	}
	public void setM(double[] m) {
		this.m = m;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
