package java05.Inheritance.Ex05;
//클래스를 상속 받을 경우 extends를 이용한다.
//현재 코드에서는 Talkbox가 Member를 상속 받는 것이다.
public class Talkbox extends Member{
	private String contents;
	private String chatTime;
	
	public Talkbox(String id, String picture, 
			String contents, String chatTime) {
//		this는 현재 클래스를 의미하며 setId는 부모 클래스에 있는 것을 뜻함으로
//		아래와 같은 코드는 사용되지 않음.
//		this.setId(id);
//		this.setPicture(picture);

//		부모 클래스의 메소드를 이용할 경우 super를 이용하여 메소드 활용		
//		super.setId(id);
//		super.setPicture(picture);
		
//		초기화 관련 내용으로 보통 생성자를 이용한다.
//		Member(id, picture);
		super(id, picture);
		
//		id는 private이므로 직접 접근 불가
//		super.id = id;
		
		this.contents = contents;
		this.chatTime = chatTime;
	}
	
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

