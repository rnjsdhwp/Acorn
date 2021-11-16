package java07.AccessController.Ex01;

/*
 * 접근 제어자
 * 외부에서 클래스 접근 시 접근 여부를 지정하는 제어자
 * 
 * default
 * 	- 아무것도 사용하지 않은 경우
 * 	- 같은 패키지 내에서만 접근 가능
 * public
 * 	- 외부 공개
 * 	- 모든 경우 접근 가능
 * private
 * 	- 내부 공개
 * 	- 내부 제외한 모든 경우 접근 불가
 * protected
 * 	- 상속 공개
 * 	- 같은 패키지 내에서만 접근 가능
 */
public class Ex01 {
	int default_n;
	public int public_n;
	protected int protected_n;
	private int private_n;
}
