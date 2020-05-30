package interfacee;
interface A{
	default void method() {
		System.out.println("A.method() invoked");
	}
}
public class DMDemo1 implements A {
	@Override
	public void method() {
		System.out.println("DMDemo.method() invoked!");
		A.super.method();
	}
	public static void main(String[] args) {
		DMDemo1 dmdemo = new DMDemo1();
		dmdemo.method();
	}

}
