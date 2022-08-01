package esercizio.main;

public class Main {

	public static void main(String[] args) {
		Book libro1 = new Book("1","1","1",1,"1","1");
		Book libro2 = new Book("2","2","2",2,"2","2");
		Magazine rivista1 = new Magazine("1","1","1",1,Periodicity.MONTHLY);
		
		Archive archivio = new Archive();
		archivio.addToList(rivista1);
		archivio.addToList(libro1);
		archivio.addToList(libro2);
		System.out.println(archivio.searchByAuthor("1"));
		System.out.println(archivio.searchByIsbn("2"));
		System.out.println(archivio.searchByYearOfPublucation("2"));
		archivio.removeFromList("2");
		archivio.saveArchive();
		archivio.loadArchive();
	}

}
