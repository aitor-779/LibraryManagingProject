package libraryManage;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class LibraryManager {
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Loan> loans = new ArrayList<Loan>();
	private int userCount;
	private int LoanCount;
	
	
	public static void addUser() {
		Scanner keyboard = new Scanner(System.in);
		String name, email,memberNumber;
		boolean sanctioned=false;
		LocalDate registrationDate= LocalDate.now();
		LocalDate sanctionEndDate= null;
		//las expresiones regulares, ponerlas aqui, en vez de en el constructor(creo)

		User newUser= new User(name,email,memberNumber,registrationDate,sanctioned,sanctionEndDate);
		users.add(newUser);
	}
	
	public void addLoan() {
		Scanner keyboard = new Scanner(System.in);
		String bookCode,bookTitle,user;
		LocalDate loanDate=LocalDate.now();
		
		Loan newLoan= new Loan(bookCode,bookTitle,user,loanDate);
		loans.add(newLoan);
	}
	
	public boolean returnBook() {
		Scanner keyboard = new Scanner(System.in);
		String bookCode;
		LocalDate returnDate;
		
		
	}
	
	public User findUser() {
		Scanner keyboard = new Scanner(System.in);
		String memberNumber;
		
	}
	
	
	public ArrayList getUsers() {
		return users;
	}
	public void setUsers(ArrayList users) {
		this.users = users;
	}
	public ArrayList getLoans() {
		return loans;
	}
	public void setLoans(ArrayList loans) {
		this.loans = loans;
	}

	@Override
	public String toString() {
		return "LibraryManager [users=" + users + ", loans=" + loans + ", userCount=" + userCount + ", LoanCount="
				+ LoanCount + "]";
	}
	
	
	
}
