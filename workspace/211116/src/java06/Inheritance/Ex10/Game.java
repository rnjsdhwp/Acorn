package java06.Inheritance.Ex10;

/*
 * implements, extends 둘 다 상속 받을 경우 사용되며
 * class 간 또는 interface 간에는 extends를
 * inteface 와 class 간에는 implements를 사용한다.
 */
public class Game implements Attack{

	@Override
	public String MelleAttack() {
		// TODO Auto-generated method stub
		return "푱푱푱";
	}

	@Override
	public String StandoffAttack() {
		// TODO Auto-generated method stub
		return "슝슝";
	}

}
