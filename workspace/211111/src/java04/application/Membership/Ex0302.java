package java04.application.Membership;

import java.util.Scanner;

/*
 * Array배열
 * Index위치
 * Out나감
 * OfBounds범위
 * Exception
 */
public class Ex0302 {
	static int idx;
	static String [] m_name;
	static String [] m_ID;
	static String [] m_PW;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();		
		mainMenuExec(choice);
		// 몇개의 자료를 입력받을 것인지
		
		Scanner init_number = new Scanner(System.in);
		int init_num = init_number.nextInt();
		
		init(init_num);
		
		member_info(choice, init_num, m_name, m_ID, m_PW);
		// 각각을 입력받기
//		Scanner member_info = new Scanner(System.in);
//		String m_name 	=	member_info.nextLine();
//		String m_ID 	=	member_info.nextLine();
//		String m_PW 	=	member_info.nextLine();
//
//		member_info(choice,init,m_name,m_ID,m_PW);
	}
	private static void init(int size) {
		m_name = new String[size];
		m_ID = new String[size];
		m_PW = new String[size];
	}

	private static void menu() {
		String menuStr = "====================\n";
		menuStr+=("1. 회원가입\n");
		menuStr+=("2. 로그인\n");
		menuStr+=("3. 종료\n");
		menuStr+=("====================\n");
		menuStr+=("위의 메뉴를 선택하세요?");	
		System.out.println(menuStr);
	}	
	private static void mainMenuExec(int choice) {
		String msg;
		switch(choice) {
		case 1 : msg= "이름을 입력하세요."; break;
		case 2 : msg= "로그인"; break;
		case 3 : msg= "종료"; break;
		default : msg= "잘못된 수를 입력하였습니다.";
		}
		System.out.println(msg);								
	}
	private static void member_info(int choice,int init_number, String[] member_name, String[] member_ID,  String[] member_PW) {
		
		
		System.out.println("choice : " + choice);
		System.out.println("init_num : " + init_number);
		
		String member_info [][] = new String[3][];
		for (int j=0;j<init_number;j++) {
			System.out.println("idx  : "+idx);
			System.out.println("이름을 입력하세요");
			Scanner mem_name = new Scanner(System.in);
			String mem_names = mem_name.nextLine();
			member_info[idx][j]=mem_names;
	
			System.out.println("아이디를 입력하세요");
			Scanner mem_ID = new Scanner(System.in);
			String mem_IDs = mem_name.nextLine();
			member_info[idx][j]=mem_IDs;
	
			System.out.println("패스워드를 입력하세요");
			Scanner mem_PW = new Scanner(System.in);
			String mem_PWs = mem_name.nextLine();
			member_info[idx++][j]=mem_PWs;
		}
	}

	

}
/*
 * 충일 퀴즈
 * 회원 가입을 5번 반복하고 회원 정보를 출력하시오.
 * 가장 마지막에 회원정보를 출력하시오.
 */


/*
 * 위의 코드를 활용하여 "1. 회원가입"을 구현할 것이다.
 * 회원가입에 사용할 이름, 아이디, 패스워드를 배열형식으로 만들고 초기화하는 메소드를 구현하시오.
 * 
 * 1. 이름, 아이디, 패스워드 객체를 생성하고 초기화하는 메소드 생성
 * 2. 회원정보를 입력하는 메소드 구현
 */