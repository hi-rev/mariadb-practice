package bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.vo.OrdersVo;

public class OrdersDao {
	
	public List<OrdersVo> findAll() {
		List<OrdersVo> result = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			
			String sql = 
				"   select orders.no, orders.order_num, orders.order_price, orders.address, member.name, member.email, order_book.book_no, book.book_name" +
				"     from orders, member, order_book, book" +
				"    where orders.member_no = member.no and" +
				"    order_book.book_no = book.no and" +
				"    order_book.order_no = orders.no;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Long no = rs.getLong(1);
				String orderNum = rs.getString(2);
				Long orderPrice = rs.getLong(3);
				String address = rs.getString(4);
				String name = rs.getString(5);
				String email = rs.getString(6);
				Long bookNo = rs.getLong(7);
				String bookName = rs.getString(8);
				
				OrdersVo vo = new OrdersVo();
				vo.setNo(no);
				vo.setOrderNum(orderNum);
				vo.setOrderPrice(orderPrice);
				vo.setAddress(address);
				vo.setName(name);
				vo.setEmail(email);
				vo.setBookNo(bookNo);
				vo.setBookName(bookName);
				
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	public void insert(OrdersVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into orders(no, order_num, order_price, address, member_no) values(null, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getOrderNum());
			pstmt.setLong(2, vo.getOrderPrice());
			pstmt.setString(3, vo.getAddress());
			pstmt.setLong(4, vo.getMemberNo());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertOrderBook(OrdersVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into order_book(order_no, book_no) values(?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, vo.getNo());
			pstmt.setLong(2, vo.getBookNo());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://192.168.10.106:3307/bookmall?charset=utf8";
//			String url = "jdbc:mariadb://172.30.1.2:3307/bookmall?charset=utf8";
			conn = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: " + e);
		}
		return conn;
	}
}
