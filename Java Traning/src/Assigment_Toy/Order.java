package Assigment_Toy;

public class Order {
	private String idOrder;
	private int quantity; 
	private double payable;
	
	Order(){}
	Order(String idOrder, int quantity, double payable){
		this.idOrder = idOrder;
		this.quantity = quantity; 
		this.payable = payable;
	}
	public String getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPayable() {
		return payable;
	}
	public void setPayable(double payable) {
		this.payable = payable;
	}
	
	
}
