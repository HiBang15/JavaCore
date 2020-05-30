package model;

public class Author {
	private int id; 
	private String fullName; 
	private int age; 
	private String dob; 
	private String gender;
	private String home_town; 
	private String introduction; 
	private String created; 
	private String updated;
	public Author(int id, String fullName, int age, String dob, String gender, String homeTown, String introduction,
			String created, String updated) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.home_town = homeTown;
		this.introduction = introduction;
		this.created = created;
		this.updated = updated;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeTown() {
		return home_town;
	}
	public void setHomeTown(String homeTown) {
		this.home_town = homeTown;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
		return "Author [id=" + id + ", fullName=" + fullName + ", age=" + age + ", dob=" + dob + ", gender=" + gender
				+ ", homeTown=" + home_town + ", introduction=" + introduction + ", created=" + created + ", updated="
				+ updated + "]";
	}
}
