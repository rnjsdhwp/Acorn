package java01.Basic.Ex04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력하세요?(m기준) ");
		float h = in.nextFloat();
		float standardWeightMan = h * h * 22;
		float standardWeightWoman = h * h * 21;
		System.out.println("표준 체중 계산");
		System.out.println("====================");
		System.out.println("남자 : " + standardWeightMan);
		System.out.println("여자 : " + standardWeightWoman);
		System.out.println("====================");
		
		System.out.print("당신의 몸무게를 입력하세요? ");
		float w = in.nextFloat();
		
		System.out.println();
		System.out.println("비만도 계산");
		System.out.println("남자 : " + ((w - standardWeightMan)/standardWeightMan)*100);
		String test = String.format("%.2f", ((w - standardWeightWoman)/standardWeightWoman)*100);
		System.out.println("여자 : " + test);
		System.out.println("여자 : " + ((w - standardWeightWoman)/standardWeightWoman)*100);
		System.out.println("====================");
	}

}
/*
 * 다음과 같이 동작되도록 코딩하시오
 * 2. 비만도 계산하기
 * 		(현재체중 - 표준체중) / 표준체중 * 100
 */