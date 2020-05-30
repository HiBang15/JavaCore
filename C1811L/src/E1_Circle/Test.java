package E1_Circle;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Random rd = new Random();
		double cir = Math.random();
		Circle r = new Circle(cir);
		ArrayList<Circle> listCircle = new ArrayList();
		while(cir>0.01) {
			listCircle.add(r);
			cir = Math.random();
		}
		for(Circle a : listCircle) {
			System.out.println("Radius: "+a.getRadius());
		}
		System.out.println("Size: "+listCircle.size());
	}

}
