//package C1811L;
//
//import java.util.regex.Pattern;
//
//import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;
//
//public class demo2 {
//	public static void main(String[] args) {
//		String str = "Hello world 123";
//		System.out.println("Length: "+str.length());
//		
//		for(char ch : str.toCharArray()) {
//			System.out.println(ch);
//		}
//		
//		Matcher p = Pattern.compile("(?<number>[0-9]+)").matcher(str);
//		
//		if(p.find()) {
//			System.out.println("Number: ",p.group());
//		}
//	}
//}
