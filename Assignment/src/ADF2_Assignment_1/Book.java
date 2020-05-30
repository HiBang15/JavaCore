package ADF2_Assignment_1;

public class Book {
	private String lsbn; 
	private String name; 
	private float price; 
	private int discount;
	private float salePrice;
	private int like; 
	
	Book(){
		super();
	}

	public Book(String lsbn, String name, float price, int discount, int like) {
		super();
		this.lsbn = lsbn;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.like = like;
		this.salePrice = this.price*(1-(float)this.discount/100);
	}

	public String getLsbn() {
		return lsbn;
	}

	public void setLsbn(String lsbn) {
		this.lsbn = lsbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public float getSalePrice() {
		return salePrice;
	}


	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "lsbn=" + lsbn + ", name=" + name + ", price=" + price + ", discount=" + discount + ", salePrice="
				+ salePrice + ", like=" + like ;
	}
	
}
