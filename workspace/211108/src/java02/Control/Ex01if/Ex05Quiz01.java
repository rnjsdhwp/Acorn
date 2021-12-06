package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex05Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요 ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
	}

}
