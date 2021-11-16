package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();

		lst.add("test");
		lst.add("안녕");
//		기존 데이터를 다음 위치로 이동 시키고 추가
		lst.add(1,"five");
//		연속적이지 않으면 에러
		lst.add(5,"five");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}

}
