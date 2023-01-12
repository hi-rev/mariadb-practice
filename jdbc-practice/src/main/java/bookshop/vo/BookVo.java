package bookshop.vo;

public class BookVo {
	private String rent;
	private int no;
	private String title;
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "BookVo [rent=" + rent + ", no=" + no + ", title=" + title + "]";
	}
}
