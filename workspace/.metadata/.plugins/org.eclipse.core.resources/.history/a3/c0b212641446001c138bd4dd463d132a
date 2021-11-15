package java04.application02.Authentication;

import java.util.Random;
import java.util.Scanner;

/*
 * method의 값 전달
 * public [반환자료형] [메소드명]([자료형 변수명]인자, 파라미터)
 */
public class Ex0101 {
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
//		1. 입력한 수를 자리수 만큼 출력
		int digit = 1;
		
		for(int i=0;i<n;i++)
			digit *= 10;
		
//		2. 임의의 값이 나올 수 있도록 코딩
		Random rand = new Random();
		int certiNum = rand.nextInt(digit);
//		메소드가 실행한 후 전달할 값 지정
		return certiNum;
	}
/*
 * Quiz
 * 입력한 수의 자리수 만큼에 대한 임의의 값이 나올 수 있도록 코딩하시오
 * ex)
 * 수를 입력하세요?4
 * 
 * 0~10000 사이의 임의의 난수 반환
 */ 


}
