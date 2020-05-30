package T2_Ex2;
import java.util.Scanner;
public class Computer {
	private static int id = 100000;
	private String name; 
	private String model; 
	private String os;
	private float price;
	
	
	public Computer() {
		super();
	}
	Computer(String name, String model, String os, float p){
		this.id++;
		this.name = name; 
		this.model = model; 
		this.os = os; 
		this.price = p;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Computer.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void input() {
		Scanner src = new Scanner(System.in);
		System.out.println("+------------Nhap thong tin--------------+");
		System.out.println("Ten sap pham: ");
		name = src.nextLine();
		System.out.println("Ma san pham: ");
		model = src.nextLine(); 
		System.out.println("Phien ban: ");
		os = src.nextLine();
		System.out.println("Gia san pham: ");
		price = src.nextFloat();
		src.nextLine();
	}
	@Override
	public String toString() {
		return "ID: "+id+"   |  Ten san pham: "+name+"  |  Ma san pham: "
					+model+"  |  Phien ban: "+os+"Gia san pham: "+price ;
	}

}
