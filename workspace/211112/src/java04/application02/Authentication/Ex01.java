package java04.application02.Authentication;

import java.util.Scanner;

/*
 * method�� �� ����
 * public [��ȯ�ڷ���] [�޼ҵ��]([�ڷ��� ������]����, �Ķ����)
 */
public class Ex01 {
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

	private static int getCertiNum(int i) {
		// TODO Auto-generated method stub
		int certiNum = i * 10;
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
