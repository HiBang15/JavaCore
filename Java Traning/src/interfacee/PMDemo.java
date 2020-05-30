package interfacee;

interface I {
	default void a() {
		System.out.println("a() called");
		c();
	}
	default void b() {
		System.out.println("b() called");
		c();
	}
	default void c() {
		System.out.println("c() called");
		
	}
	default void d() {
		System.out.println("d() called");
		e();
	}
	default void e() {
		System.out.println("e() called");
		
	}
}
public class PMDemo implements I{
	public static void main(String[] args){
		PMDemo pmdemo = new PMDemo();
		pmdemo.a();
		System.out.println();
		pmdemo.b();
		System.out.println();
		// The following method call will result in a compiler error because c()
		// is private to interface I.
		// pmdemo.c();
		pmdemo.d();
	}
	@Override
	public void b(){
		System.out.println("overriding b() called");
		I.super.b();
	}
}