package aptech;

import java.util.Comparator;

public class Age_Sort implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		Integer change1 = Integer.valueOf(p1.getAge());
		Integer change2 = Integer.valueOf(p2.getAge());
		return change1.compareTo(change2);
	}
}
