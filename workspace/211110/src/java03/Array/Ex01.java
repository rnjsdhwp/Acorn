package java03.Array;
/*
 * 배열의 기본 문법
 * 자료형 [] 배열명 = new 자료형[size];
 * 자료형 배열명 [] = new 자료형[size];
 * 
 * 배열의 위치정보(index)는 0부터 시작
 */
public class Ex01 {

	public static void main(String[] args) {
//		정수형 배열로 10개의 공간을 생성
		int [] nums = new int[10];

		for(int i=0; i<10; i++) {
			nums[i] = i*i;
		}
		
		System.out.println(nums[3]);
	}

}
