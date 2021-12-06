package java01.Basic.Ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		System.out.println(age + 10);
		
	}
}
/*
 * 다음과 같이 동작되도록 코딩하시오
 * 
 * 당신의 이름을 입력하세요? 000
 * 000님의 나이를 입력해 주세요? xx
 * 000님은 xx살이군요
 */