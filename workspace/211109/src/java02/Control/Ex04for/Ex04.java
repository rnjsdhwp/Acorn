package java02.Control.Ex04for;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// 증감식은 어떠한 연산식이든 가능하다.
		// 곱셈의 경우 시작값이 0이면 항상 0이므로
		// 초기값은 1이상이어야 한다.
		int i=1;
		for(; i<10; i*=2) {
			System.out.println(i+" ");
		}
		System.out.println("\nfor out : "+i);
	}

}
