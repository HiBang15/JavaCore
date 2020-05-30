package aptech;

import java.util.*;

public class Main_Q1 {
	public static void main(String[] args) {
		Person person = new Person();
//		Scanner src = new Scanner(System.in);
		ArrayList<Person> listPerson = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			person.input();
			Person pr = new Person(person.getName(), person.getAge());
			listPerson.add(pr);
		}
		//SORT AGE
//		Collections.sort(listPerson, new Age_Sort());
		for(Person p : listPerson) {
			p.display();
		}
	}
}
