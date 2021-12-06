package java02.Control.Ex05forQuiz;

import java.util.Random;

public class Ex02 {
	/*
	 * 다음 조건에 맞도록 두 개의 랜덤한 수를 출력하시오
	 * a. 작은값부터 큰 값 순으로 출력
	 * b. 수의 범위는 1~10으로 정하시오
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int max=1;
		int min=10;
		
		for(int i=0; i<2; i++) {
			int num = rand.nextInt(10)+1;
			
			if(max<num) {max=num;}
			if(min>num) {min=num;}
			
		}
		System.out.println(min+" "+max);
	}

}
