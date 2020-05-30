package model;

public class OrderDetail {
	private int id; 
	private int book_id; 
	private int quantity; 
	private int price; 
	private String created; 
	private String updated;
	public OrderDetail(int id, int book_id, int quantity, int price, String created, String updated) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.quantity = quantity;
		this.price = price;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
		return "OrderDetail [id=" + id + ", book_id=" + book_id + ", quantity=" + quantity + ", price=" + price
				+ ", created=" + created + ", updated=" + updated + "]";
	} 
}
