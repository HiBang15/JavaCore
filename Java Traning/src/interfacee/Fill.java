package interfacee;

public class Fill {
	public static void main(String[] args) {
		Fillable[] fillables = new Fillable[] {
				new Circle(10,20,25),
				new Circle(30,20,10),
				new Rectangle(5,8,8,9)
				
		};
		for(int i = 0; i<fillables.length; i++) {
			fillables[i].draw(Drawable.RED);
			fillables[i].fill(Fillable.BLACK);
		}
	}
}
