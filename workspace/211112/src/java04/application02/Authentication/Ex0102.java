package java04.application02.Authentication;

import java.util.Random;
import java.util.Scanner;

/*
 * method의 값 전달
 * public [반환자료형] [메소드명]([자료형 변수명]인자, 파라미터)
 */
public class Ex0102 {
	public static void main(String[] args) {
//		메소드의 괄호에 들어가는 값은 메소드에 전달할 데이터
//		메소드의 실행 결과는 대입연산에 의해 왼쪽으로 전달되며
//		아무것도 없다면 전달된 값을 저장하지 않는다.
//		정수 입력
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = in.nextInt();
//		입력된 정수를 getCertiNum에 전달 후 결과를 authNum에 저장
		int authNum = getCertiNum(n);
//		결과 출력
		System.out.println("입력 값 : "+ n);
		System.out.println("인증 번호 : "+authNum);
	}

	private static int getCertiNum(int n) {
//		Math는 수학 관련 정보를 담고 있는 클래스
//		pow는 승수를 표현한다. 인자는 두 개 이며
//		앞의 수에 대한 뒤의 승수로 표현된다.
//		즉, 10의 n승이 된다.
//		반환 자료형은 double(실수)형이다.
//		현재 digit이 int 형이므로 반환 결과를 int로 변경하기 위해
//		형변환 (int) 를 진행한 것이다.
		int digit = (int) Math.pow(10, n);
		Random rand = new Random();
		int certiNum = rand.nextInt(digit);
		
		String certiNumStr = String.format("%04d", certiNum);
		System.out.println(certiNumStr);
//		메소드가 실행한 후 전달할 값 지정
		return certiNum;
	}
/*
 * 충일 퀴즈
 * CertinumStr을 return으로 반환할 수는 없나요??
 */ 


}
