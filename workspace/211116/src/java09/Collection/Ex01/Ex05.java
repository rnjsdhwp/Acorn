package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("�ȳ�");
		lst.add(1,"five");

		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}

		//��ġ�� �����Ͽ� �����͸� ���� �� �ִ�.
		System.out.println("����");
		lst.remove(2);

		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}
}