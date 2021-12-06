package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 2. 숫자를 판별하여 다음과 같이 출력하도록 코딩하시오
/*판별할 수 : 5
 * 양수 : 5
 * 판별할 수 : -7
 * 음수 : 7
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("판별할 수 : ");
		int n1 = in.nextInt();
		// null은 객체가 존재하지 않는다.
		// ""은 객체에 문자열이 비어있다.
		//String은 문자열을 저장할 수 있는 클래스이다.
		String str = "양수";
		
		if(n1 < 0) {
			n1 *= -1;
			str = "음수";
		}
		System.out.println(str + " : " + n1);
	}

}
