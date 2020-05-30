package Java2_Exception;

public class tong_5_so_trong_mang {
	public static int tong (int[] arr) {
		int tong = 0;
		if(arr.length <6) {
			for(int  i =0 ; i<arr.length;i++) {
				tong += arr[i];
			}
			System.out.println("Tong 5 so la: "+tong);
		}else {
			throw new ArithmeticException("exceeds the specified number of elements");
		}
		return tong;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		try {
			 tong(arr);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
