package C1811L;

public class demo1_OOPS {
	static int x = 1;
	int y =1;
	demo1_OOPS(){}
	demo1_OOPS(int z){
		y+=z;
		System.out.println("y= "+y);
	}
	public void count() {
		x+=2;
		System.out.println("x = "+x);
	}
	public static void main(String[] args) {
		demo1_OOPS a = new demo1_OOPS(1);
		demo1_OOPS a1 = new demo1_OOPS(2);
		a.count();
		a1.count();
		System.out.println(demo1_OOPS.x);
		System.out.println(a1.y);
	}
}
