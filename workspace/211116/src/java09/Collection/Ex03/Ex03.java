package java09.Collection.Ex03;

import java.util.HashMap;
import java.util.Map;

/*
 * �ߺ��� Key�� ����ϴ� ��� �������� �νĵȴ�.
 */
public class Ex03 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("��", "test");
		hm.put("��", "��ο�");
		hm.put("��", "test");
		
		System.out.println(hm.get("��"));
		System.out.println(hm.get("��"));
	}
}