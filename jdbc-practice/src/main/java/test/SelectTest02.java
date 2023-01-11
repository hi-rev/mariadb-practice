package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest02 {
	public static void main(String[] args) {
		search("pat");
	}

	public static void search(String keyworld) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC Driver Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.10.106:3307/employees?charset=utf-8";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. Statement 준비
			String sql = "select emp_no, first_name" +
					"  from employees" + "  where first_name like ?";
			pstmt = conn.prepareStatement(sql);
			
			// 4. binding
			pstmt.setString(1, "%" + keyworld + "%");
			
			// 5. SQL 실행
			rs = pstmt.executeQuery();
			
			// 6. 결과 처리
			while (rs.next()) {
				Long empNo = rs.getLong(1);
				String firstName = rs.getString(2);
				System.out.println(empNo + ":" + firstName);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: " + e);
		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (conn != null) {
					conn.close();
					}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
