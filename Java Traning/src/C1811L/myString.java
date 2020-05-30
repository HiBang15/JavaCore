package C1811L;
import java.util.*;
public class myString {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String str ;
		BaseString s = new BaseString();
		System.out.println("Input String: ");
		str = src.nextLine();
		s.countWord(str);
		System.out.println("The number of words in the string is: "+s.countWord(str));
		//Upcase
		s.displayUpCase(str);

//		s.sumNumbericCharacter(str);
		//Display Upper Case
		System.out.print("The uppercase letters in the string are: ");
		s.displayUpperCase(str);
		//Sum 
		System.out.println("\nSum Numberic: "+s.sumNumbericCharacter(str));
	}
}
