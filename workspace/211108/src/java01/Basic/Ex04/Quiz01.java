package java01.Basic.Ex04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� Ű�� �Է��ϼ���?(m����) ");
		float h = in.nextFloat();
		float standardWeightMan = h * h * 22;
		float standardWeightWoman = h * h * 21;
		System.out.println("ǥ�� ü�� ���");
		System.out.println("====================");
		System.out.println("���� : " + standardWeightMan);
		System.out.println("���� : " + standardWeightWoman);
		System.out.println("====================");
		
		System.out.print("����� �����Ը� �Է��ϼ���? ");
		float w = in.nextFloat();
		
		System.out.println();
		System.out.println("�񸸵� ���");
		System.out.println("���� : " + ((w - standardWeightMan)/standardWeightMan)*100);
		String test = String.format("%.2f", ((w - standardWeightWoman)/standardWeightWoman)*100);
		System.out.println("���� : " + test);
		System.out.println("���� : " + ((w - standardWeightWoman)/standardWeightWoman)*100);
		System.out.println("====================");
	}

}
/*
 * ������ ���� ���۵ǵ��� �ڵ��Ͻÿ�
 * 2. �񸸵� ����ϱ�
 * 		(����ü�� - ǥ��ü��) / ǥ��ü�� * 100
 */