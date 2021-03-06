package java04.application.Membership;

import java.util.Scanner;

public class Ex05 {
	static String [] names;
	static String [] ids;
	static String [] pws;
	static int idx;
	
	public static void main(String[] args) {
		init(10);
		Scanner in = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			menu();
			
			int choice = in.nextInt();
			mainMenuExec(choice, in);
		}
		
		for(int i=0; i<idx; i++) {
			System.out.println(names[i]);
		}
	}
	private static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		idx = 0;
	}
	private static void menu() {
		String menuStr = "==================\n";
		menuStr += "1. 회원가입\n";
		menuStr += "2. 로그인\n";
		menuStr += "3. 종료\n";
		menuStr += "==================\n";
		menuStr += "위의 메뉴를 선택하세요? ";
		
		System.out.print(menuStr);
	}
	private static void mainMenuExec(int n, Scanner in) {
		switch (n) {
		case 1:
			System.out.println("회원가입을 선택하셨습니다.");
			Membership(in);
			break;
		case 2:
			System.out.println("로그인 선택.");
			break;
		case 3:
			System.out.println("종료 선택");
			break;
		default:
			System.out.println("잘못된 번호를 입력하셨습니다.");
			break;
		}
	}
	private static void Membership(Scanner in) {
		//Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. ");
		names[idx] = in.next();
		System.out.print("아이디를 입력하세요. ");
		ids[idx] = in.next();
		System.out.print("비밀번호를 입력하세요. ");
		pws[idx] = in.next();
	
		idx++;
		System.out.println("회원가입을 축하드려요.");
	}

}
