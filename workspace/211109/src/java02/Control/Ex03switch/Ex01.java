package java02.Control.Ex03switch;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * switch([���]) { 
		 * 		case [��ġ������]: 
		 * 			[ó�� ����]; 
		 * 			break; 
		 * 		case [��ġ������]: 
		 * 			[ó�� ����]; 
		 * 			break;
		 * 		default: 
		 * 			���� case �̿��� ��� �� 
		 * }
		 */

		// ������ ���� ����� ���� Random Ŭ���� ���
		Random rand = new Random();
		// nextInt() �޼ҵ带 ���� ������ ���� ����
		// nextInt() �޼ҵ忡 ������ �Է��ϸ�
		// 0���� �Է��� ������ ���� ������ ������ ���� ��ȯ
		// nextInt(10) => 0~9
		int num = rand.nextInt();
		// -9 ~ 9 ������ ������ �� ���
		System.out.println(num%10);
		
		switch(num%10) {
		case 9:
			System.out.println("���� �� 9");
			break;
		case -3:
			System.out.println("���� �� -3");
			break;
		default:
			System.out.println("�� �̿� ��� ��");
		}
	}

}
