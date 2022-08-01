package esercizio.main;

public class Magazine extends ReadableMedias {
	
	private Periodicity periodicity;
	
	public Magazine(String isbn, String title, String yearOfPublication, int numberOfPages, Periodicity periodicity) {
		super(isbn,title,yearOfPublication,numberOfPages);
		this.periodicity = periodicity;
	}
	
	public Periodicity getPeriodicity() {
		return this.periodicity;
	}
	
	@Override
	public String toString() {
		return this.getIsbn() + " " + this.getTitle() + " " + this.getYearOfPublication() + " " + this.getNumberOfPages() + " " + periodicity;
	}
}
