package esercizio.main;

public class Book extends ReadableMedias {
	
	private String author;
	private String genre;
	
	public Book(String isbn, String title, String yearOfPublication, int numberOfPages, String author, String genre) {
		super(isbn,title,yearOfPublication,numberOfPages);
		this.author = author;
		this.genre = genre;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	@Override
	public String toString() {
		return this.getIsbn() + " " + this.getTitle() + " " + this.getYearOfPublication() + " " + this.getNumberOfPages() + " " + author + " " + genre;
	}
}
