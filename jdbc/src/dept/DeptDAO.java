package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블 모양과 똑같이 작성

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
