package java02.Control.Ex04for;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// for(�ʱⰪ;������;������)
		// 1. �ʱⰪ�� �� ���� ����
		// 2. �������� Ȯ���Ͽ� ���̸� ����
		// 3. for�� ���� �ڵ�
		// 4. ������
		for(int i=0; i<5; i++) {
			if(i==2)	break;
			System.out.println(i);
		}
		
		int i=0;
		for(; i<5;) {
			if(i==2)	break;
			System.out.println(i);
			i++;
		}
		
		// continue�� ���� ������ �����ϰ� ��� ����
		// break�� ���� ������ ������ �ݺ� Ż��
		for(i=0; i<5; i++) {
			if(i==2)	continue;
			System.out.println(i);
		}
	}

}
