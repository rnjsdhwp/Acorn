package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("안녕");
		lst.add(1,"five");

//		size로 list의 크기를 알 수 있다.
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
//		indexOf를 통해 객체의 위치정보를 얻을 수 있다.
		System.out.println(lst.indexOf("안녕"));
	}
}
