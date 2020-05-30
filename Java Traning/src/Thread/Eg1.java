package Thread;

public class Eg1 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				try {
					System.out.println("Pause");
					Thread.sleep(3000);
					System.out.println("Restart");;
				}catch(InterruptedException ex) {
					
				}
			}
		};
		thread.run();
	}
}
