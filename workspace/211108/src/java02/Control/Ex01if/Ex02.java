package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		
		if(visitCnt < 1) {
			System.out.print("첫 방문 감사합니다.");
		}else {
			System.out.print("재 방문 감사합니다.");
		}

	}

}
