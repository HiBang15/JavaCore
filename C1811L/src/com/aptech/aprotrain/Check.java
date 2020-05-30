package com.aptech.aprotrain;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Check extends Student{
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
}
