package bookshop.main;

import java.util.List;
import java.util.Scanner;

import bookshop.dao.BookDao;
import bookshop.vo.BookVo;

public class BookShopMain {

	public static void main(String[] args) {
		while (true) {
			displayBookInfo();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
			int num = sc.nextInt();
			Long no = sc.nextLong();
			sc.close();
			
			BookVo vo = new BookVo();
			vo.setNo(no);
			vo.setRent("Y");
			
			new BookDao().update();
		
			displayBookInfo();
		}
	}

	private static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();
	}
}
