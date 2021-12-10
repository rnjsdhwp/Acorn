package jdbc;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
//		MemberDTO dto = new MemberDTO(302, "이름302", "주소302");
//		boolean isSuccess = dao.insert(dto);
//		
//		if(isSuccess) {
//			System.out.println("회원이 추가 되었습니다.");
//		}else {
//			System.out.println("회원 등록 실패");
//		}
		
		
//		MemberDTO dto = new MemberDTO(302, "이름302-1", "주소302-1");
//		boolean isSuccess = dao.update(dto);
//		
//		if(isSuccess) {
//			System.out.println("회원이 변경되었습니다.");
//		}else {
//			System.out.println("회원 변경 실패");
//		}
		
		
//		boolean isSuccess = dao.delete(302);
//		
//		if(isSuccess) {
//			System.out.println("회원이 삭제되었습니다.");
//		}else {
//			System.out.println("회원 삭제 실패");
//		}
		
		int start = 0;
		int len = 3;
		ArrayList<MemberDTO> listDTO = dao.select(start, len);
		
		for(MemberDTO dto : listDTO) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			
			System.out.println(num+"\t"+name+"\t"+addr);
		}
		
	}

}
