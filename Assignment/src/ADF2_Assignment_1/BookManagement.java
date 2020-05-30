package ADF2_Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookManagement {
public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Test(bookList);
        bookList = EnterBook(bookList);
        Timkiem(bookList);
        minMaxPrice(bookList);
        minMaxLike(bookList);
        
        
    }

    private static List<Book> EnterBook(List<Book> list) {
        System.out.print("Nhap vao so sach muon them: ");
        int n = NhapInt(); 
        for(int i =0;i<n;i++){
            System.out.print("Vui long nhap lsbn "+(i+1)+": ");
            String lsbn = KiemTra(list);
            
            System.out.println("Name: ");
    		String name = in.nextLine();
    		
    		System.out.println("Price: ");
    		float price = NhapFloat();
    		
    		System.out.println("Discount: ");
    		int discount = NhapInt();
    		
    		System.out.println("Like: ");
    		int like = NhapInt();
    		
    		list.add(new Book(lsbn, name, price, discount, like));
            
        }
        
        return list;
    }

    private static int NhapInt() {
        while(true){
            try {
                int x = Integer.parseInt(in.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("vui long nhap lai");
            }
        }
    }
    
    private static float NhapFloat() {
        while(true){
            try {
                Float x = Float.parseFloat(in.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("vui long nhap lai");
            }
        }
    }

    private static String KiemTra(List<Book> list) {
        while(true){
            String lsbn = in.nextLine();
            long count = list.stream().filter(a->a.getLsbn().equals(lsbn)).count();
            if(count>0){
                System.out.print("Lsbn da ton tai,vui long nhap lai: ");
                continue;
            }
            return lsbn;
        }
    }
    
    private static void Timkiem(List<Book> list) {
    	System.out.println("Enter Name: ");
    	String name = in.nextLine();
    	
    	long count = list.stream().filter(a -> a.getName().equals(name)).count();
    
    	if(count<0) {
    		System.out.println("Not Found");
    	}else {
    		System.out.println("+------------Danh sach tim duoc--------------+");
    		list.stream().forEach(a->{
    			if(a.getName().equals(name)) {
    				
    				System.out.println(a);
    			}
    		});
    		System.out.println("+--------------------------------------------+");
    	}
    	    }
    private static void minMaxPrice(List<Book> list) {
    	Book b = list.stream().min(Comparator.comparing(Book::getPrice)).get();
    	System.out.println("Sach co gia thap nhat: ");
    	System.out.println(b);
    	
    	
    	Book c = list.stream().max(Comparator.comparing(a -> a.getPrice())).get();
    	System.out.println("Sach co gia cao nhat: ");
    	System.out.println(b);
    }
    
    private static void minMaxLike(List<Book> list) {
    	Book b = list.stream().min(Comparator.comparing(Book::getLike)).get();
    	System.out.println("Sach co it luot Like nhat: ");
    	System.out.println(b);
    	
    	Book c = list.stream().max(Comparator.comparing(a -> a.getLike())).get();
    	System.out.println("Sach co nhieu luot Like nhat: ");
    	System.out.println(b);
    }
    private static void Test(List<Book> list) {
		 list .add(new Book("S01","a",120,7,10));
		 list .add(new Book("S03","b",100,17,10));
		 list .add(new Book("S04","c",110,11,10));
		 list .add(new Book("S05","d",200,20,10));

	
    }
}
