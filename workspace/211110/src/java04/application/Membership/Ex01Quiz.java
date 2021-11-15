package java04.application.Membership;
// 메소드 만들기
// 1. 자주 사용되는 것들을 묶어서 메소드 이름으로 호출하여 사용
public class Ex01Quiz {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		String menuStr = "===================\n";
		menuStr += "1. 회원가입\n";
		menuStr += "2. 로그인\n";
		menuStr += "3. 종료\n";
		menuStr += "===================\n";
		menuStr += "위의 메뉴를 선택하세요? ";
		
		System.out.print(menuStr);
	}
}
