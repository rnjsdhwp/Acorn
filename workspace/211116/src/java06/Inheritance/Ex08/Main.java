package java06.Inheritance.Ex08;

public class Main {

	public static void main(String[] args) {
//		Main���� Ŭ������ �����ϰ� �Ǹ� �����Ǿ� ���� �ʴ� �޼ҵ� ������
//		�ڵ� ���ο� �����ؾ� �Ѵ�.
//		abstract class�� ����� ���� ���� �� �ð���
		Attack attack = new Attack() {
			@Override
			public String MelleAttack() {
				// TODO Auto-generated method stub
				return "�y�y�y";
			}
		};
		System.out.println(attack.StandoffAttack());
		System.out.println(attack.MelleAttack());
	}
}
