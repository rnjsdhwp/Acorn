package java05.Inheritance.Ex05;
// 생성자를 이용한 초기화
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox("나", "없음", 
				"상속이 뭐여", "10:06");
//		talkbox가 member를 상속 받아 member 내의 메소드를 사용할 수 있음
//		talkbox.setId("나");
//		talkbox.setPicture("없음");
//		talkbox.setContents("상속이 뭐여");
//		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getId());
	}
}
