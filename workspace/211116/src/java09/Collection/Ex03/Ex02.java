package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;

/*
 * Key는 Integer뿐 아니라 String으로도 사용 가능하다.
 * value는 중복되어도 상관없다.
 */
public class Ex02 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("영", "test");
		hm.put("일", "헬로우");
		hm.put("오", "test");
		
		System.out.println(hm.get("영"));
		System.out.println(hm.get("오"));
	}
}
