package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest02 {

	public static void main(String[] args) {
		insert("기획2");
	}
	
	private static boolean insert(String deptName) {
		boolean result =  false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. JDBC Driver Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.10.106:3307/webdb?charset=utf-8";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			
			// 3. Statement 준비
			String sql = "insert into dept values(null, '" + deptName + "')";
			pstmt = conn.prepareStatement(sql);
			
			// 4. binding
			pstmt.setString(1, sql);
			
			// 5. SQL 실행
			int count = pstmt.executeUpdate(sql);
			
			// 5. 결과 처리
			result = count == 1;
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: " + e);
		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
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
		return result;
	}

}
