package java06.Inheritance.Ex10;

/*	interface는 메소드의 이름만 정의하며
 * 이를 상속받은 클래스에서 구현을 한다.
 * interface의 사용 목적은 통일성
*/
public interface Attack {
	public String StandoffAttack();
	public abstract String MelleAttack();
}
