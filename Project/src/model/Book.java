package model;

public class Book {
	private int id; 
	private String publisher_id; 
	private String name; 
	private int price; 
	private int width; 
	private int height;
	private int number_of_pages; 
	private int reprinted;
	private int quantity; 
	private int release_year;
	private String created; 
	private String updated;
	public Book(int id, String publisher_id, String name, int price, int width, int height, int numberOfPages,
			int reprinted, int quantity, int release_year, String created, String updated) {
		super();
		this.id = id;
		this.publisher_id = publisher_id;
		this.name = name;
		this.price = price;
		this.width = width;
		this.height = height;
		this.number_of_pages = numberOfPages;
		this.reprinted = reprinted;
		this.quantity = quantity;
		this.release_year = release_year;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(String publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getNumberOfPages() {
		return number_of_pages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.number_of_pages = numberOfPages;
	}
	public int getReprinted() {
		return reprinted;
	}
	public void setReprinted(int reprinted) {
		this.reprinted = reprinted;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
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
		return "Book [id=" + id + ", publisher_id=" + publisher_id + ", name=" + name + ", price=" + price + ", width="
				+ width + ", height=" + height + ", numberOfPages=" + number_of_pages + ", reprinted=" + reprinted
				+ ", quantity=" + quantity + ", release_year=" + release_year + ", created=" + created + ", updated="
				+ updated + "]";
	}
}
