package java01.Basic.Ex02;

import java.util.Scanner;

//글자 크기 지정
// ctrl+shift +
// ctrl+shift -
public class Ex01 {
	public static void main(String[] args) {
		// Scanner라는 클래스를 in 이라는 변수로 지정하여 사용하겠다.
		// java에서는 클래스를 변수화한 것을 인스턴스(instance)라고 한다.
		// 클래스를 인스턴스화 시킬 경우 다음과 같은 문법으로 사용된다.
		// [클래스명] [인스턴스명] = new [클래스명]
		Scanner in = new Scanner(System.in);
		
		// String은 문자열을 처리하느 클래스이다.
		// 문자열을 저장할 경우 in 인스턴스의 next()라는 메소드를 이용함
		String name = in.next();
		System.out.println(name);
		
	}
}

/*
 * 당신의 이름을 입력하세요? 
 * 000 000님 안녕하세요
 */

