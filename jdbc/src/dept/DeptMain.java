package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		DeptDAO dao = new DeptDAO();

		while (run) {
			System.out.println("***************");
			System.out.println("1.전체 부서조회");
			System.out.println("2.특정 부서조회");
			System.out.println("3.부서 추가");
			System.out.println("4.부서 수정");
			System.out.println("5.부서 삭제");
			System.out.println("6.종료");
			System.out.println("********************");

			System.out.println("번호 입력 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("부서번호\t부서명\t\t위치");

				List<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptNo() + "\t");
					System.out.print(deptDTO.getDname() + "\t\t");
					System.out.print(deptDTO.getLoc() + "\t");
					System.out.println();
				}

				break;
			case 2:
				System.out.println("부서번호 입력 : ");
				int deptNo = sc.nextInt();

				DeptDTO dto = dao.getrow(deptNo);

				System.out.println("부서번호\t부서명\t\t위치");
				System.out.println(dto.getDeptNo() + "\t" + dto.getDname() + "\t" + dto.getLoc());

				break;
			case 3:

				DeptDTO dto2 = new DeptDTO();

				System.out.println("부서번호 입력 :");
				dto2.setDeptNo(sc.nextInt());
				System.out.println("부서명 입력 :");
				dto2.setDname(sc.next());
				System.out.println("부서위치 입력 :");
				dto2.setLoc(sc.next());

				System.out.println(dao.insert(dto2) ? "추가성공" : "추가실패");

				break;
			case 4:

				System.out.println("부서번호 입력 : ");
				deptNo = sc.nextInt();
				System.out.println("부서명 변경 : ");
				String dname = sc.next();
				dao.update(dname, deptNo);
				System.out.println(dao.update(dname, deptNo)?"업데이트 성공":"업데이트 실패");

				break;
			case 5:
				
				System.out.println("부서번호 삭제 : ");
				deptNo = sc.nextInt();
				System.out.println(dao.delete(deptNo)?"삭제 성공": "삭제 실패");

				break;
			case 6:
				run = false;
				break;

			default:
				System.out.println("번호를 다시 확인해주세요");
				break;
			}

	}

	}
}
