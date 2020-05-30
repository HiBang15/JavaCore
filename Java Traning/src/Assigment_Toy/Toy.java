package Assigment_Toy;

public class Toy {
	private String id; 
	private String name; 
	private double price;
	private String color; 
	private String type;
	
	Toy(String id, String name, double price, String color, String type){
		this.id = id; 
		this.name = name;
		this.price = price; 
		this.color = color; 
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
