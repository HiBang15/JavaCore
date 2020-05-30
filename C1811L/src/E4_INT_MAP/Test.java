package E4_INT_MAP;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int input;
		Map<Integer, String>  map = new HashMap<Integer, String>();
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		map.put(4,"four");
		map.put(5,"fine");
		System.out.println("Input: ");
		input = src.nextInt();
		for(Map.Entry<Integer, String> items : map.entrySet()) {
			if(input == items.getKey()) {
				System.out.println(items.getValue());
			}
		}
	}
}
