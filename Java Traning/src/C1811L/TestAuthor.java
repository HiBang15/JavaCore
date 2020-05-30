package C1811L;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class TestAuthor {
	public static boolean isEmail(String email) {
		boolean test = true;
		try {
			String regex  = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(email);
			if(m.matches()) {
				return test;
			}
		}catch(PatternSyntaxException e) {
				System.out.println("Error Email!");
	}
//				finally {
//			if(f==1) {
//				System.out.print("correct email format");
//			}
//			if(f==-1) {
//				System.out.print("Email invalidate");
//			}
//		}
		return true;
	}
	public static boolean isName(String name) {
		boolean test = true;
		try {
			String regex = "^[A-Za-z\\s ]+$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(name);
			if(m.matches()) {
				return test;
			}
		}catch(PatternSyntaxException e) {
			System.out.println("Name invalid!");
		}
//		finally {
//			if(f==1) {
//				System.out.print("Coorect name fomat!");
//			}
//			if(f==-1) {
//				System.out.print("Name invalidate!");
//			}
//		}
		return true;
	}
	
	public static boolean isGender(char gender) {
		boolean test  = true;
		try {
			if(gender == 'm' || gender == 'f') {
				return test;
			}
		}catch(PatternSyntaxException e) {
			System.out.println("Error Gender!");
		}
		return true;
	}
}
