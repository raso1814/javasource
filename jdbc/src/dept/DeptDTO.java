package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DeptDTO {

	//���̺� ���� �Ȱ��� ����
	
	private int deptNo;
	private String dname;
	private String loc;

}
