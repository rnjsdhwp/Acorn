package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList를 이용한 실습
 * 배열의 특징을 가지고 있으며
 * 검색에 특화되어 있지만
 * 데이터 추가, 삭제 시 많은 자원을 소모하게 된다.
 * 
 * LinkedList 특징
 * 데이터들을 연결하는 주소를 가지고 있어
 * 검색 시 느리지만
 * 데이터 추가, 삭제 시 데이터의 이동이 없어 효율적이다.
 */
public class Ex01 {

	public static void main(String[] args) {
//		List는 인터페이스이고 <>안은 저장할 자료형
//		인터페이스에 어떠한 클래스를 적용하느냐에 따라 다르게 동작됨
		List<String> lst = new ArrayList<String>();
//		List<String> lst = new LinkedList<String>();

//		데이터 추가
		lst.add("test");
		lst.add("안녕");
		
//		데이터 얻기
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
	}

}
