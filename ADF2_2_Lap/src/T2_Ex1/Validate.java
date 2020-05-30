package T2_Ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	public static boolean testPhone(String str) {
		String regex = "^[0-9]{10,11}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	public static boolean testEmail(String email) {
		String regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.find()) {
			return true;
		}
		return false;
	}
//	public static void main(String[] args) {
//		boolean test = testPhone("0987654321");
//		System.out.println(test);
//	}
}
