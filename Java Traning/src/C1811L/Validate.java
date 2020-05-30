package C1811L;
import java.util.*;
import java.util.regex.Pattern;

import java.util.regex.Matcher;


public class Validate {
	Validate(){}
	public static boolean isName(String str) {
		String reg = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	public static boolean isEmail(String str) {
		String reg = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	public static int countWord(String str) {
		
		String s = str.trim();
		String s1 = Pattern.compile("\\s+").matcher(s).replaceAll(" ");

		System.out.println(s1);
		int count;
		count =1;
		String reg = " ";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(s);
//		if(matcher.find()) {
//			matcher.group(0);
//		}
//		char[] white = matcher.group(0).toCharArray();
//		int len = white.length;
//		System.out.println(len);
//		for(int i=1;  i<=len;  i++) {
//			count++;
////			System.out.println(count);
//		}
		for(char ch:s1.toCharArray() ) {
//			System.out.println(ch);
			if(ch == ' ') {
				count++;
			}
		}		
//		System.out.println(count);
		return count;
		
	}

	public static void main(String[] args) {
		Validate v = new Validate();
		Scanner src = new Scanner(System.in);
		String name,email;
		System.out.println("Input name");
		name = src.nextLine();
//		if(isName(name)==true) {
//			System.out.println("OK!");
//			System.out.println("Your name is "+name);
//		}else {
//			System.out.println("Error name!");
//		}
//		System.out.println("Input Email:");
//		email = src.nextLine();
//		if(isEmail(email)==true) {
//			System.out.println("Your Email is "+email);
//			
//		}else {
//			System.out.println("Error!");
//		}
		int n = v.countWord(name);
		System.out.println("Number of Word in String: "+n);
	}
}
