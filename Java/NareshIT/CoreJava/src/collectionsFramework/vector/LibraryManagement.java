package collectionsFramework.vector;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

record Book(Integer id, String title, String author){
	
}

class Library{
	
	public void displayAvalableBooks(Vector<Book> books) {
		if(books.isEmpty()) {
			IO.println("No books avalable in the Library");
			return;
		}
		
		IO.println("Avalable Books in the Library:");
		for(Book book:books) {
			IO.println(" "+book);
		}
	}
	
	public void issueBook(Vector<Book> books,Scanner sc) {
		System.out.print("\n Enter Book id which for Book issue :");
        int id = sc.nextInt();
        
        Iterator<Book> it = books.iterator();
        boolean found = false;
        
        while(it.hasNext()) {
			Book book = it.next();
			if(book.id().equals(id)) {
				it.remove();
				IO.println("Book issued successfully: "+book);
				found = true;
				break;
			}
		}
        
        if(!found) {
			IO.println("Book with id "+id+" not found in the Library.");
	}
}
	
	
	public void returnBook(Vector<Book> books,Scanner sc) {
		System.out.print("\n Enter Book id which for Book return :");
		int id = sc.nextInt();
		sc.nextLine(); 
		
		System.out.print(" Enter Book title :");
		String title = sc.nextLine();
		
		System.out.print(" Enter Book author :");
		String author = sc.nextLine();
		
		Book book = new Book(id,title,author);
		books.add(book);
		IO.println("Book returned successfully: "+book);
	}
	
	
	public void searchBook(Vector<Book> books,Scanner sc) {
		
		IO.println("\n 1.Search Book by id \n2. by title/author");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1->{
			System.out.print("\n Enter Book id to search :");
			int id = sc.nextInt();
			
			boolean found = false;
			
			for(Book book:books) {
				if(book.id().equals(id)) {
					IO.println("Book found: "+book);
					found = true;
					break;
				}
			}
			
			if(!found) {
				IO.println("Book with id "+id+" not found in the Library.");
		}
		}
		
		case 2 ->{
		System.out.print("\nEnter keyword to search by title or author: ");
        String keyword = sc.nextLine();
        boolean found = false;
        for (Book book : books) {
        	if(book.title().equalsIgnoreCase(keyword) || book.author().equalsIgnoreCase(keyword)) {
				IO.println("Book found: " + book);
				found = true;
			}
        }
        
        if (!found) {
			IO.println("No books found with the keyword: " + keyword);
		}
		
		
		
		
	}
}
}
}


	

public class LibraryManagement {

	public void main() {
		Vector<Book> books = new Vector<>();
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		
		books.add(new Book(101,"The Great Gatsby","F. Scott Fitzgerald"));
		books.add(new Book(102,"To Kill a Mockingbird","Harper Lee"));
		books.add(new Book(103,"1984","George Orwell"));
		
		while(true) {
			IO.println("\n Library Management System");
			IO.println("1. Display Avalable Books");
			IO.println("2. Issue Book");
			IO.println("3. Return Book");
			IO.println("4. Search Book");
			IO.println("5. Exit");
			IO.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine(); 
			
			switch(choice) {
			case 1-> library.displayAvalableBooks(books);
			case 2-> library.issueBook(books,sc);
			case 3-> library.returnBook(books,sc);
			case 4-> library.searchBook(books,sc);
			case 5-> {
				IO.println("Exiting Library Management System. Goodbye!");
				sc.close();
				return;
			}
			default -> IO.println("Invalid choice. Please try again.");
			}
		}
	}
}


