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
			System.out.println("1.��ü �μ���ȸ");
			System.out.println("2.Ư�� �μ���ȸ");
			System.out.println("3.�μ� �߰�");
			System.out.println("4.�μ� ����");
			System.out.println("5.�μ� ����");
			System.out.println("6.����");
			System.out.println("********************");

			System.out.println("��ȣ �Է� : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("�μ���ȣ\t�μ���\t\t��ġ");

				List<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptNo() + "\t");
					System.out.print(deptDTO.getDname() + "\t\t");
					System.out.print(deptDTO.getLoc() + "\t");
					System.out.println();
				}

				break;
			case 2:
				System.out.println("�μ���ȣ �Է� : ");
				int deptNo = sc.nextInt();

				DeptDTO dto = dao.getrow(deptNo);

				System.out.println("�μ���ȣ\t�μ���\t\t��ġ");
				System.out.println(dto.getDeptNo() + "\t" + dto.getDname() + "\t" + dto.getLoc());

				break;
			case 3:

				DeptDTO dto2 = new DeptDTO();

				System.out.println("�μ���ȣ �Է� :");
				dto2.setDeptNo(sc.nextInt());
				System.out.println("�μ��� �Է� :");
				dto2.setDname(sc.next());
				System.out.println("�μ���ġ �Է� :");
				dto2.setLoc(sc.next());

				System.out.println(dao.insert(dto2) ? "�߰�����" : "�߰�����");

				break;
			case 4:

				System.out.println("�μ���ȣ �Է� : ");
				deptNo = sc.nextInt();
				System.out.println("�μ��� ���� : ");
				String dname = sc.next();
				dao.update(dname, deptNo);
				System.out.println(dao.update(dname, deptNo)?"������Ʈ ����":"������Ʈ ����");

				break;
			case 5:
				
				System.out.println("�μ���ȣ ���� : ");
				deptNo = sc.nextInt();
				System.out.println(dao.delete(deptNo)?"���� ����": "���� ����");

				break;
			case 6:
				run = false;
				break;

			default:
				System.out.println("��ȣ�� �ٽ� Ȯ�����ּ���");
				break;
			}

	}

	}
}
