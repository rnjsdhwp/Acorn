package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * remove�� �̿��Ͽ� �����͸� ������ �� �ִ�.
 */
public class Ex03 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		������ �߰�
		hs.add("test");
		hs.add("��ο�");
		
//		�����;��
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
		System.out.println("����");
		hs.remove("test");
		
		itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
	}
}
