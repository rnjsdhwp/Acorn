package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Set;

/*
 * hashset�� �������� �ߺ��� �����ϰ�
 * ������ �����͸� ������ ��� ���ȴ�.
 */
public class Ex01 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

//		������ �߰�
		hs.add("test");
		hs.add("��ο�");
		
//		�����;��
		for(String str : hs)
			System.out.println(str);
		
	}
}
