package model;

public class Order {
	private int id; 
	private int user_id; 
	private int transpot_id; 
	private int order_detail_id; 
	private String order_date; 
	private String ship_date; 
	private int price; 
	private String status; 
	private String created; 
	private String updated;
	public Order(int id, int user_id, int transpot_id, int order_detail_id, String order_date, String ship_date,
			int price, String status, String created, String updated) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.transpot_id = transpot_id;
		this.order_detail_id = order_detail_id;
		this.order_date = order_date;
		this.ship_date = ship_date;
		this.price = price;
		this.status = status;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTranspot_id() {
		return transpot_id;
	}
	public void setTranspot_id(int transpot_id) {
		this.transpot_id = transpot_id;
	}
	public int getOrder_detail_id() {
		return order_detail_id;
	}
	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getShip_date() {
		return ship_date;
	}
	public void setShip_date(String ship_date) {
		this.ship_date = ship_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "Order [id=" + id + ", user_id=" + user_id + ", transpot_id=" + transpot_id + ", order_detail_id="
				+ order_detail_id + ", order_date=" + order_date + ", ship_date=" + ship_date + ", price=" + price
				+ ", status=" + status + ", created=" + created + ", updated=" + updated + "]";
	} 
	
	
}
