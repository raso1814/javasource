package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import domain.UserDTO;

public class UserDAO {

	static {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##java";
		String password = "12345";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
	
	//userTBL ������ ��� ��������
	public Vector<UserDTO> select() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Vector<UserDTO> vetList = new Vector<UserDTO>();
		
		
		try {
			
			con = getConnection();
			
			String str = "select * from userTBL";
			
			pstmt = con.prepareStatement(str);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				UserDTO dto = new UserDTO();
				dto.setNo(rs.getInt("no"));
				dto.setUserName(rs.getString("username"));
				dto.setBirthYear(rs.getInt("birthyear"));
				dto.setAddr(rs.getString("addr"));
				dto.setMobile(rs.getString("mobile"));
				
				vetList.add(dto);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return vetList;
		
	}
	
	
	

}
