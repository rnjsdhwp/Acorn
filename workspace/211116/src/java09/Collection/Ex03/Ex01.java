package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * hashmap은 Key와 value로 사용된다.
 * Key는 set 형식으로 고유값을 갖으며
 * value는 중복되어도 상관없다.
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "test");
		hm.put(100, "헬로우");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(100));
		
		Set<Integer> ks = hm.keySet();
		for(Integer key : ks)
			System.out.println(key+" : "+hm.get(key));
	}
}
