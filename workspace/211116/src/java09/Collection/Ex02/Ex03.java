package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * remove를 이용하여 데이터를 삭제할 수 있다.
 */
public class Ex03 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		데이터 추가
		hs.add("test");
		hs.add("헬로우");
		
//		데이터얻기
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
		System.out.println("삭제");
		hs.remove("test");
		
		itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
	}
}
