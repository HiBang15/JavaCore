package Assignment_1;

public class Leader extends People {
	private double trachnhiem;
	
	
	public Leader(double trachnhiem) {
		super();
		this.trachnhiem = trachnhiem;
	}
	public Leader() {
		super();
	}

	public double getTrachnhiem() {
		return trachnhiem;
	}

	public void setTrachnhiem(double trachnhiem) {
		this.trachnhiem = trachnhiem;
	}
	@Override
	public void Input() {
		super.Input();;
		System.out.println("He so(Leader): ");
		trachnhiem = input.nextDouble();
	}
	@Override
	public double tinhluong() {
		this.luong = this.Salary + this.Salary * trachnhiem;
		return this.luong;
	}

	@Override
	public String toString() {
		return super.toString()+"Leader [trachnhiem=" + trachnhiem + "]";
	}
	
	
}
