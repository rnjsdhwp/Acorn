package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("�ȳ�");
		lst.add(1,"five");

//		size�� list�� ũ�⸦ �� �� �ִ�.
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
//		indexOf�� ���� ��ü�� ��ġ������ ���� �� �ִ�.
		System.out.println(lst.indexOf("�ȳ�"));
	}
}
