package java02.Control.Ex04for;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// �����Ŀ��� 1�� ������ i++�� �̿�������
		// 2�̻��� ���������� i=i+2�������� ǥ���� �� �ִ�.
		// ���� i+=2�� �����ϴ�.
		// �� i+2�� �ȵȴ�. �̴� ���� ���� 2�� ���� ����̱� �����̴�.
		int i=0;
		for(/*i=0*/; i<10; i=i+2) {
			System.out.println(i+" ");
		}
		// i�� 10�̵Ǹ� for���� ���ǽ��� ������ �Ǿ� for���� �������´�.
		System.out.println("\nfor out : "+i);
	}

}
