package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 4. 
public class Quiz04 {

	public static void main(String[] args) {
		// final은 값을 고정시킬 경우 사용
		// 수에 어떠한 의미를 부여할 경우 final 사용
		// 일반적으로 대부분의 언어에서 고정된 상수는 대문자로 표현
		final int MAXEFFECTIVERANGE = 50;
		
		Scanner in = new Scanner(System.in);
		System.out.print("거리를 입력하세요. ");
		int distance = in.nextInt();
		String outputStr = "최대유효사거리보다 ";
		
		if(distance > MAXEFFECTIVERANGE) {
			outputStr += (distance - MAXEFFECTIVERANGE)+"m 멉니다.";
		}else if(distance < MAXEFFECTIVERANGE) {
			outputStr += (MAXEFFECTIVERANGE - distance)+"m 가깝습니다.";
		}else {
			outputStr = "최대유효사거리와 같습니다.";
		}
		
		System.out.println(outputStr);
		
		/*int distance = in.nextInt();
		int range = 50;
		int n;
		
		if(distance > range) {
			n = distance - range;
			System.out.println("최대유효사거리보다 " + n + "m 멉니다.");
		}else if(distance == range){
			System.out.println("최대유효사거리입니다.");
		}else {
			n = range - distance;
			System.out.println("최대유효사거리보다 " + n + "m 가깝습니다.");
		}*/
	}

}
