package assignment_3_DB;

public class danhMuc {
	private int id; 
	private String ten_danh_muc;
	public danhMuc(int id, String ten_danh_muc) {
		super();
		this.id = id;
		this.ten_danh_muc = ten_danh_muc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen_danh_muc() {
		return ten_danh_muc;
	}
	public void setTen_danh_muc(String ten_danh_muc) {
		this.ten_danh_muc = ten_danh_muc;
	}
	@Override
	public String toString() {
		return "danhMuc [id=" + id + ", ten_danh_muc=" + ten_danh_muc + "]";
	} 
	
}
