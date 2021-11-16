package java07.AccessController.Ex01;

/*
 * 같은 패키지 내에서는 private를 제외한 모든 접근자 접근 가능
 */
public class Main {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		
		ex01.default_n = 1;
		ex01.public_n = 2;
		ex01.protected_n = 3;
		ex01.private_n = 4;
	}

}
