package java03.Array;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
//		������ ������ 6���� ���� Ȯ��
		int [] nums = new int[6];
		Random rand = new Random();
		
//		�Է�
		for(int i=0; i<nums.length; i++) {
//			System.out.println(rand.nextInt(45)+1);
			nums[i] = rand.nextInt(45)+1;
		}
		
//		���
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
