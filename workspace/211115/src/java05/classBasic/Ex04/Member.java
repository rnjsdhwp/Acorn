package java05.classBasic.Ex04;

class Member {
	private String id;
	private String picture;
	
//	id와 picture를 입력받아 초기화 하는 생성자
//	생성자는 아래와 같이 반환 자료형이 없다.
//	클래스와 같은 이름을 사용한다.
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
