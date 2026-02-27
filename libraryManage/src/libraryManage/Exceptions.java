package libraryManage;

public class Exceptions extends RuntimeException{
	public Exceptions() {
		
	}
	
}
class InvalidUserException extends Exception{
	public InvalidUserException(String message) {
		super(message);
	}
}
class SanctionedUserException extends Exception{
	public SanctionedUserException(String message) {
		super(message);
	}
}
class RepeatedUserException extends Exception{
	public RepeatedUserException(String message) {
		super(message);
	}
}
class InvalidLoanException extends Exception{
	public InvalidLoanException(String message) {
		super(message);
	}
}
class BookNotAvailableException extends Exception{
	public BookNotAvailableException(String message) {
		super(message);
	}
}