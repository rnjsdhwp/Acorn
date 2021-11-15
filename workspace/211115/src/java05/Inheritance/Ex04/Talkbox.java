package java05.Inheritance.Ex04;
//클래스를 상속 받을 경우 extends를 이용한다.
//현재 코드에서는 Talkbox가 Member를 상속 받는 것이다.
public class Talkbox extends Member{
	private String contents;
	private String chatTime;
	
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
