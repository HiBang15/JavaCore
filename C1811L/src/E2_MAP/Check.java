package E2_MAP;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public static boolean checkId(String str) {
		String regex = "^[a-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	
	public static boolean checkName(String str) {
		String regex = "^[A-z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	
	public static boolean checkIdExit(String str, Map<String, String> list) {
		for(String key : list.keySet()) {
			if(key.equalsIgnoreCase(str)) {
				return false;
			}
		}
		return true;
	}
}
