package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setBookName("트렌드 코리아 2023");
		vo.setPrice(17100L);
		vo.setCategoryNo(2L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setBookName("러닝 타입스크립트");
		vo.setPrice(23400L);
		vo.setCategoryNo(3L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setBookName("아버지의 해방일지");
		vo.setPrice(13500L);
		vo.setCategoryNo(1L);
		dao.insert(vo);
	}
	
	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo: list) {
			System.out.println(vo);
		}
	}
}
