package java04.application02.Authentication;

import java.util.Random;
import java.util.Scanner;

/*
 * method�� �� ����
 * public [��ȯ�ڷ���] [�޼ҵ��]([�ڷ��� ������]����, �Ķ����)
 */
public class Ex0101 {
	public static void main(String[] args) {
//		�޼ҵ��� ��ȣ�� ���� ���� �޼ҵ忡 ������ ������
//		�޼ҵ��� ���� ����� ���Կ��꿡 ���� �������� ���޵Ǹ�
//		�ƹ��͵� ���ٸ� ���޵� ���� �������� �ʴ´�.
//		���� �Է�
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int n = in.nextInt();
//		�Էµ� ������ getCertiNum�� ���� �� ����� authNum�� ����
		int authNum = getCertiNum(n);
//		��� ���
		System.out.println("�Է� �� : "+ n);
		System.out.println("���� ��ȣ : "+authNum);
	}

	private static int getCertiNum(int n) {
//		1. �Է��� ���� �ڸ��� ��ŭ ���
		int digit = 1;
		
		for(int i=0;i<n;i++)
			digit *= 10;
		
//		2. ������ ���� ���� �� �ֵ��� �ڵ�
		Random rand = new Random();
		int certiNum = rand.nextInt(digit);
//		�޼ҵ尡 ������ �� ������ �� ����
		return certiNum;
	}
/*
 * Quiz
 * �Է��� ���� �ڸ��� ��ŭ�� ���� ������ ���� ���� �� �ֵ��� �ڵ��Ͻÿ�
 * ex)
 * ���� �Է��ϼ���?4
 * 
 * 0~10000 ������ ������ ���� ��ȯ
 */ 


}
