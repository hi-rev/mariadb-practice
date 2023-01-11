package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest01 {
	public static void main(String[] args) {
		search("pat");
	}

	public static void search(String keyworld) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC Driver Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.10.106:3307/employees?charset=utf-8";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. Statement 생성
			stmt = conn.createStatement();
			
			// 4. SQL 실행
			String sql = "select emp_no, first_name" +
					"  from employees" + "  where first_name like '%" + keyworld + "%'";
			
			rs = stmt.executeQuery(sql);
			
			// 5. 결과 처리
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
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
