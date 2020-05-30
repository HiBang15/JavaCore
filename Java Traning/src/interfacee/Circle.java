package interfacee;

public class Circle implements Drawable, Fillable{
	private double x,y,radius; 
	Circle(double x, double y, double radius){
		this.x = x; 
		this.y= y; 
		this.radius = radius;
	}
	@Override // Override method of interface
	public void draw(int color) {
		System.out.println("Circle draw at (" + x + ", "+ y + "),with radius" + radius +",and color"+color);
		
	}
	double getRadius() {
		return radius;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	@Override
	public void fill(int color) {
		// TODO Auto-generated method stub
		
	}

}
