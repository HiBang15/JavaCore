package C1811L;

public class Display {


	public static void main(String[] args) {
		
		Employee e = new Employee("Kieu Tuan Long",100,2018,"201898ABCD");
		System.out.println("Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Year Start: "+e.getYear());
		System.out.println("National Insuarace Number"+e.getNum());
		
	}
}
