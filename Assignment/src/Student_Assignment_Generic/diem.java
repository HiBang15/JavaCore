package Student_Assignment_Generic;

public class diem {
	private float toan; 
	private float ly; 
	private float hoa; 
	private float anh; 
	private float van;
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public float getAnh() {
		return anh;
	}
	public void setAnh(float anh) {
		this.anh = anh;
	}
	public float getVan() {
		return van;
	}
	public void setVan(float van) {
		this.van = van;
	}
	public diem(float toan, float ly, float hoa, float anh, float van) {
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		this.anh = anh;
		this.van = van;
	}
	
	
}
