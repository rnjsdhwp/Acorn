package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 4. 
public class Quiz04 {

	public static void main(String[] args) {
		// final�� ���� ������ų ��� ���
		// ���� ��� �ǹ̸� �ο��� ��� final ���
		// �Ϲ������� ��κ��� ���� ������ ����� �빮�ڷ� ǥ��
		final int MAXEFFECTIVERANGE = 50;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�Ÿ��� �Է��ϼ���. ");
		int distance = in.nextInt();
		String outputStr = "�ִ���ȿ��Ÿ����� ";
		
		if(distance > MAXEFFECTIVERANGE) {
			outputStr += (distance - MAXEFFECTIVERANGE)+"m �ٴϴ�.";
		}else if(distance < MAXEFFECTIVERANGE) {
			outputStr += (MAXEFFECTIVERANGE - distance)+"m �������ϴ�.";
		}else {
			outputStr = "�ִ���ȿ��Ÿ��� �����ϴ�.";
		}
		
		System.out.println(outputStr);
		
		/*int distance = in.nextInt();
		int range = 50;
		int n;
		
		if(distance > range) {
			n = distance - range;
			System.out.println("�ִ���ȿ��Ÿ����� " + n + "m �ٴϴ�.");
		}else if(distance == range){
			System.out.println("�ִ���ȿ��Ÿ��Դϴ�.");
		}else {
			n = range - distance;
			System.out.println("�ִ���ȿ��Ÿ����� " + n + "m �������ϴ�.");
		}*/
	}

}
