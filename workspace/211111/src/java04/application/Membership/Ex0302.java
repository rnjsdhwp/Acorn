package java04.application.Membership;

import java.util.Scanner;

/*
 * Array�迭
 * Index��ġ
 * Out����
 * OfBounds����
 * Exception
 */
public class Ex0302 {
	static int idx;
	static String [] m_name;
	static String [] m_ID;
	static String [] m_PW;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();		
		mainMenuExec(choice);
		// ��� �ڷḦ �Է¹��� ������
		
		Scanner init_number = new Scanner(System.in);
		int init_num = init_number.nextInt();
		
		init(init_num);
		
		member_info(choice, init_num, m_name, m_ID, m_PW);
		// ������ �Է¹ޱ�
//		Scanner member_info = new Scanner(System.in);
//		String m_name 	=	member_info.nextLine();
//		String m_ID 	=	member_info.nextLine();
//		String m_PW 	=	member_info.nextLine();
//
//		member_info(choice,init,m_name,m_ID,m_PW);
	}
	private static void init(int size) {
		m_name = new String[size];
		m_ID = new String[size];
		m_PW = new String[size];
	}

	private static void menu() {
		String menuStr = "====================\n";
		menuStr+=("1. ȸ������\n");
		menuStr+=("2. �α���\n");
		menuStr+=("3. ����\n");
		menuStr+=("====================\n");
		menuStr+=("���� �޴��� �����ϼ���?");	
		System.out.println(menuStr);
	}	
	private static void mainMenuExec(int choice) {
		String msg;
		switch(choice) {
		case 1 : msg= "�̸��� �Է��ϼ���."; break;
		case 2 : msg= "�α���"; break;
		case 3 : msg= "����"; break;
		default : msg= "�߸��� ���� �Է��Ͽ����ϴ�.";
		}
		System.out.println(msg);								
	}
	private static void member_info(int choice,int init_number, String[] member_name, String[] member_ID,  String[] member_PW) {
		
		
		System.out.println("choice : " + choice);
		System.out.println("init_num : " + init_number);
		
		String member_info [][] = new String[3][];
		for (int j=0;j<init_number;j++) {
			System.out.println("idx  : "+idx);
			System.out.println("�̸��� �Է��ϼ���");
			Scanner mem_name = new Scanner(System.in);
			String mem_names = mem_name.nextLine();
			member_info[idx][j]=mem_names;
	
			System.out.println("���̵� �Է��ϼ���");
			Scanner mem_ID = new Scanner(System.in);
			String mem_IDs = mem_name.nextLine();
			member_info[idx][j]=mem_IDs;
	
			System.out.println("�н����带 �Է��ϼ���");
			Scanner mem_PW = new Scanner(System.in);
			String mem_PWs = mem_name.nextLine();
			member_info[idx++][j]=mem_PWs;
		}
	}

	

}
/*
 * ���� ����
 * ȸ�� ������ 5�� �ݺ��ϰ� ȸ�� ������ ����Ͻÿ�.
 * ���� �������� ȸ�������� ����Ͻÿ�.
 */


/*
 * ���� �ڵ带 Ȱ���Ͽ� "1. ȸ������"�� ������ ���̴�.
 * ȸ�����Կ� ����� �̸�, ���̵�, �н����带 �迭�������� ����� �ʱ�ȭ�ϴ� �޼ҵ带 �����Ͻÿ�.
 * 
 * 1. �̸�, ���̵�, �н����� ��ü�� �����ϰ� �ʱ�ȭ�ϴ� �޼ҵ� ����
 * 2. ȸ�������� �Է��ϴ� �޼ҵ� ����
 */