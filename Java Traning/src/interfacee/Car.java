package interfacee;

public class Car implements Drivable{
	@Override 
	public void drive(int numUnits) {
		System.out.printf("Driving car %d kilometters %n",numUnits);
	}
	@Override
	public void start() {
		System.out.println("Starting car!");
	}
	@Override
	public void stop() {
		System.out.println("Stopping car!");
	}
	@Override
	public void turnLeft() {
		System.out.println("Turning car left!");
	}
	@Override
	public void turnRight() {
		System.out.println("Turning car right!");
	}
}

