package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrdersDao;
import bookmall.vo.OrdersVo;

public class OrdersDaoTest {

	public static void main(String[] args) {
//		testInsert();
//		testInsertOrders();
		testFindAll();
	}
	
	private static void testInsert() {
		OrdersVo vo = null;
		OrdersDao dao = new OrdersDao();
		
		vo = new OrdersVo();
		vo.setOrderNum("2023-001");
		vo.setOrderPrice(57600L);
		vo.setAddress("부산광역시 수영구 광안해변로100");
		vo.setMemberNo(1L);
		dao.insert(vo);
	}
	
	private static void testInsertOrders() {
		OrdersVo vo = null;
		OrdersDao dao = new OrdersDao();
		
		vo = new OrdersVo();
		vo.setOrderBookNo(1L);
		vo.setBookNo(1L);
		vo.setCount(2L);
		dao.insertOrderBook(vo);
		
		vo = new OrdersVo();
		vo.setOrderBookNo(1L);
		vo.setBookNo(2L);
		vo.setCount(1L);
		dao.insertOrderBook(vo);
	}

	private static void testFindAll() {
		List<OrdersVo> list = new OrdersDao().findAll();
		for (OrdersVo vo: list) {
			System.out.println(vo);
		}
	}
}
