package libraryManage;

import java.time.LocalDate;

public class Loan {
	private String bookCode;
	private String bookTitle;
	private Object user;
	private LocalDate loanDate;
	private LocalDate dueDate;
	private LocalDate actualReturnDate;
	
	public Loan(String bookCode, String bookTitle, Object user, LocalDate loanDate) {
		this.bookCode=bookCode;
		this.bookTitle=bookTitle;
		this.user=user;
		this.loanDate=loanDate;
		//dueDate=
		actualReturnDate=null;
	}
	
	public void registerReturn(LocalDate actualReturnDate) {
		this.actualReturnDate=actualReturnDate;
	}
	
	public int calculateDelayDays(LocalDate loanDate, LocalDate actualReturnDate) {
		int delayDays;
		if (actualReturnDate.getYear()==loanDate.getYear()) {
			delayDays=actualReturnDate.getDayOfYear()-loanDate.getDayOfYear();
		}else {
			delayDays=0;
		}
		return delayDays;
	}
	
	public boolean isOverdue(LocalDate dueDate) {
		LocalDate today=LocalDate.now();
		if(today>dueDate) {
			
		}
		return false;
		
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Object getUser() {
		return user;
	}

	public void setUser(Object user) {
		this.user = user;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(LocalDate actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	
	
}
