package java08.Exception.Ex02;

public class Ex02 implements InterTest{
	final int NUM=100;
	int result;
	
	@Override
	public void NoExceptionCase() {
		for(int i =0 ;i<10; i++) {
			try {
//				���ܰ� �߻��� ������ �����Ǵ� ���� ����
				result = NUM/(int)(Math.random()*100);
			}catch(ArithmeticException e) {
//				���ܰ� �߻����� ��� ó���� ���� ����
				
				result=0;
//				���� ���� ���� ���
				e.printStackTrace();
			}
			System.out.println(result);
		}
	}
}
