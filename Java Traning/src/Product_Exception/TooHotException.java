package Product_Exception;

public class TooHotException extends TemperatureException {
	public TooHotException(int x) {
		System.out.println("Too hot: "+x);
	}
}
