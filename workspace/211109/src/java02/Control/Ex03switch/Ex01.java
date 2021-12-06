package java02.Control.Ex03switch;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * switch([상수]) { 
		 * 		case [수치데이터]: 
		 * 			[처리 내용]; 
		 * 			break; 
		 * 		case [수치데이터]: 
		 * 			[처리 내용]; 
		 * 			break;
		 * 		default: 
		 * 			위의 case 이외의 모든 것 
		 * }
		 */

		// 임의의 수를 만들기 위해 Random 클래스 사용
		Random rand = new Random();
		// nextInt() 메소드를 통해 임의의 정수 생성
		// nextInt() 메소드에 정수를 입력하면
		// 0부터 입력한 수보다 작은 값까지 임의의 정수 반환
		// nextInt(10) => 0~9
		int num = rand.nextInt();
		// -9 ~ 9 까지의 임의의 수 출력
		System.out.println(num%10);
		
		switch(num%10) {
		case 9:
			System.out.println("랜덤 수 9");
			break;
		case -3:
			System.out.println("랜덤 수 -3");
			break;
		default:
			System.out.println("그 이외 모든 수");
		}
	}

}
