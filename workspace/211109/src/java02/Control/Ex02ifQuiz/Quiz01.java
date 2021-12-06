package java02.Control.Ex02ifQuiz;

// 외부에 있는 Scanner라는 클래스를 사용하겠다고 선언
// 패키지명.클래스명 형식으로 사용하며 *을 이용할 경우
// 모든 클래스를 사용한다는 의미이다.
import java.util.Scanner;

/*
 * 자바는 class 기반의 언어로
 * 모든 자바 파일은 class 내에 코딩해야 한다.
 * 클래스의 이름은 파일명과 같아야 한다.
 * 
 * 클래스내에서 가장 먼저 실행되는 메소드(함수)는 main이다.
 * */

// 1. 세 수를 입력받아 큰 수를 출력하시오
public class Quiz01 {

	public static void main(String[] args) {
		// 데이터 입력 시 Scanner [인스턴스명] = new Scanner(system.in);
		Scanner in = new Scanner(System.in);
		
		System.out.print("세 수를 입력하세요 ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int max = n1;
		
		if(n2 > n1 && n2 > n3) {
			max = n2;
		}else if(n3 > n1 && n3 > n2) {
			max = n3;
		}
		System.out.println("큰 수 : " + max);

	}

}
