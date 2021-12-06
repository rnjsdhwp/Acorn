package java02.Control.Ex05forQuiz;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		final int MUSIC_LENGTH = 230;
		
		Scanner in = new Scanner(System.in);
		int musicSec = 0;
		
		while(true) {
			System.out.print("초를 입력하세요? ");
			musicSec = in.nextInt();
			if(musicSec <= MUSIC_LENGTH)	break;
			System.out.println("노래 길이보다 큰 수입니다.");
			System.out.print("다시 ");
		}
		
		
		//String progress = String.format("%.0f", (float)num/230*100);
		int percent = musicSec*100 / MUSIC_LENGTH;
		String progress =  "";
		int blink = 0;
		
		for(int i=0; i<percent/10; i++) {
			progress += "■";
		}
		
		//%02d => 2자리 공간을 확보하고 유효숫자가 아닌 부분은 0으로 출력
		//progress += String.format("%02d", percent) + "%";
		progress += percent + "%";
		
		
		blink = 10 - progress.length();
		
		for(int i=0; i<blink; i++) {
			progress += " ";
		}
		
		if(progress.length() <= 10) {
			progress += "│";
		}
		
		System.out.println("┌──────────┐");
		System.out.print("│");
		System.out.println(progress);
		System.out.print("└──────────┘");
	}

}
