package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList�� �̿��� �ǽ�
 * �迭�� Ư¡�� ������ ������
 * �˻��� Ưȭ�Ǿ� ������
 * ������ �߰�, ���� �� ���� �ڿ��� �Ҹ��ϰ� �ȴ�.
 * 
 * LinkedList Ư¡
 * �����͵��� �����ϴ� �ּҸ� ������ �־�
 * �˻� �� ��������
 * ������ �߰�, ���� �� �������� �̵��� ���� ȿ�����̴�.
 */
public class Ex01 {

	public static void main(String[] args) {
//		List�� �������̽��̰� <>���� ������ �ڷ���
//		�������̽��� ��� Ŭ������ �����ϴ��Ŀ� ���� �ٸ��� ���۵�
		List<String> lst = new ArrayList<String>();
//		List<String> lst = new LinkedList<String>();

//		������ �߰�
		lst.add("test");
		lst.add("�ȳ�");
		
//		������ ���
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
	}

}
