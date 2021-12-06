package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex05Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요 ");
		int max = in.nextInt();
		int n2 = in.nextInt();
		
		if(max < n2) {
			max = n2;
		}
		System.out.println(max);
	}

}
