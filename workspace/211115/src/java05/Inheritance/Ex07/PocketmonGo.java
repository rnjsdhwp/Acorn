package java05.Inheritance.Ex07;

import java.util.Random;

/*
 * PocketmonGo
 * 이름
 * 능력치 
 *  - 생명력
 *  - 몸무게
 *  - 키
 *  - 별의모래
 *  - 사탕
 */
public class PocketmonGo extends GameChar{
	public PocketmonGo() {
		super(5);
		String [] ability = {"생명력", "몸무게","키", "별의모래", "사탕"};
		int [] data = {35, 4, 28, 18854, 38};
		
		for(int i=0;i<ability.length;i++) {
			setFaculty(ability[i], data[i], i);
		}
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showAbility() {
		String [] facultyName = getFacultyName();
		int [] facultyData = getFacultyData();
		
		System.out.println(name);
		for(int i=0;i<facultyData.length;i++)
			System.out.println(facultyName[i] + " : " + facultyData[i]);
	}
	
	public void BuildUp(int buildRate) {
//		1. 랜덤 함수를 생성한 후 범위를 0~100까지 얻기
		Random rand = new Random();
		int probability = rand.nextInt(101);
		
//		2. 얻은 랜덤 수와 입력한 확률값을 비교
		if(probability<buildRate) {
//			랜덤수가 작으면 강화 성공 메시지 출력 후
			System.out.println("강화에 성공하였습니다.");
//			생명력 3배, 몸무게 1.5배, 키 2배 증가
//			다형성을 표현
			BuildUp();
			showAbility();
		}else {
//			랜덤수가 크면 실패 메시지 출력
			System.out.println("강화에 실패하였습니다.");
		}
	}
//	현재 클래스 내부에서만 사용하기 때문에 private으로 설정
	private void BuildUp() {
		int []facultyData = getFacultyData();
		facultyData[0] *=3;
		facultyData[1] *=1.5;
		facultyData[2] *=2;
	}
}












