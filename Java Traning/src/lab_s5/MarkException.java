package lab_s5;

import java.util.Arrays;

public class MarkException extends StudentException {

	@Override
	public String toString() {
		return "Do not spend over 100 points";
	}
//	public MarkException(double x) {
//		if(x>100) {
//			System.out.println("Do not spend over 100 points");
//		}
//	}
	

}
