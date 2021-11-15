package java03.Array;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
//		정수를 저장할 6개의 공간 확보
		int [] nums = new int[6];
		Random rand = new Random();
		
//		입력
		for(int i=0; i<nums.length; i++) {
//			System.out.println(rand.nextInt(45)+1);
			nums[i] = rand.nextInt(45)+1;
		}
		
//		출력
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
