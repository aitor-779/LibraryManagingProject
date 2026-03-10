package libraryManage;

public class Book {
	private String code, title;
	private final String reg_book_code="[A-Z]";
	
	public Book(String code,String title) {
		setCode(code);
		setTitle(title);
	}
	
	@Override
	public boolean equals (Object incomingBook) {
		Book auxBook=(Book)incomingBook;
		String incomingCode=auxBook.getCode();
		return code.equals(auxBook.getCode());
	}
	
	public int compareTo (Object incomingBook) {
		Book auxBook=(Book)incomingBook;
		String incomingCode=auxBook.getCode();
		int order=code.compareTo(incomingCode);
		return order;
	}
	
	public int hashCode() {
		return code.hashCode();
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReg_book_code() {
		return reg_book_code;
	}

	@Override
	public String toString() {
		return "Book [code=" + code + ", title=" + title + ", reg_book_code=" + reg_book_code + "]";
	}
	
}
