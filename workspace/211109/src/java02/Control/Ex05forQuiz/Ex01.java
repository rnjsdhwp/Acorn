package java02.Control.Ex05forQuiz;

import java.util.Random;

public class Ex01 {
	/*
	 * 다음의 조건에 맞도록 10개의 랜덤한 수를 출력하시오
	 * a. 수의 범위는 1~100으로 정한다.
	 * b. 10개의 수를 무작위하게 나열하며 가장 큰 수만 한번 더 출력
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int num=0, max=1, min=100;
		
		for(int i=0; i<10; i++) {
			num = rand.nextInt(100)+1;
			System.out.print(num+" ");
			if(max<num) {
				max=num;
			}
			if(min>num) {
				min=num;
			}
		}
		System.out.println();
		System.out.println("제일 큰 수 : " + max);
		System.out.print("제일 작은 수 : " + min);
	}

}
