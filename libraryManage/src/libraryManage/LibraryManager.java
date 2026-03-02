package libraryManage;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class LibraryManager {
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Loan> loans = new ArrayList<Loan>();
	private int userCount;
	private int LoanCount;
	
	
	public void addUser() throws InvalidUserException {
		Scanner keyboard = new Scanner(System.in);
		String name, email,memberNumber;
		LocalDate registrationDate= LocalDate.now();
		int number=0;
		
		System.out.println("Name of the user");
		name=keyboard.nextLine();
		System.out.println("Email of the user");
		email=keyboard.nextLine();
		memberNumber=String.format("SOC%05d", number);
		
		
		User newUser= new User(name,email,memberNumber,registrationDate);
		users.add(newUser);
		number++;
	}
	
	public void addLoan() {
		Scanner keyboard = new Scanner(System.in);
		String bookCode,bookTitle;
		LocalDate loanDate=LocalDate.now();
		int number=0;
		
		System.out.println("Name of the book");
		bookTitle=keyboard.nextLine();
		bookCode=String.format("SOC%05d", number);

		User user=
		
		Loan newLoan= new Loan(bookCode,bookTitle,user,loanDate);
		loans.add(newLoan);
		number++;
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
