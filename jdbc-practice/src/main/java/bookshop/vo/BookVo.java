package bookshop.vo;

public class BookVo {
	private long no;
	private String rent;
	private String title;
	private long AuthorNo;
	private String AuthorName;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getAuthorNo() {
		return AuthorNo;
	}
	public void setAuthorNo(Long authorNo) {
		AuthorNo = authorNo;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", rent=" + rent + ", AuthorNo=" + AuthorNo + ", title=" + title + "]";
	}
}
