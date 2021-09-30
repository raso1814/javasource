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

	//테이블 모양과 똑같이 생성
	
	private int deptNo;
	private String dname;
	private String loc;

}
