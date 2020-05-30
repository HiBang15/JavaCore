package t9;

import java.util.Date;

public class Post {
	private int id; 
	private String title; 
	private String content; 
	private int noOfLike; 
	private Date created_at;
	public Post(int id, String title, String content, int noOfLike, Date created_at) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.noOfLike = noOfLike;
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNoOfLike() {
		return noOfLike;
	}
	public void setNoOfLike(int noOfLike) {
		this.noOfLike = noOfLike;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", noOfLike=" + noOfLike
				+ ", created_at=" + created_at + "]";
	} 
	
	
}
