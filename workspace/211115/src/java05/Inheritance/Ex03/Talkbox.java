package java05.Inheritance.Ex03;

// id와 picture는 Member 클래스에 정의되어 있음으로
// Member 클래스를 현재 클래스의 필드로 사용함.
public class Talkbox {
//	private String id;
//	private String picture;
	private Member member;
	private String contents;
	private String chatTime;
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getPicture() {
//		return picture;
//	}
//	public void setPicture(String picture) {
//		this.picture = picture;
//	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
	
}
