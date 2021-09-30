package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, user, password);
			
			
			if(con != null) {
				System.out.println("����Ǿ����ϴ�.");
				
				//sql ������ �ۼ� -> emp ���̺��� ��� ������ ��ȸ
				String sql = "SELECT * FROM emp";
				
				//sql ������ �����ͺ��̽� ������ ���� ->
				pstmt = con.prepareStatement(sql);
				
				//sql ������ ����� ����� �޾ƿ���
				rs = pstmt.executeQuery();
				
				//�޾ƿ� ����� ȭ�鿡 ���
				System.out.printf("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno\n");
				
				while (rs.next()) { //ResultSet ��ü �ȿ� �о�� ������ ������ true
					
					System.out.print(rs.getInt("empno")+"\t"); //number
					System.out.print(rs.getString("ename")+"\t"); //varchar2
					System.out.print(rs.getString("job")+"\t\t"); //varChar
					System.out.print(rs.getInt("mgr")+"\t");
					System.out.print(rs.getDate("hiredate")+"\t");// 
					System.out.print(rs.getInt("sal")+"\t");
					System.out.print(rs.getInt("comm")+"\t");
					System.out.println(rs.getInt("deptno"));
			
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
