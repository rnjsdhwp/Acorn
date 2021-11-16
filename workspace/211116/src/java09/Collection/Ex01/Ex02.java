package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("안녕");
//		데이터 추가 시 위치 지정 가능
		lst.add(2, "five");
//		데이터 수정
		lst.set(2, "three");
//		데이터가 존재하지 않으면 수정 불가
		lst.set(3, "three");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}

}
