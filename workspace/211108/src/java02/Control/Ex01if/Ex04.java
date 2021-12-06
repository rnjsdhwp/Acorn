package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		// null은 아무런 값도 없다는 의미로 사용됨
		String visitStr = "재";
		
		if(visitCnt < 1) {
			visitStr = "첫";
		}
		System.out.print(visitStr + " 방문 감사합니다.");
	}

}
/*
* 두 수를 입력받아 큰 수를 출력하시오
*/