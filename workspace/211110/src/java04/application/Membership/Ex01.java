package java04.application.Membership;
// 메소드 만들기
// 1. 자주 사용되는 것들을 묶어서 메소드 이름으로 호출하여 사용
public class Ex01 {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
	}
}
