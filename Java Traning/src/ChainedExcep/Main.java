package ChainedExcep;

public class Main {
	public static void main(String[] args) throws Throwable {
		try {
			Info.stu();
		}catch(Exception e) {
			System.out.println(e.getCause().getMessage());
		}
	}
}
