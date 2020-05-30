package aptech;
import java.util.*;
public class Main_Q2 {
	public static void main(String[] args) {
		Employee Emp = new Employee();
		ArrayList<Employee> listEmp = new ArrayList();
		
		for(int i=0; i<3; i++) {
			Emp.input();
			Employee e = new Employee(Emp.getName(), Emp.getAge(), Emp.getSalary());
			listEmp.add(e);
		}
		listEmp.get(1).increaseSalary(listEmp.get(1).increaseSalary(10));
		listEmp.get(2).setSalary(listEmp.get(2).increaseSalary(1.5));
		Collections.sort(listEmp, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() > e2.getSalary()) return -1;
                else if(e1.getSalary() < e1.getSalary()) return 1;
                return 0;
            }
        });
        for (Employee e: listEmp) {
            e.display();
        }
	}
}
