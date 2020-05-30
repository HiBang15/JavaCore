package Database_lab;

public class User {
	private String id; 
	private String full_name; 
	private String email; 
	private String pass; 
	
	User(){
		super();
	}

	public User(String id, String full_name, String email, String pass) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Table_User [id=" + id + ", full_name=" + full_name + ", email=" + email + ", pass=" + pass + "]";
	}
	
	
	
}
