package java05.Inheritance.Ex04;
// Talkbox를 생성했지만 내부에 있는 Member 클래스는 생성하지 않았기 때문에 null 출력
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
//		talkbox가 member를 상속 받아 member 내의 메소드를 사용할 수 있음
		talkbox.setId("나");
		talkbox.setPicture("없음");
		talkbox.setContents("상속이 뭐여");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getId());
	}
}
