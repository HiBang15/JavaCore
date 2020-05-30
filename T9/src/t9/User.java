package t9;

import java.util.ArrayList;
import java.util.List;

public class User {
	private List<Follower> followers = new ArrayList<>();
	private List<Post> posts = new ArrayList<>();
	public User(List<Follower> followers, List<Post> posts) {
		super();
		this.followers = followers;
		this.posts = posts;
	}
	public List<Follower> getFollowers() {
		return followers;
	}
	public void setFollowers(List<Follower> followers) {
		this.followers = followers;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "User [followers=" + followers + ", posts=" + posts + "]";
	}
	
}
