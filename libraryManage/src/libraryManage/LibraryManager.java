package libraryManage;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class LibraryManager {
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Loan> loans = new ArrayList<Loan>();

	private int userCount;
	private int LoanCount;
	
	
	public static void addUser() throws InvalidUserException {
		Scanner keyboard = new Scanner(System.in);
		String name, email,memberNumber;
		LocalDate registrationDate= LocalDate.now();
		int number=users.size();
		
		System.out.println("Name of the user");
		name=keyboard.nextLine();
		System.out.println("Email of the user");
		email=keyboard.nextLine();
		memberNumber=String.format("SOC%05d", number);
		
		
		User newUser= new User(name,email,memberNumber,registrationDate);
		users.add(newUser);
	}
	
	public static void addLoan() throws SanctionedUserException, InvalidLoanException, BookNotAvailableException{
		Scanner keyboard = new Scanner(System.in);
		String bookCode,bookTitle;
		LocalDate loanDate=LocalDate.now();
		int number=loans.size();
		
		System.out.println("Name of the book");
		bookTitle=keyboard.nextLine();
		bookCode=String.format("LIB%04d", number);
		User user = findUser();
		if (user.isSanctioned()) {
			throw new SanctionedUserException("The user is sanctioned");
		}else{
			Loan newLoan= new Loan(bookCode,bookTitle,user,loanDate);
			loans.add(newLoan);
		}
	}
	
	public boolean returnBook() throws InvalidLoanException{
		ArrayList books = new ArrayList();
		int count=0;
		Scanner keyboard = new Scanner(System.in);
		String bookCode;
		LocalDate returnDate;
		for(int i=0; i<loans.size();i++) {
			Loan loan = loans.get(i);
			if (loan.getActualReturnDate()==null) {
				System.out.println("Book "+i+": "+loan.getBookCode()+" Name: "+loan.getBookTitle());
				count++;
			}
		}
		System.out.println("Give me the index number of the book that is returning");
		int numBook=keyboard.nextInt();
		while (numBook<0||numBook>count) {
			System.err.println("Wrong index number, give me a valid one");
			for(int i=0; i<loans.size();i++) {
				Loan loan = loans.get(i);
				if (loan.getActualReturnDate()==null) {
					System.out.println("Book "+i+": "+loan.getBookCode()+" Name: "+loan.getBookTitle());
					count++;
				}
			}	
			numBook=keyboard.nextInt();
		}
		for(int i=0;i<loans.size();i++) {
			
		}
		return false;
		
	}
	
	public static User findUser() {
		Scanner keyboard = new Scanner(System.in);
		String memberNumber;
		System.out.println("User list:");
		for(int i=0; i<users.size();i++) {
			User user = users.get(i);
			System.out.println("User "+i+": "+user.getName()+" User number: "+user.getMemberNumber());
		}
		System.out.println("Give me the index number of the user that you want");
		int numUser=keyboard.nextInt();
		while (numUser<0||numUser>users.size()) {
			System.err.println("Wrong index number, give me a valid one");
			for(int i=0; i<users.size();i++) {
				User user = users.get(i);
				System.out.println("User "+i+": "+user.getName()+" User number: "+user.getMemberNumber());
			}
			numUser=keyboard.nextInt();
		}
		if(users.get(numUser)!=null) {
			return users.get(numUser);
		}else {
			return null;
		}
		
		
	}
	
	public static ArrayList activeLoans() {
		ArrayList<Loan> activeLoans = new ArrayList<Loan>();
		for(int i=0; i<loans.size();i++) {
			Loan loan = loans.get(i);
			if (loan.getActualReturnDate()==null) {
				activeLoans.add(loan);
			}
		}
		return activeLoans;
	}
	
	public static ArrayList checkSanctions() {
		ArrayList<User> sanctionedUsers = new ArrayList<User>();
		for(int i=0; i<users.size();i++) {
			User user = users.get(i);
			if (user.isSanctioned()==true) {
				sanctionedUsers.add(user);
			}
		}
		return sanctionedUsers;
	}
	
	public static void liftSanctions() {
		for(int i=0; i<users.size();i++) {
			User user= users.get(i);
			LocalDate today=LocalDate.now();
			if (user.isSanctioned()==true) {
				LocalDate sancEndDate = user.getSanctionEndDate();
				if (today.getYear()>sancEndDate.getYear()) {
					user.setSanctioned(false);
				}else if (today.getYear()==sancEndDate.getYear()) {
					if (today.getDayOfYear()>sancEndDate.getDayOfYear()) {
						user.setSanctioned(false);
					}
				}
			}
		}
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
