package java02.Control.Ex04for;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// 증감식에서 1씩 증가는 i++를 이용하지만
		// 2이상의 증감에서는 i=i+2형식으로 표현할 수 있다.
		// 또한 i+=2도 가능하다.
		// 단 i+2는 안된다. 이는 현재 값에 2만 더한 결과이기 때문이다.
		int i=0;
		for(/*i=0*/; i<10; i=i+2) {
			System.out.println(i+" ");
		}
		// i가 10이되면 for문의 조건식이 거짓이 되어 for문을 빠져나온다.
		System.out.println("\nfor out : "+i);
	}

}
