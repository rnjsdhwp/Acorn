package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		// null�� �ƹ��� ���� ���ٴ� �ǹ̷� ����
		String visitStr = "��";
		
		if(visitCnt < 1) {
			visitStr = "ù";
		}
		System.out.print(visitStr + " �湮 �����մϴ�.");
	}

}
/*
* �� ���� �Է¹޾� ū ���� ����Ͻÿ�
*/