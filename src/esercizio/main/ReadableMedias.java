package esercizio.main;

public abstract class ReadableMedias {
	
	private String isbn;
	private String title;
	private String yearOfPublication;
	private int numberOfPages;
	
	public ReadableMedias(String isbn, String title, String yearOfPublication, int numberOfPages) {
		this.isbn = isbn;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getYearOfPublication() {
		return this.yearOfPublication;
	}
	
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
}
