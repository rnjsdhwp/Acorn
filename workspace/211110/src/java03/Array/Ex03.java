package java03.Array;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		int [] nums = new int[10];
		int i=0;
		
		for(i=0; i<10; i++) {
			nums[i] = i*i;
		}
//		36이 중복됐다는 가정에 36과 비교
		for(i=0; i<nums.length; i++) {
			if(nums[i]==36)	break;
		}
		System.out.println(i+"번째 중복된 숫자가 존재합니다.");
	}

}
