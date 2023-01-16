package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrdersDao;
import bookmall.vo.OrdersVo;

public class OrdersDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}
	
	private static void testInsert() {
		OrdersVo vo = null;
		OrdersDao dao = new OrdersDao();
		
		vo = new OrdersVo();
		vo.setOrderNum("2023-001");
		vo.setOrderPrice(46000L);
		vo.setAddress("부산 해운대구");
		vo.setMemberNo(1L);
		vo.setBookNo(1L);
		dao.insert(vo);
		vo.setNo(1L);
		dao.insertOrderBook(vo);
		
		vo.setNo(1L);
		vo.setBookNo(2L);
		dao.insertOrderBook(vo);
	}

	private static void testFindAll() {
		List<OrdersVo> list = new OrdersDao().findAll();
		for (OrdersVo vo: list) {
			System.out.println(vo);
		}
	}
}
