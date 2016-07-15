package domain;

import java.sql.Timestamp;

public class Custom {
	
	private int num;
	private String custName;
	private String bookTitle;
	private Timestamp borrowDate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Timestamp getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Timestamp borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	
}
