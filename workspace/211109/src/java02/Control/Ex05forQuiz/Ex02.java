package java02.Control.Ex05forQuiz;

import java.util.Random;

public class Ex02 {
	/*
	 * ���� ���ǿ� �µ��� �� ���� ������ ���� ����Ͻÿ�
	 * a. ���������� ū �� ������ ���
	 * b. ���� ������ 1~10���� ���Ͻÿ�
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int max=1;
		int min=10;
		
		for(int i=0; i<2; i++) {
			int num = rand.nextInt(10)+1;
			
			if(max<num) {max=num;}
			if(min>num) {min=num;}
			
		}
		System.out.println(min+" "+max);
	}

}
