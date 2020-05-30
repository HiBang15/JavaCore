package C1811L;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Valid{
	public static int isID(String id){
		int f=0;
		try {
			String regex = "^[A-Z]{3}[0-9]{7}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(id);
			if(m.matches()) {
				f=1;
		}
		}catch(PatternSyntaxException e){
			f=-1;
		}
//		}finally {
//			if(f==1) {
//				System.out.println("True;");
//			}
//			if(f==1) {
//				System.out.println("False");
//			}	
//		}
	return f;
	}
	public static int isName(String name) {
		int f=0;
		try {
			String regex = "^[A-Za-z ]+$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(name);
			if(m.matches()) {
				f=1;
			}
		}catch(PatternSyntaxException e){
			f=-1;
		
		}finally {
			if(f==1) {
				System.out.println("True");
			}
			if(f==-1) {
				System.out.println("False");
				System.out.println(f);
			}	
		}
		return f;
	}
}
