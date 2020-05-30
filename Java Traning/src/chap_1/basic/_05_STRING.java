package chap_1.basic;

public class _05_STRING {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Tuan ");
		stringBuilder.append("Long");
		stringBuilder.insert(5, "Van ");
		String name = stringBuilder.toString();
		//String reverseName = stringBuilder.reverse().toString();
		System.out.println(name);
//		String name1 = stringBuilder.toString();
		stringBuilder.replace(0, 1, "t");
		String name1 = stringBuilder.toString();
//		System.out.println(reverseName);
		System.out.println(name1);
		
	}
	public static void main003(String[] args) {
		String myName = "Tuan Long from Ha Noi Viet Nam";
//		System.out.println(myName.toCharArray());//chuyen sang mang ki tu char
		System.out.println(myName.toUpperCase());//viet hoa
//		String regex;
		System.out.println(myName.split(" "));
	}
	public static void main002(String[] args) {
//		String name = "Tuan Long";
//		for(int i=0; i<name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
		//name.charAt(0) = "W"; Không thể thực hiện được
//		String firstName = "Long"; // đối tượng firstName
//		String lastName  = " Kieu Tuan";//đối tượng lastName
//		firstName = firstName+lastName;
//		System.out.println(firstName);//firstName
		//Kiểm tra hai chuỗ tương đương;
		String firstString = "Long";
		String secondString = "Long";
		String thirdString  = "LONG";
		String fourthString = "long";
		//Phân biệt chữ hoa chữ thường:equals
		//Khong phân biệt chữ hoa chữ thương:euqlasIgnoreCase
//		System.out.println(firstString == secondString);//Hạn chế sử dụng
		System.out.println(firstString.equals(secondString));
		System.out.println(firstString.equals(thirdString));
		System.out.println(firstString.equalsIgnoreCase(fourthString));
		//Chuỗi rỗng , chuỗi null;
		String emptyString = "";
		String nullString = null;
		System.out.println(emptyString.length());
		System.out.println(nullString.length());//Null không thể thao tác được
		//TRước khi thao tác với đối tượng trong java ta phair kiểm tra có null hay không 
	}
	
	// Chuỗi, nối chuỗi
	public static void main001(String[] args) {
		String myName = "Kieu Tuan Long";
//		String name   = new String("Tuan Long");
		String firstName = myName.substring(0, 9);
		String lastName  = myName.substring(10,14);
		int length = myName.length();
//		System.out.println("Length of myName: "+length);
//		System.out.println("Fisrt Name: "+firstName);
//		System.out.println("Last Name: "+lastName);
		String firstString = "Hello ";
		String secondString = "World!";
		String result = firstString + secondString;
		System.out.println(result);
	}
}
