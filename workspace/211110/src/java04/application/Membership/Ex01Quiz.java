package java04.application.Membership;
// �޼ҵ� �����
// 1. ���� ���Ǵ� �͵��� ��� �޼ҵ� �̸����� ȣ���Ͽ� ���
public class Ex01Quiz {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		String menuStr = "===================\n";
		menuStr += "1. ȸ������\n";
		menuStr += "2. �α���\n";
		menuStr += "3. ����\n";
		menuStr += "===================\n";
		menuStr += "���� �޴��� �����ϼ���? ";
		
		System.out.print(menuStr);
	}
}
