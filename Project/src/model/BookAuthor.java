package model;

public class BookAuthor {
	private int id;
	private int book_id;
	private int author_id;
	private String created;
	private String updated;
	public BookAuthor(int id, int bookId, int authorId, String created, String updated) {
		super();
		this.id = id;
		this.book_id = bookId;
		this.author_id = authorId;
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
	public int getAuthorId() {
		return author_id;
	}
	public void setAuthorId(int authorId) {
		this.author_id = authorId;
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
		return "BookAuthor [id=" + id + ", bookId=" + book_id + ", authorId=" + author_id + ", created=" + created
				+ ", updated=" + updated + "]";
	}
	
	
	

}
