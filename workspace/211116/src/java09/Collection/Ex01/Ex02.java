package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("�ȳ�");
//		������ �߰� �� ��ġ ���� ����
		lst.add(2, "five");
//		������ ����
		lst.set(2, "three");
//		�����Ͱ� �������� ������ ���� �Ұ�
		lst.set(3, "three");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}

}
