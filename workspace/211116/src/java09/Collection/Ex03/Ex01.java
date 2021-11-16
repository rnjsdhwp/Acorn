package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * hashmap�� Key�� value�� ���ȴ�.
 * Key�� set �������� �������� ������
 * value�� �ߺ��Ǿ �������.
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "test");
		hm.put(100, "��ο�");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(100));
		
		Set<Integer> ks = hm.keySet();
		for(Integer key : ks)
			System.out.println(key+" : "+hm.get(key));
	}
}
