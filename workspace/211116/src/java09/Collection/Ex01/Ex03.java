package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("�ȳ�");
//		���� �����͸� ���� ��ġ�� �̵� ��Ű�� �߰�
		lst.add(1,"five");
//		���������� ������ ����
		lst.add(5,"five");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}

}
