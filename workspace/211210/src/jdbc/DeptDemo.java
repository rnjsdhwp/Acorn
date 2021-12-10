package jdbc;

import java.util.ArrayList;

public class DeptDemo {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		
//		DeptDTO dto = new DeptDTO(60, "dname", "loc");
//		boolean isSuccess = dao.insert(dto);
//		if(isSuccess)	System.out.println("회원이 추가되었습니다.");
//		else	System.out.println("회원 추가 실패");
		
//		DeptDTO dto = new DeptDTO(60, "dname-1", "loc-1");
//		boolean isSuccess = dao.update(dto);
//		if(isSuccess)	System.out.println("회원이 변경되었습니다.");
//		else	System.out.println("회원 변경 실패");
	
//		boolean isSuccess = dao.delete(60);
//		if(isSuccess)	System.out.println("회원이 삭제되었습니다.");
//		else	System.out.println("회원 삭제 실패");
		
		int start = 0;
		int len = 3;
		ArrayList<DeptDTO> listDTO = dao.select(start, len); 
		
		System.out.printf("%-7s %-12s %s\n", "deptno", "dname", "loc");
		for(DeptDTO dto : listDTO) {
			System.out.printf("%-7d %-12s %s\n",
					dto.getDeptno(), dto.getDname(), dto.getLoc());
		}
	}

}
