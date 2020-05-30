package model;

public class Account {
	private int id; 
	private String userName; 
	private String password; 
	private String fullName; 
	private int age; 
	private String gender;
	private String dob; 
	private String address; 
	private String phone; 
	private String email;
	private String created;
	private String updated;
	public Account(int id, String userName, String password, String fullName, int age, String gender, String dob,
			String address, String phone, String email, String created, String updated) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", password=" + password + ", fullName=" + fullName
				+ ", age=" + age + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", created=" + created + ", updated=" + updated + "]";
	}
	
}
