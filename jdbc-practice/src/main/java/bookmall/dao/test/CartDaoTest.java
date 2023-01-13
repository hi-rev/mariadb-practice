package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

// 주문 고객, 도서 제목, 수량, 가격
public class CartDaoTest {

	public static void main(String[] args) {
//		testInsert();
		testFindAll();
	}
	
	private static void testInsert() {
		CartVo vo = null;
		CartDao dao = new CartDao();
		
		vo = new CartVo();
		vo.setMemberNo(1L);
		vo.setCount(2L);
		vo.setBookNo(1L);
		dao.insert(vo);
		
		vo = new CartVo();
		vo.setMemberNo(2L);
		vo.setCount(3L);
		vo.setBookNo(3L);
		dao.insert(vo);
	}

	private static void testFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo: list) {
			System.out.println(vo);
		}
	}
}
