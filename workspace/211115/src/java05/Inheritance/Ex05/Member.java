package java05.Inheritance.Ex05;

public class Member {
	private String id;
	private String picture;
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	public Member(String id) {
		this(id, "");
	}
	public Member() {
		this("", "");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
