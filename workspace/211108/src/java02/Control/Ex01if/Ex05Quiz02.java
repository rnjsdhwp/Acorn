package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex05Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int max = n1;
		
		if(n1 < n2) {
			max = n2;
		}
		System.out.println(max);
	}

}
