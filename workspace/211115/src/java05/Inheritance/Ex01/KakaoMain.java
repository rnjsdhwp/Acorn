package java05.Inheritance.Ex01;

public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		talkbox.setId("나");
		talkbox.setPicture("없음");
		talkbox.setContents("상속이 뭐여");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());

	}

}
