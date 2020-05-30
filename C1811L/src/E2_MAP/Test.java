package E2_MAP;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		String input,id,name;
		int x;
		
		List<Employees> EmpList = new ArrayList();
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a1235","Steve Jobs");
		map.put("a1236", "Scott McNealy");
		map.put("a1237","Jeff Bezos");
		map.put("a1238","Bill Gates");

		//		//Input List Employees
/*		System.out.println("A number of Employees: ");
		x = src.nextInt();
		for(int i=0; i<x; i++) {
			System.out.println("ID"+"["+i+"] : ");
			id = src.nextLine();
			while(Check.checkId(id) == false && Check.checkIdExit(id,map) == true) {
				System.out.print("\nID"+"["+i+"] : ");
				id = src.nextLine();
			}
			System.out.println("Name"+"["+i+"] : ");
			name = src.nextLine();
			while(!Check.checkName(name)) {
				System.out.println("Name"+"["+i+"] : ");
				name = src.nextLine();
			}
			map.put(id,name);
		}*/
		//Find Name 
		System.out.println("Input ID: ");
		input = src.nextLine();

		
		for(Map.Entry<String, String> items:map.entrySet()) {
//			System.out.println("ID: "+items.getKey() + " Name: "+items.getValue());
			Employees e = new Employees(items.getKey(), items.getValue());
			EmpList.add(e);
		}
		for(Employees e : EmpList ) {
//			System.out.println("ID: "+e.getID() + " Name: "+e.getName());
			if(input.equalsIgnoreCase(e.getID())) {
				System.out.println("ID: "+e.getID());
				System.out.println("Name: "+e.getName());
			}
		}
	}
}
