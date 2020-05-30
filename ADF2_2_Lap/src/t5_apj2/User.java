package t5_apj2;

import java.util.ArrayList;
import java.util.List;

public class User {
	List<Follower> followers = new ArrayList<>(); 
	List<Post> posts = new ArrayList<>();
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
	public User(List<Follower> followers, List<Post> posts) {
		super();
		this.followers = followers;
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "User [followers=" + followers + ", posts=" + posts + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((followers == null) ? 0 : followers.hashCode());
		result = prime * result + ((posts == null) ? 0 : posts.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (followers == null) {
			if (other.followers != null)
				return false;
		} else if (!followers.equals(other.followers))
			return false;
		if (posts == null) {
			if (other.posts != null)
				return false;
		} else if (!posts.equals(other.posts))
			return false;
		return true;
	}
	
	
	
	
}
