package java06.Inheritance.Ex10;

/*
 * implements, extends �� �� ��� ���� ��� ���Ǹ�
 * class �� �Ǵ� interface ������ extends��
 * inteface �� class ������ implements�� ����Ѵ�.
 */
public class Game implements Attack{

	@Override
	public String MelleAttack() {
		// TODO Auto-generated method stub
		return "�y�y�y";
	}

	@Override
	public String StandoffAttack() {
		// TODO Auto-generated method stub
		return "����";
	}

}
