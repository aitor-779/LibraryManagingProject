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
//si debo usar RepeatedUserException si se repite el numero de usuario, no lo he usado porque tengo una variable que auto incrementa el numero de usuario
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