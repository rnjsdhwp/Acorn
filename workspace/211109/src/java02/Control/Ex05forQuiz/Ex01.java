package java02.Control.Ex05forQuiz;

import java.util.Random;

public class Ex01 {
	/*
	 * ������ ���ǿ� �µ��� 10���� ������ ���� ����Ͻÿ�
	 * a. ���� ������ 1~100���� ���Ѵ�.
	 * b. 10���� ���� �������ϰ� �����ϸ� ���� ū ���� �ѹ� �� ���
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int num=0, max=1, min=100;
		
		for(int i=0; i<10; i++) {
			num = rand.nextInt(100)+1;
			System.out.print(num+" ");
			if(max<num) {
				max=num;
			}
			if(min>num) {
				min=num;
			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.print("���� ���� �� : " + min);
	}

}
