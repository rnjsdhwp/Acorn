package jdbc;

import java.util.ArrayList;

public class EmpDemo {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
//		EmpDTO dto = new EmpDTO(10000,"PARK","SALESMAN",7698,null,2000,300,20);
//		boolean isSuccess = dao.insert(dto);
//		if (isSuccess) {
//			System.out.println("입력 성공");
//		} else {
//			System.out.println("입력 실패");
//		}
		
//		EmpDTO dto = new EmpDTO(10000,"PARK1","CLERK",7782,"2021-12-02",2001,0,30);
//		boolean isSuccess = dao.update(dto);
//		if (isSuccess) {
//			System.out.println("변경 성공");
//		} else {
//			System.out.println("변경 실패");
//		}
		
		int start = 0;
		int len = 5;
		ArrayList<EmpDTO> list = dao.select(start, len);
		
		System.out.printf("%-6s %-6s %-9s %-6s %-14s %-6s %-6s %s\n", 
				"EMPNO","ENAME","JOB","MGR","HIREDATE","SAL","COMM","DEPTNO");
		for(EmpDTO dto : list) {
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hireDate = dto.getHireDate();
			Double sal = dto.getSal();
			Double comm = dto.getComm();
			int deptno = dto.getDeptno();
			
			System.out.printf("%-6d %-6s %-9s %-6d %-14s %-6.0f %-6.0f %d\n", 
					no,name,job,mgr,hireDate,sal,comm,deptno);
		}
	}

}
