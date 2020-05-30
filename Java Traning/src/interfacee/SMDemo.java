package interfacee;

class Circle1 implements Drawable1 {
	private int  x,y,r;
	Circle1(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void Draw(int color) {
		System.out.printf("Drawing circle(%d, %d, %d) in color %x%n", x, y, r,
				color);
	}
}
public class SMDemo{
	public static void main(String[] args) {
		Circle1 circle1 = new Circle1(10, 20, 5);
		circle1.Draw(Drawable1.rgb(0x80, 0x60, 0x40)); // access static method rgb()
	}
}
