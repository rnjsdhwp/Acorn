package java04.application.Membership;
//메소드 만들기
//1. 자주 사용되는 것들을 묶어서 메소드 이름으로 호출하여 사용
public class Ex00 {
	public static void main(String[] args) {
		int sum = sumf(1,2);
		System.out.println(sum);
		//menu();
	}

	private static int sumf(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	private static void menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
	}
}
