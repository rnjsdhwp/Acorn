package java02.Control.Ex04for;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// for(초기값;최종값;증감식)
		// 1. 초기값은 한 번만 실행
		// 2. 최종값을 확인하여 참이면 실행
		// 3. for문 내부 코드
		// 4. 증감식
		for(int i=0; i<5; i++) {
			if(i==2)	break;
			System.out.println(i);
		}
		
		int i=0;
		for(; i<5;) {
			if(i==2)	break;
			System.out.println(i);
			i++;
		}
		
		// continue는 현재 조건을 무시하고 계속 실행
		// break는 현재 조건이 맞으면 반복 탈출
		for(i=0; i<5; i++) {
			if(i==2)	continue;
			System.out.println(i);
		}
	}

}
