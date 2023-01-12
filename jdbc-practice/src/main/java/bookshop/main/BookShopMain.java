package bookshop.main;

import java.util.List;
import java.util.Scanner;

import bookshop.dao.BookDao;
import bookshop.vo.BookVo;

public class BookShopMain {

	public static void main(String[] args) {
		displayBookInfo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
		Long no = sc.nextLong();
		sc.close();
		
		BookVo vo = new BookVo();
		vo.setNo(no);
		vo.setRent("Y");
		
		new BookDao().update(vo);
	
		displayBookInfo();
	}
	

	private static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();
		
		for(BookVo vo : list) {
			String s;
			if ("Y".equals(vo.getRent())) {
				s = "대여중";
			} else {
				s = "재고 있음";
			}
			
			System.out.println("책 번호: " + vo.getNo() + " / 제목: " + vo.getTitle() + " / 작가: " + vo.getAuthorName()
					+ " / 대여유무: " + s);
		}
	}
}
