package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;

/*
 * 중복된 Key를 사용하는 경우 수정으로 인식된다.
 */
public class Ex03 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("영", "test");
		hm.put("일", "헬로우");
		hm.put("일", "test");
		
		System.out.println(hm.get("영"));
		System.out.println(hm.get("일"));
	}
}