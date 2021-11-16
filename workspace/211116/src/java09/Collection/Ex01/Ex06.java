package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("안녕");
		lst.add(1,"five");

		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}

//		비어 있는지 확인
		if(lst.isEmpty()) {
			System.out.println("clear");
		}
		
		System.out.println("전체 삭제");
		lst.clear();
		System.out.println(lst.size());
		if(lst.isEmpty()) {
			System.out.println("clear");
		}
	}
}