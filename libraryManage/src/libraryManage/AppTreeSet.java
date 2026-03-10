package libraryManage;

import java.util.Iterator;
import java.util.TreeSet;

public class AppTreeSet implements Comparable{
	public static void main(String[] args) {

		
		
		Book book1 = new Book("LIB0001","book one");
		Book book2 = new Book("LIB0002","book 2");
		Book book3 = new Book("LIB0003","book tercero");
		Book book4 = new Book("LIB0003","book cuarto");

		TreeSet<Book> tree= new TreeSet();
		tree.add(book3);
		tree.add(book1);
		tree.add(book2);
		
		
		for (Book book : tree) {
			System.out.println(book);
		}
		add(book4,tree);
		modify(tree);
		delete(tree);
	}

	//add a existing book code, check if its added and return value
	
	public static boolean add(Book book, TreeSet tree) {
		int prevLeng=tree.size();
		tree.add(book);
		if (tree.size()>prevLeng) {
			return true;
		}else {
			return false;
		}
	
	}

	
	//remove one book
		
	public static void delete(TreeSet tree)	{
		Iterator iter=tree.iterator();
		while(iter.hasNext()) {
			Book book = (Book) iter.next();
			if (book.getTitle() == "book one") {
				//puedo quitarlo desde el iter o desde el tree porque apuntan al mismo sitio de memoria
				iter.remove();
			}
		}
	}
			
	//modify one book
	public static void modify(TreeSet tree)	{
		Iterator iter=tree.iterator();
		while(iter.hasNext()) {
			Book book = (Book) iter.next();
			if (book.getTitle() == "book one") {
				book.setTitle("libro uno");
			}
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
			
	
}
