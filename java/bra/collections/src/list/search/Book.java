package src.list.search;

public class Book {
	private String title;
	private String author;
	private int publicationYear;
	public Book(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	@Override
	public String toString() {
		return "\n'" + title +
				"' - " + author +
				" - " + publicationYear;
	}
}
