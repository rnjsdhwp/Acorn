package java09.Collection.Ex02;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet�� �����͸� �����Ͽ� �����Ѵ�.
 */
public class Ex06 {
	public static void main(String[] args) {
		String [] words={"java", "microsoft",
				"chrome", "eclipse", "linux"
		};
		
//		Set<String> hs = new HashSet<String>();
//		descendingIterator �޼ҵ带 �̿��ϱ� ���� TreeSet���� ����
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
//		descendingIterator �޼ҵ�� ������������ ����
		Iterator<String> itrt = hs.descendingIterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
	}
}
