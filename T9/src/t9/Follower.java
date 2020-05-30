package t9;

public class Follower {
	private int id; 
	private String fullName;
	public Follower(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Follower [id=" + id + ", fullName=" + fullName + "]";
	} 
	
}
