package com.aptech.aprotrain;

import java.util.*;

public abstract class  StudentManagement {
	ArrayList<Student> ListStudent = new ArrayList();
	public void addStudent() {
		
		Student  st = new Student();
		for(int i=0; i<3; i++) {
			st.input();
			ListStudent.add(new Student(st.getId(), st.getFullName(), st.getEmail(), st.getMark()));
		}
	}
	public void showStudent() {
		for(Student st : ListStudent) {
			st.display();
		}
	}
	public void sortStudentByMark() {
		Collections.sort(ListStudent, new MarkSort());
		for(Student st : ListStudent) {
			System.out.println("ID: "+st.getId() +"\t| Full Name:" +st.getFullName()+"\t | Email" + st.getEmail() + "\t\t|Mark" + st.getMark() );
		}
	}

}
