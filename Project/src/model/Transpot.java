package model;

public class Transpot {
	private int id; 
	private String name; 
	private String phone; 
	private String express_delivery; 
	private String price_express_delivery; 
	private int price; 
	private String created; 
	private String updated;
	public Transpot(int id, String name, String phone, String express_delivery, String price_express_delivery,
			int price, String created, String updated) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.express_delivery = express_delivery;
		this.price_express_delivery = price_express_delivery;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExpress_delivery() {
		return express_delivery;
	}
	public void setExpress_delivery(String express_delivery) {
		this.express_delivery = express_delivery;
	}
	public String getPrice_express_delivery() {
		return price_express_delivery;
	}
	public void setPrice_express_delivery(String price_express_delivery) {
		this.price_express_delivery = price_express_delivery;
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
		return "Transpot [id=" + id + ", name=" + name + ", phone=" + phone + ", express_delivery=" + express_delivery
				+ ", price_express_delivery=" + price_express_delivery + ", price=" + price + ", created=" + created
				+ ", updated=" + updated + "]";
	} 
	
	
}
