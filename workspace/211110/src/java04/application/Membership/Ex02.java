package java04.application.Membership;

import java.util.Scanner;

// 메소드 만들기
// 1. 자주 사용되는 것들을 묶어서 메소드 이름으로 호출하여 사용
// 2. 입력값 전달 시 괄호내부를 사용한다. 사용법은 [자료형] [변수형] 이다.
public class Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		menu();
		
		int choice = in.nextInt();
		mainMenuExec(choice);
	}

	private static void mainMenuExec(int choice) {
		System.out.println(choice+" 입력됨");
		
		switch(choice) {
		case 1:
			System.out.println("회원가입 선택");
			break;
		case 2:
			System.out.println("로그인 선택");
			break;
		case 3:
			System.out.println("종료 선택");
			break;
		default:
			System.out.println("잘못된 수를 입력하였습니다.");
		}
	}

//	화면에 메뉴 출력
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
