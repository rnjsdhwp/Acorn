package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		
		if(visitCnt < 1) {
			System.out.print("ù �湮 �����մϴ�.");
		}else {
			System.out.print("�� �湮 �����մϴ�.");
		}

	}

}
