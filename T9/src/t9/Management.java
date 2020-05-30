package t9;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Management {
	private static Scanner src = new Scanner(System.in);
	
	public static void addNewFollower() {
		System.out.println("ID: ");
		int id = NhapInt();
		
		System.out.println("Full Name: ");
		String fullName = src.nextLine();
		
		DAO.addNewFollower(new Follower(id, fullName));
		
	}
	
	public static void addNewPost() {
		System.out.println("ID: ");
		int id = NhapInt();
		
		System.out.println("Title: ");
		String title = src.nextLine();
		
		System.out.println("Content: ");
		String content = src.nextLine();
		
		System.out.println("Number of Like: ");
		int noOfLike = NhapInt();
		
		System.out.print("Created at: ");
		Date created_at = nhapDate();
		
		DAO.addNewPost(new Post(id, title, content, noOfLike, created_at));
	}

	private static Date nhapDate() {
		while(true) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
				Date date = simpleDateFormat.parse(src.nextLine());
				return date;
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	private static int NhapInt() {
		while(true) {
			try {
				return Integer.parseInt(src.nextLine());
			}catch(Exception ex) {
				System.out.println("Sai roi nhap lai!\n");
				System.out.println("ID: ");
			}
		}
	}
	
	public static Post minLike() {
		List<Post> list = DAO.findAllPost(); 
		Post p = list.stream().min(Comparator.comparing(Post::getNoOfLike)).get();
		return p;
	}
	
	public static Post maxLike() {
		List<Post> list = DAO.findAllPost(); 
		Post p = list.stream().max(Comparator.comparing(Post::getNoOfLike)).get();
		return p;
	}
	
	public static int countPost() {
		return (int) DAO.findAllPost().stream().count();
	}
	
	public static int countFollower() {
		return (int) DAO.findAllFollower().stream().count();
	}
	
}
