package model;

public class Export {
	private int id; 
	private int book_id; 
	private int total_price; 
	private String created; 
	private String updated;
	public Export(int id, int book_id, int total_price, String created, String updated) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.total_price = total_price;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Import [id=" + id + ", book_id=" + book_id + ", total_price=" + total_price + ", created=" + created
				+ ", updated=" + updated + "]";
	}
}
