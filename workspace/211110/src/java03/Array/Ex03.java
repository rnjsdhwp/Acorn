package java03.Array;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		int [] nums = new int[10];
		int i=0;
		
		for(i=0; i<10; i++) {
			nums[i] = i*i;
		}
//		36�� �ߺ��ƴٴ� ������ 36�� ��
		for(i=0; i<nums.length; i++) {
			if(nums[i]==36)	break;
		}
		System.out.println(i+"��° �ߺ��� ���ڰ� �����մϴ�.");
	}

}
