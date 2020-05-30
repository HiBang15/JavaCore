package model;

public class Publisher {
	private int id; 
	private int bookId; 
	private String name; 
	private String contact; 
	private String address; 
	private String created; 
	private String updated;
	public Publisher(int id, int bookId, String name, String contact, String address, String created, String updated) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return "Publisher [id=" + id + ", bookId=" + bookId + ", name=" + name + ", contact=" + contact + ", address="
				+ address + ", created=" + created + ", updated=" + updated + "]";
	} 
}
