package java06.Inheritance.Ex08;

public class Main {

	public static void main(String[] args) {
//		Main에서 클래스를 생성하게 되면 구현되어 있지 않는 메소드 내용을
//		코드 내부에 구현해야 한다.
//		abstract class를 사용할 일은 오늘 이 시간뿐
		Attack attack = new Attack() {
			@Override
			public String MelleAttack() {
				// TODO Auto-generated method stub
				return "푱푱푱";
			}
		};
		System.out.println(attack.StandoffAttack());
		System.out.println(attack.MelleAttack());
	}
}
