package java02.Control.Ex05forQuiz;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		final int MUSIC_LENGTH = 230;
		
		Scanner in = new Scanner(System.in);
		int musicSec = 0;
		
		while(true) {
			System.out.print("�ʸ� �Է��ϼ���? ");
			musicSec = in.nextInt();
			if(musicSec <= MUSIC_LENGTH)	break;
			System.out.println("�뷡 ���̺��� ū ���Դϴ�.");
			System.out.print("�ٽ� ");
		}
		
		
		//String progress = String.format("%.0f", (float)num/230*100);
		int percent = musicSec*100 / MUSIC_LENGTH;
		String progress =  "";
		int blink = 0;
		
		for(int i=0; i<percent/10; i++) {
			progress += "��";
		}
		
		//%02d => 2�ڸ� ������ Ȯ���ϰ� ��ȿ���ڰ� �ƴ� �κ��� 0���� ���
		//progress += String.format("%02d", percent) + "%";
		progress += percent + "%";
		
		
		blink = 10 - progress.length();
		
		for(int i=0; i<blink; i++) {
			progress += " ";
		}
		
		if(progress.length() <= 10) {
			progress += "��";
		}
		
		System.out.println("������������������������");
		System.out.print("��");
		System.out.println(progress);
		System.out.print("������������������������");
	}

}
