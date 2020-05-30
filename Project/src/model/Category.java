package model;

public class Category {
	private int id; 
	private String name; 
	private int parentId; 
	private String created; 
	private String updated;
	public Category(int id, String name, int parentId, String created, String updated) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
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
		return "Category [id=" + id + ", name=" + name + ", parentId=" + parentId + ", created=" + created
				+ ", updated=" + updated + "]";
	}

	
}
