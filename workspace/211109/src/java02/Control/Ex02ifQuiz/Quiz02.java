package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 2. ���ڸ� �Ǻ��Ͽ� ������ ���� ����ϵ��� �ڵ��Ͻÿ�
/*�Ǻ��� �� : 5
 * ��� : 5
 * �Ǻ��� �� : -7
 * ���� : 7
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�Ǻ��� �� : ");
		int n1 = in.nextInt();
		// null�� ��ü�� �������� �ʴ´�.
		// ""�� ��ü�� ���ڿ��� ����ִ�.
		//String�� ���ڿ��� ������ �� �ִ� Ŭ�����̴�.
		String str = "���";
		
		if(n1 < 0) {
			n1 *= -1;
			str = "����";
		}
		System.out.println(str + " : " + n1);
	}

}
