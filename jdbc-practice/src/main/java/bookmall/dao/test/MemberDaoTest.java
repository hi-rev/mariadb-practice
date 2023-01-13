package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	
	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("둘리");
		vo.setEmail("qwer@gmail.com");
		vo.setPhone("010-0000-0000");
		vo.setPassword("qwer");
		dao.insert(vo);
		
		vo = new MemberVo();
		vo.setName("또치");
		vo.setEmail("asdf@gmail.com");
		vo.setPhone("010-1111-1111");
		vo.setPassword("asdf");
		dao.insert(vo);
	}
	
	private static void testFindAll() {
		List<MemberVo> list = new MemberDao().findAll();
		for (MemberVo vo: list) {
			System.out.println(vo);
		}
	}
}
