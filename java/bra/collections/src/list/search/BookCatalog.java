package src.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
	private List<Book> bookList;
	
	public BookCatalog() {
		this.bookList = new ArrayList<>();
	}
	
	public void addBook(String title, String author, int publicationYear) {
		bookList.add(new Book(title, author, publicationYear));
	}
	
	public List<Book>searchByAuthor(String author){
		List<Book>booksByAuthor = new ArrayList<>();
		if (!bookList.isEmpty()) {
			for(Book b : bookList) {
				if (b.getAuthor().equalsIgnoreCase(author)) {
					booksByAuthor.add(b);
				}
			}
			return booksByAuthor;
		} else {
			throw new RuntimeException("The list is empty.");
		}
		
	}
	
	public List<Book> searchByYearsRange(int startYear, int endYear) {
	    List<Book> booksByYearsRange = new ArrayList<>();
	    if (!bookList.isEmpty()) {
	      for (Book b : bookList) {
	        if (b.getPublicationYear() >= startYear && b.getPublicationYear() <= endYear) {
	          booksByYearsRange.add(b);
	        }
	      }
	      return booksByYearsRange;
	    } else {
	      throw new RuntimeException("The list is empty.");
	    }
	  }
	
	 public Book searchByTitle(String titulo) {
		 Book bookByTitle = null;
		    if (!bookList.isEmpty()) {
		      for (Book b : bookList) {
		        if (b.getTitle().equalsIgnoreCase(titulo)) {
		          bookByTitle = b;
		          break;
		        }
		      }
		      return bookByTitle;
		    } else {
		      throw new RuntimeException("The list is empty.");
		    }
		  }
	 
	 public static void main(String[] args) {

		    BookCatalog bookCatalog = new BookCatalog();

		    bookCatalog.addBook("Production-Ready Microservices", "Susan J. Fowler", 2017);
		    bookCatalog.addBook("Java Programmer's Guide", "Peter Jandl Junior", 2021);
		    bookCatalog.addBook("Clean Code", "Robert C. Martin", 2009);
		    bookCatalog.addBook("The Clean Encoder", "Robert C. Martin", 2012);

		    System.out.println("a.1) "+ bookCatalog.searchByAuthor("Robert C. Martin")+"\n");

		    // Displaying books by the same author (in which case there are no books by a specific author)
		    System.out.println("a.2) "+ bookCatalog.searchByAuthor("Nonexistent Author")+"\n");

		    System.out.println("b.1) "+ bookCatalog.searchByYearsRange(2010, 2022)+"\n");

		    // Displaying books within a range of years (in which case there are no books in the range)
		    System.out.println("b.2) "+ bookCatalog.searchByYearsRange(2025, 2030)+"\n");

		    System.out.println("c.1) "+ bookCatalog.searchByTitle("Java Programmer's Guide")+"\n");

		    // Displaying books by title (in which case there are no books with the specified title)
		    System.out.println("c.2) "+ bookCatalog.searchByTitle("Nonexistent Title")+"\n");
		  }
	
}
