package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Iterator�� �̿��Ͽ� �����͸� ��� �� �� �ִ�.
 * hasNext �޼ҵ�� ���� ���縦 Ȯ���ϸ�
 * next �޼ҵ带 �̿��Ͽ� �����͸� ��� �� �� �ִ�. 
 */
public class Ex02 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		������ �߰�
		hs.add("test");
		hs.add("��ο�");
		
//		�����;��
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
	}
}
