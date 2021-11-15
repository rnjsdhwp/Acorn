package java04.application02.Authentication;

import java.util.Random;
import java.util.Scanner;

/*
 * method의 값 전달
 * public [반환자료형] [메소드명]([자료형 변수명]인자, 파라미터)
 */
public class Ex0103 {
	public static void main(String[] args) {
//		메소드의 괄호에 들어가는 값은 메소드에 전달할 데이터
//		메소드의 실행 결과는 대입연산에 의해 왼쪽으로 전달되며
//		아무것도 없다면 전달된 값을 저장하지 않는다.
//		정수 입력
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = in.nextInt();
//		입력된 정수를 getCertiNum에 전달 후 결과를 authNum에 저장
		String authNum = getCertiNum(n);
//		결과 출력
		System.out.println("입력 값 : "+ n);
		System.out.println("인증 번호 : "+authNum);
	}

//	문자열을 반환하고 싶으면 int를 String으로 변경하면 된다.
	private static String getCertiNum(int n) {
		int digit = (int) Math.pow(10, n);
		Random rand = new Random();
		int certiNum = rand.nextInt(digit);
		
		String certiNumStr = String.format("%04d", certiNum);
//		메소드가 실행한 후 전달할 값 지정
		return certiNumStr;
	}
/*
 * 충일 퀴즈
 * CertinumStr을 return으로 반환할 수는 없나요??
 */ 


}
