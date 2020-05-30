package model;

public class BookCat {
	private int id; 
	private int book_id;
	private int cat_id;
	private String created; 
	private String updated;
	public BookCat(int id, int bookId, int catId, String created, String updated) {
		super();
		this.id = id;
		this.book_id = bookId;
		this.cat_id = catId;
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
		return book_id;
	}
	public void setBookId(int bookId) {
		this.book_id = bookId;
	}
	public int getCatId() {
		return cat_id;
	}
	public void setCatId(int catId) {
		this.cat_id = catId;
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
		return "BookCat [id=" + id + ", bookId=" + book_id + ", catId=" + cat_id + ", created=" + created + ", updated="
				+ updated + "]";
	} 
}
