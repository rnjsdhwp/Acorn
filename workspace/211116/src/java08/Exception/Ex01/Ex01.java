package java08.Exception.Ex01;

public class Ex01 implements InterTest{
	final int NUM=100;
	int result;
	
//	@override�� ��� ������ 
//	�޼ҵ��� �̸� �Ǵ� ���� �κ��� �߸��� ��� ������ �߻���Ŵ
//	�����ڿ��� �߸��� �������� �˸�
	@Override
	public void NoExceptionCase() {
		for(int i =0 ;i<10; i++) {
//			math.random()*100 <= ������ �����ϴ� ���� ����
			result = NUM/(int)(Math.random()*100);
			System.out.println(result);
		}
	}
}
