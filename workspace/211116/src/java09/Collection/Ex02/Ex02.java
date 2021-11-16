package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Iterator를 이용하여 데이터를 얻어 올 수 있다.
 * hasNext 메소드는 값의 존재를 확인하며
 * next 메소드를 이용하여 데이터를 얻어 올 수 있다. 
 */
public class Ex02 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		데이터 추가
		hs.add("test");
		hs.add("헬로우");
		
//		데이터얻기
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
	}
}
