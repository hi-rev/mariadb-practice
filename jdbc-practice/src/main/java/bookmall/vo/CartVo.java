package bookmall.vo;

public class CartVo {
	private Long no;
	private Long count;
	private Long memberNo;
	private Long bookNo;
	private String memberName;
	private String bookName;
	private Long sumPrice;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
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
	public Long getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(Long sumPrice) {
		this.sumPrice = sumPrice;
	}
	
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", memberName=" + memberName + 
				", bookName=" + bookName + ", count=" + count + ", sumPrice=" + sumPrice + "]";
	}
}
