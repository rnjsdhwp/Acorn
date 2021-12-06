package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 3. 
public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요. ");
		int year = in.nextInt();
		int age = (2021 - year + 1)%100;
		
		System.out.println(year + "년에 태어난 당신은 " + age + "살입니다.");
	}

}
