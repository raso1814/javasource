package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//���̺� ���� �Ȱ��� �ۼ�

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DeptDAO {

	private int deptNo;
	private String dname;
	private String loc;
	
}
