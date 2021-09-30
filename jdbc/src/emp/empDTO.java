package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블 결과랑 똑같은 모양으로 작성
//~~DTO : Data Transfer Object
//~~VO : Value Object

//number -> int, varchar -> String, date = util.Date

@Setter //setter 메소드 자동으로 생성
@Getter //getter 메소드 자동으로 생성
@NoArgsConstructor // default 생성자 자동으로 생성
@AllArgsConstructor // 인자를 모두 받는 생성자 자동으로 생성
@ToString

public class empDTO {
	
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	
	
//	public empDTO() {
//		super();
//	}
//
//	public empDTO(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
//		super();
//		this.empno = empno;
//		this.ename = ename;
//		this.job = job;
//		this.mgr = mgr;
//		this.hiredate = hiredate;
//		this.sal = sal;
//		this.comm = comm;
//		this.deptno = deptno;
//	}
//
//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//
//	public void setJob(String job) {
//		this.job = job;
//	}
//
//	public void setMgr(int mgr) {
//		this.mgr = mgr;
//	}
//
//	public void setHiredate(Date hiredate) {
//		this.hiredate = hiredate;
//	}
//
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//
//	public void setComm(int comm) {
//		this.comm = comm;
//	}
//
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
//
//	public int getEmpno() {
//		return empno;
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public String getJob() {
//		return job;
//	}
//
//	public int getMgr() {
//		return mgr;
//	}
//
//	public Date getHiredate() {
//		return hiredate;
//	}
//
//	public int getSal() {
//		return sal;
//	}
//
//	public int getComm() {
//		return comm;
//	}
//
//	public int getDeptno() {
//		return deptno;
//	}
	
	
	
	

}



