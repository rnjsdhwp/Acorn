package java02.Control.Ex05forQuiz;

import java.util.Random;

public class Ex0201 {
	/*
	 * ���� ���ǿ� �µ��� �� ���� ������ ���� ����Ͻÿ�
	 * a. ���������� ū �� ������ ���
	 * b. ���� ������ 1~10���� ���Ͻÿ�
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int max=rand.nextInt(10)+1;
		int min=rand.nextInt(10)+1;
		
		if(min>max) {
			int tmp=min;
			min=max;
			max=tmp;
		}
		System.out.println(min+" "+max);
	}

}
