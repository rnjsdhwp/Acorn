package java02.Control.Ex02ifQuiz;

// �ܺο� �ִ� Scanner��� Ŭ������ ����ϰڴٰ� ����
// ��Ű����.Ŭ������ �������� ����ϸ� *�� �̿��� ���
// ��� Ŭ������ ����Ѵٴ� �ǹ��̴�.
import java.util.Scanner;

/*
 * �ڹٴ� class ����� ����
 * ��� �ڹ� ������ class ���� �ڵ��ؾ� �Ѵ�.
 * Ŭ������ �̸��� ���ϸ�� ���ƾ� �Ѵ�.
 * 
 * Ŭ���������� ���� ���� ����Ǵ� �޼ҵ�(�Լ�)�� main�̴�.
 * */

// 1. �� ���� �Է¹޾� ū ���� ����Ͻÿ�
public class Quiz01 {

	public static void main(String[] args) {
		// ������ �Է� �� Scanner [�ν��Ͻ���] = new Scanner(system.in);
		Scanner in = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int max = n1;
		
		if(n2 > n1 && n2 > n3) {
			max = n2;
		}else if(n3 > n1 && n3 > n2) {
			max = n3;
		}
		System.out.println("ū �� : " + max);

	}

}
