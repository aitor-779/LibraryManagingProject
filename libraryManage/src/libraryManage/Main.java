package libraryManage;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
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
				String name, email;
				int memberNumber;
				boolean sanctioned=false;
				LocalDate registrationDate= LocalDate.now();
				LocalDate sanctionEndDate= null;
				//las expresiones regulares, ponerlas aqui, en vez de en el constructor(creo)
				
				System.out.println("Dime tu nombre");
				name=keyboard.nextLine();
				System.out.println("Dime tu email");
				email=keyboard.nextLine();

				break;
			case 2:
				System.out.println("hola");
				break;
			case 3:
				System.out.println("hola");
				break;
			case 4:
				System.out.println("hola");
				break;
			case 5:
				System.out.println("hola");
				break;
			case 6:
				System.out.println("hola");
				break;
			case 7:
				System.out.println("hola");
				break;
			case 8:
				break;
			default:
				System.err.println("Option invalid, give me a valid one");

			}
				
			
			
		}
		
	}
}
