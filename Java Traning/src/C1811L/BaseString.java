package C1811L;
import java.util.*;
public class BaseString {
	String _str;
	BaseString(){}
//	public void set(String str){
//		this._str = str;
//	}
//	public String get(){ // Hàm lấy giá trị của thuộc tính từ bên ngoài
//		 return _str;
//	}
	public int countWord(String str) {
		int c = 0;

		char[] Str = str.toCharArray();
		int len = Str.length;
		
		if(Str[0] != ' ') {
			c = 1;
		}
		
		for(int i =0; i<len-1; i++) {
			if(Str[i] == ' '&& Str[i+1] != ' ') {
				c++;
			}
		}
//		System.out.println("123");
		return c;
	}
	//Viet hoa cac chu cai
	public void displayUpCase(String str) {
//		char[] Str = str.toCharArray();
//		int len = Str.length;
//		for(int i=0; i<len-1; i++) {
//			if(Str[i] >= 97 && Str[i]<= 122 ) {
//				Str[i] = (char) (Str[i] - 32);
//			}
//		}
		String Str = str.toUpperCase(); //Su dung ham trong java
		System.out.println("Upcase: "+ Str);
	}
	//Hien thi cac ki tu la hoa trong chuoi
	public void displayUpperCase(String str){
		char[] Str = str.toCharArray();
		int len = Str.length;
		for(int i=0; i<len-1; i++) {
			if((int)Str[i] >= 65 && (int)Str[i] <= 90) {
				System.out.print(Str[i]+" ");
			}
		}
	}
	//Tong cac chu so xuat hien trong chuoi
	public int sumNumbericCharacter(String str) {
		int sum = 0; 
		char[] Str = str.toCharArray();
		int len = Str.length;
		for(int i=0; i<len-1; i++) {
			if((int)Str[i]>=48 && (int)Str[i]<=57) {
				String num = Character.toString(Str[i]);
				int s = Integer.parseInt(num);
				sum +=s;
			}
		}
		return sum;
	}
	/*public static void main(String[] args) {
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
	}*/
}
