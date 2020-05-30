package com.aptech.aprotrain;

import java.util.*;

public class test_check {
	public static void main(String[] args) {
		
//		int id;
		String ID; 
		Scanner src = new  Scanner(System.in);
		System.out.println("input ID: ");
		ID = src.nextLine();
//		id = Integer.parseInt(ID);
		while(!Check.isEmail(ID)) {
			System.out.println("False!");
			System.out.println("input ID: ");
			ID = src.nextLine();
		}
		System.out.println("TRue");
	}
}
