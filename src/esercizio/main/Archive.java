package esercizio.main;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archive {
	
	private List<ReadableMedias> archive;
	
	public Archive(List<ReadableMedias> archive) {this.archive = archive;}
	public Archive() {this.archive = new ArrayList<ReadableMedias>();}
	
	public void addToList(ReadableMedias media) {this.archive.add(media);}
	
	public void removeFromList(String isbn) {
		archive.removeAll(archive.stream().filter( media -> media.getIsbn() == isbn ).collect(Collectors.toList()));
	}
	
	public List<ReadableMedias> searchByIsbn(String isbn) {
		return archive.stream().filter( media -> media.getIsbn() == isbn ).collect(Collectors.toList());
	}
	
	public List<ReadableMedias> searchByAuthor(String author) {
		return archive.stream().filter( media -> media.getClass() == Book.class ).filter( media ->((Book) media).getAuthor() == author).collect(Collectors.toList());
	}
	
	public List<ReadableMedias> searchByYearOfPublucation(String yearOfPublucation) {
		return archive.stream().filter( media -> media.getYearOfPublication() == yearOfPublucation ).collect(Collectors.toList());
	}
	
	public void saveArchive() {
		File obj = new File("archive.txt");
		try {
		      FileWriter myWriter = new FileWriter(obj);
		      myWriter.write(archive.stream().map(Object::toString).collect(Collectors.joining(", ")));
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public void loadArchive() {
	    try {
	        File myObj = new File("archive.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
}
