package java02.Control.Ex02ifQuiz;

import java.util.Scanner;

// 3. 
public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���. ");
		int year = in.nextInt();
		int age = (2021 - year + 1)%100;
		
		System.out.println(year + "�⿡ �¾ ����� " + age + "���Դϴ�.");
	}

}
