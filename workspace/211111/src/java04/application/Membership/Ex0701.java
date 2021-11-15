package java04.application.Membership;

import java.util.Scanner;

public class Ex0701 {
	static String [] names;
	static String [] ids;
	static String [] pws;
	static int idx;
	
	public static void main(String[] args) {
		init(10);
		addMember();
		Scanner in = new Scanner(System.in);
		//System.out.print("이름을 입력하세요. ");

//		ctrl + /
		menu();
		
		int choice = in.nextInt();
		mainMenuExec(choice, in);
		
		outputMembers();
	}
	
	private static void LoginProc(Scanner in) {
//		2. 아이디입력
		System.out.print("아이디를 입력하세요. ");
		String id = in.next();
//		3. 패스워드 입력
		System.out.print("패스워드를 입력하세요. ");
		String pw = in.next();
		
//		4. 로그인버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		for(int i=0; i<idx; i++) {

		}
//		4.2 배열의 모든 아이디 비교 후 같은 정보가 없으면 로그인 실패
		System.out.println("존재하지 않는 아이디입니다.");
	}
	private static void outputMembers() {
		//System.out.println("\n\n이름\t\t아이디\t\t패스워드");
		System.out.printf("\n\n%-15s%-15s%-15s\n","이름","아이디","패스워드");
		for(int i=0; i<idx; i++) {
			//System.out.println(names[i]+"\t\t"+ids[i]+"\t\t"+pws[i]);
			System.out.printf("%-15s%-15s%-15s\n",names[i],ids[i],pws[i]);
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
			LoginProc(in);
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
	static void addMember() {
		names[idx] = "조윤기";
		ids[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "홍길동";
		ids[idx] = "gildong";
		pws[idx++] = "1111";
	}

}
