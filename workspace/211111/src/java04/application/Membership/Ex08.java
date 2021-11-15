package java04.application.Membership;

import java.util.Scanner;

public class Ex08 {
	static String [] names;
	static String [] ids;
	static String [] pws;
	static int idx;
	public static void main(String[] args) {
		init(10);
		addMember();
		Scanner in = new Scanner(System.in);		
		
		menu();
		
		int select = in.nextInt();
		mainMenuExec(in, select);	
		
		outputMembers();
	}
	private static void outputMembers() {
		System.out.println("\n\n�̸�\t\t���̵�\t\t�н�����");
		for(int i=0;i<idx;i++)
			System.out.println(names[i]+"\t\t"+ids[i]+"\t\t"+pws[i]);		
	}
	private static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	private static void menu() {
		String munuStr ="=========================\n";
		munuStr += ("1. ȸ������\n");		
		munuStr += ("2. �α���\n");
		munuStr += ("3. ����\n");
		munuStr += "=========================\n";
		munuStr += "���� �޴��� �����ϼ���?";
		
		System.out.println(munuStr);
	}
	private static void mainMenuExec(Scanner in, int n) {
		switch(n) {
		case 1:	//if(n==1)	
			Membership(in);
			break;
		case 2:
			LoginProc(in);
			break;
		case 3:System.out.println("���� ����");break;
		default:System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}
	private static void LoginPro2(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		for(int i=0;i<idx;i++) {
//			4.1 �迭�� �ִ� ���̵�� �Է¹��� ���̵� ������ ��
			if(ids[i].equals(id)) {
				System.out.println(ids[i] + " " + id);
			}
		}
	}
	private static void LoginProc1(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		for(int i=0;i<idx;i++) {
			System.out.println(ids[i]);
		}
	}
	
//	id�� �����ϴ� ��� �н����� �� �� ��� ���
	private static void LoginProc3(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		for(int i=0;i<idx;i++) {
//		  4.1 �迭�� �ִ� ���̵�� �Է¹��� ���̵� ������ ��
			if(ids[i].equals(id)) {
//		    4.1.1 ���ٸ� �н����� ���ؼ� �α��� �������� ���
				if(pws[i].equals(pw)) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			}
//		    4.1.2 ���� �ʴٸ� �迭�� ���� ��ġ�� �̵�
//			���� ������ for������ �ڵ����� �ݺ������� ������ �ʿ� ����.
		}
//		  4.2 �迭�� ��� ���̵� �� �� ���� ������ ������ �α��� ����		
	}
//	���̵� �������� �ʴ� ��� ����
//	������ ������ ��쵵 ���а� ��Ÿ��
	private static void LoginProc4(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		for(int i=0;i<idx;i++) {
//		  4.1 �迭�� �ִ� ���̵�� �Է¹��� ���̵� ������ ��
			if(ids[i].equals(id)) {
//		    4.1.1 ���ٸ� �н����� ���ؼ� �α��� �������� ���
				if(pws[i].equals(pw)) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			}
//		    4.1.2 ���� �ʴٸ� �迭�� ���� ��ġ�� �̵�
		}
//		  4.2 �迭�� ��� ���̵� �� �� ���� ������ ������ �α��� ����	
		System.out.println("����");
	}
	private static void LoginProc5(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		int i=0;
		for(i=0;i<idx;i++) {
//		  4.1 �迭�� �ִ� ���̵�� �Է¹��� ���̵� ������ ��
			if(ids[i].equals(id)) {
//		    4.1.1 ���ٸ� �н����� ���ؼ� �α��� �������� ���
				if(pws[i].equals(pw)) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
//				id�� ids�� ����Ǿ� �ְ� �н����带 ���������� 
//				id�� �������̱� ������ �� �̻� ���� �ʿ䰡 ����.
				break;
			}
//		    4.1.2 ���� �ʴٸ� �迭�� ���� ��ġ�� �̵�
		}
//		  4.2 �迭�� ��� ���̵� �� �� ���� ������ ������ �α��� ����	
		if(i==idx)
			System.out.println("����");
	}
	
	private static void LoginProc(Scanner in) {
//		2. ���̵� �Է�
		String id = in.next();
//		3. �н����� �Է�
		String pw = in.next();
//		4. �α��� ��ư Ŭ��
//		idx�� ���� ȸ�������� �ο��̹Ƿ� idx���� �ݺ�
		int i=0;
		for(i=0;i<idx;i++) {
//		  4.1 �迭�� �ִ� ���̵�� �Է¹��� ���̵� ������ ��
			if(ids[i].equals(id)) {
//		    4.1.1 ���ٸ� �н����� ���ؼ� �α��� �������� ���
				if(pws[i].equals(pw)) {
					System.out.println("����");
//					return�� �޼ҵ带 �����Ѵ�.
					return;
				}
				
//				else {
//					System.out.println("����");
//				}
//				id�� ids�� ����Ǿ� �ְ� �н����带 ���������� 
//				id�� �������̱� ������ �� �̻� ���� �ʿ䰡 ����.
//				break;
			}
//		    4.1.2 ���� �ʴٸ� �迭�� ���� ��ġ�� �̵�
		}
//		  4.2 �迭�� ��� ���̵� �� �� ���� ������ ������ �α��� ����	
//		if(i==idx)
		System.out.println("����");
	}
	private static void Membership(Scanner in) {
//		Scanner in = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		names[idx] = in .next();		
		System.out.println("���̵� �Է��ϼ���");
		ids[idx] = in .next();	
		System.out.println("�н����带 �Է��ϼ���");
		pws[idx] = in .next();
		idx++;
		
		System.out.println("ȸ�������� ���ϵ����.");
	}
	static void addMember() {
		names[idx] = "������";
		ids[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "ȫ�浿";
		ids[idx] = "gildong";
		pws[idx++] = "1111";
	}
}

/*
 * ���� �ڵ带 Ȱ���Ͽ�
 * �α����� �����ϼ���
 */







