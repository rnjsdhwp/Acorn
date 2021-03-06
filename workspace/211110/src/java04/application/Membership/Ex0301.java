package java04.application.Membership;

public class Ex0301 {
//	main외부에 변수를 선언할 경우 현재 클래스에 
//	선언되어 있는 모든 메소드에서 사용할 수 있다.
//	따라서 names는 main뿐 아니라 다른 메소드에서도 사용 가능하다.
	static String [] names;
	static int idx;
	public static void main(String[] args) {
//		이름 초기화
		names=new String[10];
		idx = 0;
//		idx++ => idx = idx + 1
		names[idx++] = "cho younki";
		names[idx++] = "hong gildong";
		
		method1();
	}
	private static void method1() {
		for(int i=0;i<idx;i++)
			System.out.println(names[i]);
	}

}

/*	211111.java04.application.Membership.Ex05
 * 위의 코드를 활용하여 "1. 회원가입"을 구현할 것이다.
 * 회원가입에 사용할 이름, 아이디, 패스워드를 배열형식으로 만들고
 * 초기화하는 메소드를 구현하시오
 * 
 * 1. 이름, 아이디, 패스워드 객체를 생성하고 초기화하는 메소드 생성
 * 2. 회원정보를 입력하는 메소드 구현
 */

