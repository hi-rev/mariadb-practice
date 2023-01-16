package bookmall.main;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.MemberDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.MemberVo;

public class BookMall {

	public static void main(String[] args) {
		
		System.out.println("## 회원리스트");
		displayUserInfo();
		
		System.out.println("## 카테고리");
		displayCategoryInfo();
		
		System.out.println("## 상품");
		displayBookInfo();
		
		System.out.println("## 카트");
		displayCartInfo();
		
		System.out.println("## 주문");
		
		System.out.println("## 주문 도서 리스트");
	}
	
	private static void displayUserInfo() {
		List<MemberVo> list = new MemberDao().findAll();
		
		for (MemberVo vo: list) {
			System.out.println("이름: " + vo.getName() + " / 전화번호: " + vo.getPhone() + " / 이메일: " + vo.getEmail() 
								+ " / 비밀번호: " + vo.getPassword());
		}
	}
	
	private static void displayCategoryInfo() {
		List<CategoryVo> list = new CategoryDao().findAll();
		int i = 1;
		for (CategoryVo vo: list) {
			System.out.println("카테고리" + i + ": " + vo.getCategoryName());
			i++;
		}
	}
	
	private static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo: list) {
			System.out.println("제목: " + vo.getBookName() + " / 가격: " + vo.getPrice());
		}
	}
	
	private static void displayCartInfo() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo: list) {
			System.out.println("주문 고객: " + vo.getMemberName() + " / 도서 제목: " + vo.getBookName() 
						+ " / 수량: " + vo.getCount() + " / 가격: " + vo.getSumPrice());
		}
	}
}
