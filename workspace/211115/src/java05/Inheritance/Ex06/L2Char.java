package java05.Inheritance.Ex06;
/*
 * 케릭터 이름
 * 종족
 * 능력치
 *   - 레벨
 *   - 공격력
 *   - 방어력
 *   - 마법력
 */
public class L2Char extends GameChar{
	public L2Char() {
//		GameChar(4), 부모 클래스의 생성자 호출
		super(4);
		String [] ability = {"레벨", "공격력", "방어력", "마법력"};
		
		for(int i=0;i<ability.length;i++) {
			setFaculty(ability[i], 1, i);
		}
	}
	private String name;
	private String race;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public void showAbility() {
		System.out.println(name);
		System.out.println(race);
		
		int [] facultyData = getFacultyData();
		String [] facultyName = getFacultyName();
		
		for(int i=0;i<facultyData.length;i++) {
			System.out.println(facultyName[i]+" : "+ facultyData[i]);
		}
	}
}
