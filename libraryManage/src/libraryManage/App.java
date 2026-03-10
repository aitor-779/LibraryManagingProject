package libraryManage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class App implements Comparable{
	public static void main(String [] args){
		ArrayList<Book> library= new ArrayList<>();
		HashSet<Book> librarySet = new HashSet<>();
		
		Book book1 = new Book("LIB0001","book one");
		Book book2 = new Book("LIB0002","book 2");
		
		librarySet.add(book1);
		librarySet.add(book2);
		
		Book book3 = new Book("LIB0003","book tercero");
		librarySet.add(book3);
		for (Book book : librarySet) {
			System.out.println(book);
		}
		
		if (book3.compareTo(book2)==0) {
			System.out.println("Book exists");
		}else {
			library.add(book3);
		}
		//Collection.sort(library);
		/*/
		if(library.contains(book3)) {
			System.out.println("Book exists");
		}else {
			library.add(book3);
		}
		*/
		for(Book book : library) {
			if (book.getCode().equals("LIB0002")) {
				System.out.println("Book exists");
			}
		}
		
		System.out.println(library.contains(book2));
		
		Book[] bookArray = new Book[3];
		bookArray[0]=book1;
		bookArray[1]=book2;
		bookArray[2]=book3;
		
		for (int i=0;i<bookArray.length;i++) {
			System.out.println(bookArray[i]);
		}

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
