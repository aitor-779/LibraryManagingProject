package libraryManage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws InvalidUserException, InvalidLoanException, SanctionedUserException, BookNotAvailableException {
		
		Scanner keyboard = new Scanner(System.in);


		int option=0;

		
		
		while(option!=8) {
			System.out.println("Give me the option you want");
			System.out.println("1: Register New User");
			System.out.println("2: Issue Book Loan");
			System.out.println("3: Return Book");
			System.out.println("4: Check User Status");
			System.out.println("5: Show Active Loans");
			System.out.println("6: Show Sanctioned Users");
			System.out.println("7: Update Sanctions");
			System.out.println("8: EXIT");
			try {
				option=keyboard.nextInt();
				keyboard.nextLine();
			}catch(InputMismatchException e) {
				option=0;
			}
			switch(option) {
			case 1:
				LibraryManager.addUser();
				break;
			case 2:
				LibraryManager.addLoan();
				break;
			case 3:
				System.out.println("hola3");
				break;
			case 4:
				User user = LibraryManager.findUser();
				if(user!=null) {
					System.out.println(user.toString());	
				}else {
					System.err.println("User Not Found");
				}
				break;
			case 5:
				ArrayList activeLoans=LibraryManager.activeLoans();
				for(int pos=0;pos<activeLoans.size(); pos++) {
					System.out.println(activeLoans.get(pos));
				}
				break;
			case 6:
				ArrayList sanctionedUsers=LibraryManager.checkSanctions();
				for(int pos=0;pos<sanctionedUsers.size(); pos++) {
					System.out.println(sanctionedUsers.get(pos));
				}
				break;
			case 7:
				System.out.println("hola7");
				break;
			case 8:
				break;
			default:
				System.err.println("Option invalid, give me a valid one");

			}
				
			
			
		}
		
	}
}
