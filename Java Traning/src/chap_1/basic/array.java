package chap_1.basic;
import java.util.Arrays;
import java.util.Collections;



public class array {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,6,8,4,6,8,0,3,2,9};
		
		String res = Arrays.toString(arr);
		System.out.println(res);
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		String[] names = {"Long","Tuan","Kieu","Minh","Hung","Vu","Bao"};
		
		String name = Arrays.toString(names);
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		int index = Arrays.binarySearch(names,4,names.length,"Tuan");
		System.out.println("Index: "+index);//vi tri tua tim kiem
	}

}
