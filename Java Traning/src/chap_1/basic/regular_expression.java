package chap_1.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class regular_expression {
	public static void main(String[] args) {
		String number = "0978789825";
		String number2 = "0968016758";
		String number3 = "0868016888";
		String regex = "^0[98]{1}\\d{8}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		if(matcher.find()) {
			System.out.println("OKKKKKKK!");
		}else {
			System.out.println("Error!");
		}
		
		
	}
}
