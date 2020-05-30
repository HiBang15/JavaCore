package com.aptech.aprotrain;

import java.util.Comparator;
import java.lang.Float;

public class MarkSort implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		Float change1 = Float.valueOf(s1.getMark());
		Float change2 = Float.valueOf(s2.getMark());
		return change1.compareTo(change2);
	}

}
