package java04.application.Membership;

public class Ex03 {
	//main외부에 변수를 선언할 경우 현재 클래스에 선언되어 있는 모든 메소드에서 사용할 수 있다.
	//따라서 names는 main뿐 아니라 다른 메소드에서도 사용 가능하다.
	//멤버 변수 : class 내부에 존재하는 변수
	static String [] names;
	public static void main(String[] args) {
		names=new String[10];
		
		names[0] = "cho younki";
		names[1] = "hong gildong";
		
		method1();
	}
	private static void method1() {
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}