package libraryManage;

import java.time.LocalDate;

public class Loan {
    private String bookCode;
    private String bookTitle;
    private User user;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate actualReturnDate;
    
    public Loan(String bookCode, String bookTitle, User user, LocalDate loanDate) throws InvalidLoanException {
       setBookCode(bookCode);
       setBookTitle(bookTitle);
       setUser(user);
       setLoanDate(loanDate);
       setDueDate(loanDate.plusDays(14));
       setActualReturnDate(null);
    }
    
    public void registerReturn() throws InvalidLoanException {
    	LocalDate now=LocalDate.now();
    	if (loanDate==null) {
    		throw new InvalidLoanException("Theres an error with the Loan Date");
    	}else {
    		if(loanDate.getYear()<now.getYear()) {
    			if (loanDate.getDayOfYear()<now.getDayOfYear()) {
                	setActualReturnDate(LocalDate.now());
    			}else {
            		throw new InvalidLoanException("The return date is invalid");
    			}
        	}else {
        		throw new InvalidLoanException("The return date is invalid");
        	}
    	}
    }
    
    public int calculateDelayDays(LocalDate loanDate, LocalDate actualReturnDate) {
       int delayDays;
       LocalDate today=LocalDate.now();
       if (actualReturnDate==null) {
          if(today.getYear()>loanDate.getYear()) {
             delayDays=today.getDayOfYear()+365-loanDate.getDayOfYear();
          }else {
             delayDays=today.getDayOfYear()-loanDate.getDayOfYear();
          }
       }else {
          if (actualReturnDate.getYear()>loanDate.getYear()) {
             delayDays=actualReturnDate.getDayOfYear()+365-loanDate.getDayOfYear();
          }else {
             delayDays=actualReturnDate.getDayOfYear()-loanDate.getDayOfYear();
          }
       }
       if (delayDays<0) {
          delayDays=0;
       }
       return delayDays;
    }
    
    public boolean isOverdue(LocalDate dueDate) {
       LocalDate today=LocalDate.now();
       if(today.getYear()<dueDate.getYear()) {
          return true;
       }else if(today.getMonthValue()<dueDate.getMonthValue()) {
          return true;
       }else if(today.getDayOfYear()<dueDate.getDayOfYear()) {
          return true;
       }else {
          return false;
       }
    }

    @Override
    public String toString() {
       return "Loan [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", user=" + user + ", loanDate=" + loanDate
             + ", dueDate=" + dueDate + ", actualReturnDate=" + actualReturnDate + "]";
    }

    public String getBookCode() {
       return bookCode;
    }

    public void setBookCode(String bookCode) throws InvalidLoanException{
    	String reg="LIB[0-9]{4}";
    	if (bookCode.matches(reg)) {
            this.bookCode = bookCode;
    	}else {
    		throw new InvalidLoanException("Book code format is invalid"); 
    	}
    }

    public String getBookTitle() {
       return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
       this.bookTitle = bookTitle;
    }

    public User getUser() {
       return user;
    }

    public void setUser(User user) {
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
