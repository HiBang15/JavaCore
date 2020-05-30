package E10;

import java.util.*;

public class Duplicate_Elimi {
	/*public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int[] array = new int[10];
		int[] barray = new int[10];
		
		System.out.println("Enter 10 integers: ");
		for(int i=0; i<array.length; i++) {
			array[i] = src.nextInt();
			barray[i] = src.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			System.out.print("\t"+array[i]);
		}
		System.out.println("\n Unique values are: ");
		for(int i=0; i < array.length; i++) {
			{
				if(array[i] == barray[i])
					break;
				System.out.print("\t"+array[i]);
			}
		}
	}*/
	public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add( sc.nextInt());
        }
        System.out.println("List : ");
        for (Integer i: list) {
            System.out.print(i +" ");
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    i--;
                }
            }
        }
        System.out.println();
        System.out.println("List : ");
        for (Integer i: list) {
            System.out.print(i +" ");
        }
    }
}
