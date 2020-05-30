package assignment_3_DB;

import java.sql.Date;
import java.util.Scanner;

public class baiViet {
	private int id; 
	private String title; 
	private String summary; 
	private String content; 
	private Date created_at; 
	private int danh_muc_id;
	private Scanner in = new Scanner(System.in);
	
	public baiViet(String title, String summary, String content, Date created_at, int danh_muc_id) {
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.created_at = created_at;
		this.danh_muc_id = danh_muc_id;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Scanner getIn() {
		return in;
	}
	public void setIn(Scanner in) {
		this.in = in;
	}
	public int getDanh_muc_id() {
		return danh_muc_id;
	}
	public void setDanh_muc_id(int danh_muc_id) {
		this.danh_muc_id = danh_muc_id;
	}
	@Override
	public String toString() {
		return "baiViet [id=" + id + ", title=" + title + ", summary=" + summary + ", content=" + content
				+ ", created_at=" + created_at + ", danh_muc_id=" + danh_muc_id + "]";
	}
	
}
