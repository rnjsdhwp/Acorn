package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set을 이용하려면 keysey 메소드로 연동할 수 있다.
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("영", "test");
		hm.put("일", "헬로우");
		hm.put("일", "test");
		
		Set<String> ks = hm.keySet();
		for(String key : ks)
			System.out.println(key+" : "+hm.get(key));
	}
}
