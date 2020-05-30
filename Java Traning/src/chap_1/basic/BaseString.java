package chap_1.basic;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class BaseString {
	String _str;
	public BaseString(String string) {
		this._str = string;
	}
	public void set(String str) {
		this._str = str;
	}
	public String get() {
		return _str;
	}
	public int countWord() {
		int count =1;
		String Str = _str.trim();
		String str1 = Pattern.compile("\\s+").matcher(Str).replaceAll(" ");
		
		String reg = " ";
		Pattern pattern = Pattern.compile(str1);
		Matcher matcher = pattern.matcher(str1);
		
		for(char ch:str1.toCharArray()) {
			if(ch == ' ') {
				count++;
			}
		}
		return count;
	}
}
