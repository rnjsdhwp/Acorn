package java05.Inheritance.Ex03;
// Talkbox를 생성했지만 내부에 있는 Member 클래스는 생성하지 않았기 때문에 null 출력
public class KakaoMain {

	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
//		talkbox에 member 객체를 생성하기 위해 별도로 생성 후 setter를 통해 저장
		Member member = new Member();
//		talkbox.setMember(member );
		member.setId("나");
		member.setPicture("없음");
		talkbox.setMember(member );
		
		talkbox.setContents("상속이 뭐여");
		talkbox.setChatTime("10:06");
		
		System.out.println(talkbox.getContents());
//		id는 member에 있음으로 getMember를 통해 member를 읽어 들이고
//		getid를 통해 id값 출력
		System.out.println(talkbox.getMember().getId());

	}

}
