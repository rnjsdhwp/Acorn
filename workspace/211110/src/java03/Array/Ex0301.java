package java03.Array;

import java.util.Random;

public class Ex0301 {

	public static void main(String[] args) {
//		정수를 저장할 6개의 공간 확보
		int [] lotto = new int[6];
		Random rand = new Random();
		
//		입력
		for(int i=0; i<lotto.length; i++) {
//			랜덤 로또 번호 생성
			int randNum = rand.nextInt(45)+1;
//			중복 체크를 하기 위한 변수
			boolean isDup = false;
//			기존 lotto 배열에 저장된 값과 현재 생성된 값이 같은지 비교
			for(int j=0; j<i; j++) {
				if(lotto[j] == randNum) {
					System.out.println(i + " : " + lotto[j]);
					isDup = true;
					i--;
					break;
				}
			}
//			lotto 배열에 랜덤 번호 저장
			if(isDup == false) {
				lotto[i] = randNum;
			}
		}
		System.out.println("=======================");
//		출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
