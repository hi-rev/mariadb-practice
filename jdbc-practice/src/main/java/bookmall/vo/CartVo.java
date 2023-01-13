package bookmall.vo;

public class CartVo {
	private Long no;
	private Long count;
	private Long count_price;
	private Long memberNo;
	private Long bookNo;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount_price() {
		return count_price;
	}
	public void setCount_price(Long count_price) {
		this.count_price = count_price;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
}
