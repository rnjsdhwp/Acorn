package java04.application.Membership;

import java.util.Scanner;

public class Ex08 {
	static String [] names;
	static String [] ids;
	static String [] pws;
	static int idx;
	public static void main(String[] args) {
		init(10);
		addMember();
		Scanner in = new Scanner(System.in);		
		
		menu();
		
		int select = in.nextInt();
		mainMenuExec(in, select);	
		
		outputMembers();
	}
	private static void outputMembers() {
		System.out.println("\n\n이름\t\t아이디\t\t패스워드");
		for(int i=0;i<idx;i++)
			System.out.println(names[i]+"\t\t"+ids[i]+"\t\t"+pws[i]);		
	}
	private static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	private static void menu() {
		String munuStr ="=========================\n";
		munuStr += ("1. 회원가입\n");		
		munuStr += ("2. 로그인\n");
		munuStr += ("3. 종료\n");
		munuStr += "=========================\n";
		munuStr += "위의 메뉴를 선택하세요?";
		
		System.out.println(munuStr);
	}
	private static void mainMenuExec(Scanner in, int n) {
		switch(n) {
		case 1:	//if(n==1)	
			Membership(in);
			break;
		case 2:
			LoginProc(in);
			break;
		case 3:System.out.println("종료 선택");break;
		default:System.out.println("잘못된 수를 입력하였습니다.");
		}
	}
	private static void LoginPro2(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		for(int i=0;i<idx;i++) {
//			4.1 배열에 있는 아이디와 입력받은 아이디가 같은지 비교
			if(ids[i].equals(id)) {
				System.out.println(ids[i] + " " + id);
			}
		}
	}
	private static void LoginProc1(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		for(int i=0;i<idx;i++) {
			System.out.println(ids[i]);
		}
	}
	
//	id가 존재하는 경우 패스워드 비교 후 결과 출력
	private static void LoginProc3(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		for(int i=0;i<idx;i++) {
//		  4.1 배열에 있는 아이디와 입력받은 아이디가 같은지 비교
			if(ids[i].equals(id)) {
//		    4.1.1 같다면 패스워드 비교해서 로그인 성공여부 출력
				if(pws[i].equals(pw)) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
			}
//		    4.1.2 같지 않다면 배열의 다음 위치로 이동
//			위의 내용은 for문에서 자동으로 반복됨으로 구현할 필요 없음.
		}
//		  4.2 배열의 모든 아이디 비교 후 같은 정보가 없으면 로그인 실패		
	}
//	아이디가 존재하지 않는 경우 실패
//	하지만 성공인 경우도 실패가 나타남
	private static void LoginProc4(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		for(int i=0;i<idx;i++) {
//		  4.1 배열에 있는 아이디와 입력받은 아이디가 같은지 비교
			if(ids[i].equals(id)) {
//		    4.1.1 같다면 패스워드 비교해서 로그인 성공여부 출력
				if(pws[i].equals(pw)) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
			}
//		    4.1.2 같지 않다면 배열의 다음 위치로 이동
		}
//		  4.2 배열의 모든 아이디 비교 후 같은 정보가 없으면 로그인 실패	
		System.out.println("실패");
	}
	private static void LoginProc5(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		int i=0;
		for(i=0;i<idx;i++) {
//		  4.1 배열에 있는 아이디와 입력받은 아이디가 같은지 비교
			if(ids[i].equals(id)) {
//		    4.1.1 같다면 패스워드 비교해서 로그인 성공여부 출력
				if(pws[i].equals(pw)) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
//				id가 ids에 저장되어 있고 패스워드를 비교했음으로 
//				id가 고유값이기 때문에 더 이상 비교할 필요가 없다.
				break;
			}
//		    4.1.2 같지 않다면 배열의 다음 위치로 이동
		}
//		  4.2 배열의 모든 아이디 비교 후 같은 정보가 없으면 로그인 실패	
		if(i==idx)
			System.out.println("실패");
	}
	
	private static void LoginProc(Scanner in) {
//		2. 아이디 입력
		String id = in.next();
//		3. 패스워드 입력
		String pw = in.next();
//		4. 로그인 버튼 클릭
//		idx가 현재 회원가입한 인원이므로 idx까지 반복
		int i=0;
		for(i=0;i<idx;i++) {
//		  4.1 배열에 있는 아이디와 입력받은 아이디가 같은지 비교
			if(ids[i].equals(id)) {
//		    4.1.1 같다면 패스워드 비교해서 로그인 성공여부 출력
				if(pws[i].equals(pw)) {
					System.out.println("성공");
//					return은 메소드를 종료한다.
					return;
				}
				
//				else {
//					System.out.println("실패");
//				}
//				id가 ids에 저장되어 있고 패스워드를 비교했음으로 
//				id가 고유값이기 때문에 더 이상 비교할 필요가 없다.
//				break;
			}
//		    4.1.2 같지 않다면 배열의 다음 위치로 이동
		}
//		  4.2 배열의 모든 아이디 비교 후 같은 정보가 없으면 로그인 실패	
//		if(i==idx)
		System.out.println("실패");
	}
	private static void Membership(Scanner in) {
//		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		names[idx] = in .next();		
		System.out.println("아이디를 입력하세요");
		ids[idx] = in .next();	
		System.out.println("패스워드를 입력하세요");
		pws[idx] = in .next();
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

/*
 * 위의 코드를 활용하여
 * 로그인을 구현하세요
 */







