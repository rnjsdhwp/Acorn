package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set�� �̿��Ϸ��� keysey �޼ҵ�� ������ �� �ִ�.
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("��", "test");
		hm.put("��", "��ο�");
		hm.put("��", "test");
		
		Set<String> ks = hm.keySet();
		for(String key : ks)
			System.out.println(key+" : "+hm.get(key));
	}
}
