package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Set;

/*
 * hashset은 데이터의 중복을 배제하고
 * 고유한 데이터만 저장할 경우 사용된다.
 */
public class Ex01 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		데이터 추가
		hs.add("test");
		hs.add("헬로우");
		
//		데이터얻기
		for(String str : hs)
			System.out.println(str);
		
	}
}
