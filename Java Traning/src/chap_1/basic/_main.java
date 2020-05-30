package chap_1.basic;
import chap_1.basic.Getter_Setter;
public class _main {
	public static void main(String[] args) {
		Getter_Setter s = new Getter_Setter();
		s.setID("B18DCAT142");
		s.setName("Kieu Tuan Long");
		s.setDOB("16-6-2000");
//		s.setMajor("Information Securlaty");
		
		System.out.println("ID Student: "+s.getID());
	}
		
}	
