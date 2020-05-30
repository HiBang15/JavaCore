package t5_apj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PostManagement {
		List<User> list = new ArrayList();;
		/*private List<User> CreateNewList() {
			List<User> list = new ArrayList<>();
			
			return list;
		}*/
		public static List<User> initiateUserList(){
			List<User> list = new ArrayList<>();
			List<Follower> followers =  new ArrayList<>();
			List<Follower> followers2 = new ArrayList();
			List<Post> posts = new ArrayList<>();
			List<Post> posts2 = new ArrayList<>();
			
			followers.add(new Follower("S01","Nguyen Van A"));
			followers.add(new Follower("S02","Nguyen Van B"));
			followers2.add(new Follower("S03","Nguyen Van C"));
			posts.add(new Post("DOC1","Thoi tiet", "Nhiet do ngay hom nay.......",100));
			posts.add(new Post("DOC2","Su kien", "Cuop giat tai thanh pho Ha Noi.......",120));
			posts2.add(new Post("DOC3","Ngoi Sao", "Noo Phuoc Thinh cong bo gioi tinh that.......",900));
			posts2.add(new Post("DOC4","Su Kien", "Anh em giet nhau tranh dat...",1000));
			posts2.add(new Post("DOC5","Thoi tiet", "Thoi tiet khu vuc ngoai thanh......",12));
			
			posts.add(new Post("DOC1","Thoi tiet", "Nhiet do ngay hom nay.......",100));
			posts.add(new Post("DOC2","Su kien", "Cuop giat tai thanh pho Ha Noi.......",120));
			posts2.add(new Post("DOC3","Ngoi Sao", "Noo Phuoc Thinh cong bo gioi tinh that.......",900));
			posts2.add(new Post("DOC4","Su Kien", "Anh em giet nhau tranh dat...",1000));
			posts2.add(new Post("DOC5","Thoi tiet", "Thoi tiet khu vuc ngoai thanh......",12));
			followers.add(new Follower("S01","Nguyen Van A"));
			followers.add(new Follower("S02","Nguyen Van B"));
			followers2.add(new Follower("S03","Nguyen Van C"));
			
			list.add(new User(followers,posts));
			list.add(new User(followers2,posts2));
			
			return list;
		}
		
		

		public static Post getMaxLike(List<User> list){
//			List listP = (List) list.stream().map(a->a.getPosts());
			List listP = list.stream().map(u->u.getPosts()).flatMap(a->a.stream()).collect(Collectors.toList());
			Post p = (Post) listP.stream().max(Comparator.comparing(Post::getNoOfLike)).get();
//			User u = list.stream().map(a->a.max(Comparator.comparing(Post::getNoOfLike).get()));
			return p;
		}
		
		public static Post getMinLike(List<User> list) {
//			List listP = (List) list.stream().map(a->a.getPosts());
			List listP = list.stream().map(u->u.getPosts()).flatMap(a->a.stream()).collect(Collectors.toList());
			Post p = (Post) listP.stream().min(Comparator.comparing(Post::getNoOfLike)).get();
//			User u = list.stream().map(a->a.max(Comparator.comparing(Post::getNoOfLike).get()));
			return p;
		}
		
		public static int countFollowers(List<User> list) {
			List listF = (List) list.stream().map(a->a.getFollowers()).flatMap(a->a.stream()).collect(Collectors.toList());
			int count =0; 
			for(int i=0; i<listF.size(); i++) {
				count++;
			}
			return count;
		}
		public static int countFollowers2(List<User> list) {
			int count =0; 
			Set<Follower> listF = list.stream().map(a->a.getFollowers()).flatMap(a->a.stream()).collect(Collectors.toSet());
			for(int i=0; i<listF.size(); i++) {
				count++;
			}
			 return count; 
		}
		public static int countPosts(List<User> list) {
			int count=0; 
			Set<Post> ListP = list.stream().map(a->a.getPosts()).flatMap(a->a.stream()).collect(Collectors.toSet());
//			for(int i=0; i<ListP.size(); i++) {
//				count++;
//			}
			return ListP.size();
		}
}
