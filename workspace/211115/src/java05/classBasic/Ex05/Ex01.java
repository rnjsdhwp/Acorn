package java05.classBasic.Ex05;

public class Ex01 {
	public static void main(String[] args) {
//		생성자가 없을 경우 기본생성자는 생략으로 인식되지만
//		생성자가 존재하면 기본생성자는 생략으로 인식되지 않는다.
//		따라서 기본생성자를 명시해 주어야 사용할 수 있다.
		Member member = new Member();	
		
		System.out.print(member.getPicture() + 
				" " + member.getId());

	}
}
/*
 * 채팅창과 입력창 클래스를 만드시오
 */