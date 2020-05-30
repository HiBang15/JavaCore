package Basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap email: ");
		String email = input.nextLine();
		String regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.find()) {
			System.out.println("Successfully!");
			System.out.println("Email: "+matcher.group());
		}else {
			System.out.println("Invalid!");
			System.out.println("Email: "+email);
		}
		
		
		
	}
}
