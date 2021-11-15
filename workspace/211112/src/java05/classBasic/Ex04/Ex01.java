package java05.classBasic.Ex04;

public class Ex01 {
	public static void main(String[] args) {
//		생성자
//		객체를 생성할 경우 동작되는 초기화
//		현재는 id와 picture를 설정하려고 하는 것이다.
		Member member = new Member("조윤기", "사진없음.");
		
//		member.setId("조윤기");
//		member.setPicture("사진없음.");
		
		System.out.print(member.getPicture() + 
				" " + member.getId());

	}
}
/*
 * 채팅창과 입력창 클래스를 만드시오
 */