package java09.Collection.Ex02;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet은 데이터를 정렬하여 저장한다.
 */
public class Ex06 {
	public static void main(String[] args) {
		String [] words={"java", "microsoft",
				"chrome", "eclipse", "linux"
		};
		
//		Set<String> hs = new HashSet<String>();
//		descendingIterator 메소드를 이용하기 위해 TreeSet으로 설정
		TreeSet<String> hs = new TreeSet<String>();
		Random rand = new Random();
		
		int len = words.length;
		
		for(int i=0;i<len;i++) {
			String word = words[rand.nextInt(len)];
			hs.add(word);
			System.out.println(word);
		}
		System.out.println("=========================");
		for(String str : hs)
			System.out.println(str);
		
		System.out.println("=========================");
//		descendingIterator 메소드는 내림차순으로 정렬
		Iterator<String> itrt = hs.descendingIterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
	}
}
