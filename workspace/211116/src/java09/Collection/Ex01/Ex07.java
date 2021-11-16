package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		String [] words = {"꿈","나무","어린이","좋아","쉬는날"};
//		위의 정보를 ArrayList에 랜덤하게 저장하여 결과를 출력하시오
		
		List<String> lst = new ArrayList<String>();
		Random rand = new Random();
		
//		배열의 길이만큼 반복
		int len = words.length;
		for(int i=0; i<len; i++) {
//			배열에서 임의의 값을 추출하기 위해 0~len-1까지 추출
			int randIdx = rand.nextInt(len);
//			배열의 임의의 위치값 추출
			String word = words[randIdx];
//			List에 저장
			lst.add(word);
		}
		/*
		for(int i=0; i<words.length; i++) {
			lst.add(i, words[rand.nextInt(words.length)]);
		}
		*/
		
		for(int i=0; i<words.length; i++) {
			System.out.print(lst.get(i)+" ");
		}
		System.out.println("\n======= Sorted =======");
		lst.sort(null);
		for(int i=0; i<words.length; i++) {
			System.out.println(lst.get(i)+" ");
		}
	}

}
