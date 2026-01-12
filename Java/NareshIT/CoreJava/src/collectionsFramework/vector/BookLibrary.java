package collectionsFramework.vector;

import java.util.ArrayList;
import java.util.Scanner;

class Boook{
	private String title;
	private String author;
	private long isbn;
	private double price;
	private int quantity;
	
	public Boook(String title, String author, long isbn, double price, int quantity) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public String getTitle() {
		return title;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public String displayBook() {
		return("title="+title+", author="+author+", isbn="+isbn+", price="+price+", quantity="+quantity);
	}
	
}




class Libraryy{
	private ArrayList<Boook> books ;
	
	 public Libraryy() {
	        books = new ArrayList<>();
	    }
	 
	 public void addBook(Boook book) {
	        if (searchBookByISBN(book.getIsbn()) != null) {
	            System.out.println("Book with the same ISBN " + book.getIsbn() + " already exists.");
	            return;
	        }
	        books.add(book);
	        System.out.println("Book added successfully.");
	    }
	 
	    private Boook searchBookByISBN(long isbn) {
	        for (Boook b : books) {
	            if (b.getIsbn() == isbn) {
	                return b;
	            }
	        }
	        return null;
	    }


	    public void displayAllBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books available in the Library.");
	            return;
	        }

	        for (Boook book : books) {
	            System.out.println(book.displayBook());
	        }
	    }
	    
	    
	    
	    
	    
	    public void updateBookQuantityByISBN(long isbn, int newQuantity) {

	        Boook book = searchBookByISBN(isbn);

	        if (book == null) {
	            System.out.println("Book with ISBN " + isbn + " not found.");
	            return;
	        }

	        if (newQuantity <= 0) {
	            System.out.println("Invalid quantity.");
	            return;
	        }

	        book.setQuantity(newQuantity);
	        System.out.println("Quantity updated successfully.new quantity = " + newQuantity);
	    }

	    
	    
	    
	    public void deleteBookByTitle(String title) {

	        if (title == null || title.isBlank()) {
	            System.out.println("Book Title cannot be blank");
	            return;
	        }

	        for (Boook book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                books.remove(book);
	                System.out.println(title + " book has removed successfully...");
	                return;
	            }
	        }

	        System.out.println("Book with title " + title + " not found.");
	    }
	}


public class BookLibrary {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Libraryy library = new Libraryy();

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    long isbn = sc.nextLong();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    Boook book = new Boook(title, author, isbn, price, quantity);
                    library.addBook(book);
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    System.out.print("Enter ISBN: ");
                    long updateIsbn = sc.nextLong();

                    System.out.println("Updating quantity of book : ");
                    System.out.print("Enter new Quantity: ");
                    int newQty = sc.nextInt();

                    library.updateBookQuantityByISBN(updateIsbn, newQty);
                    break;

                case 4:
                    System.out.println("Enter Book Title :");
                    String delTitle = sc.nextLine();
                    library.deleteBookByTitle(delTitle);
                    break;

                case 5:
                    System.out.println("Exiting from the Application. Thank you!!!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
