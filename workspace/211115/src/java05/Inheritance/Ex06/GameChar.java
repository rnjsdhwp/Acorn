package java05.Inheritance.Ex06;

public class GameChar {
	int [] facultyData;		//능력 수치 데이터
	String [] facultyName;	//능력 이름 데이터
	
//	몇 개의 능력치를 사용할지 설정
	public GameChar(int size) {
		facultyData = new int[size];
		facultyName = new String[size];
	}
//	능력치 얻기
	public int[] getFacultyData() {
		return facultyData;
	}

	public String[] getFacultyName() {
		return facultyName;
	}
//	능력치 설정
	public void setFaculty(String name, int data, int idx) {
//		능력치의 위치가 배열보다 크면 에러가 발생할 수 있음으로 다음과 같이 설정
		if(this.facultyData.length>idx) {
			this.facultyData[idx] = data;
			this.facultyName[idx] = name;	
		}	
	}
	
}
