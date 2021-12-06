package java02.Control.Ex04for;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// for문에서 초기값은 외부에서 설정할 수 있으며
		// 외부에서 초기값을 설정하면 for문 내에서는 생략 가능하다.
		int i=0;
		for(/*i=0*/; i<10; i++) {
			System.out.println(i+" ");
		}
		// i가 10이되면 for문의 조건식이 거짓이 되어 for문을 빠져나온다.
		System.out.println("\nfor out : "+i);
	}

}
