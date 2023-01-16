package bookmall.vo;

public class OrdersVo {
	private Long no;
	private String orderNum;
	private Long orderPrice;
	private String name;
	private String email;
	private String address;
	
	private Long orderBookNo;
	private Long bookNo;
	private String bookName;
	private Long count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private Long memberNo;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Long orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getOrderBookNo() {
		return orderBookNo;
	}
	public void setOrderBookNo(Long orderBookNo) {
		this.orderBookNo = orderBookNo;
	}	
	@Override
	public String toString() {
		return "OrdersVo [no=" + no + ", orderNum=" + orderNum + ", orderPrice=" + orderPrice + ", address=" + address
				+ ", name=" + name + ", email=" + email + "]";
	}
}
