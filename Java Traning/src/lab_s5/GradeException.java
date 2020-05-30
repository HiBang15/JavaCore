package lab_s5;

public class GradeException extends StudentException {
	public GradeException(double t) {
		System.out.println("Mark: "+t);
		if(t<40) {
			System.out.println("Fail");
		}else if(t>=40 && t<60) {
			System.out.println("Pass");
		}else if(t>=60 && t<75) {
			System.out.println("Credit");
		}else if(t>=75 && t<=100) {
			System.out.println("Distinction");
		}

	}

	public GradeException() {
		// TODO Auto-generated constructor stub
	}

}
