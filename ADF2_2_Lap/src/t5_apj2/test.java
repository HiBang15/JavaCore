package t5_apj2;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<User> list = new ArrayList();
		list = PostManagement.initiateUserList();
		list.stream().forEach(a->System.out.println(a));
		System.out.println("Max: "+PostManagement.getMaxLike(list));
		System.out.println("Min: "+PostManagement.getMinLike(list));
		System.out.println("Count: "+PostManagement.countFollowers(list));
		System.out.println("Count posts: "+PostManagement.countPosts(list));
		System.out.println("Count: "+PostManagement.countFollowers2(list));
	}
}
