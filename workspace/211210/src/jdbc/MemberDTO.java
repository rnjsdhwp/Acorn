package jdbc;

public class MemberDTO {
	private int num;
	private String name;
	private String addr;
	
//	alt + shift + s => c => enter
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
//	alt + shift + s => o => enter
	public MemberDTO(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
//	alt + shift + s => r => enter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
