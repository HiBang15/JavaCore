package C1811L;
import java.util.Scanner;

public class Student {
	private String id;
	private String name;
	Student(){}
	Student(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Valid ck = new Valid();
		Student[] s = new Student[] {
				new Student("BKA001201999","Kieu Tuan Long"),
				new Student("BKA0022019","Nguyen Van A"),
				new Student("BKA0032019","Le van B")
		};
		for(Student ar:s) {
			if(ck.isID(ar.getId())==1&&ck.isName(ar.getName())==1) {
				System.out.println(ar.getId() + " "+ar.getName());
			}
//			System.out.println(ar.getId());
		}
		
	}
}
