
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class MovieDriver {
	
	private static HashMap <Integer, Movie> movies = new HashMap<Integer, Movie>();

	public static void main(String[] args) {
		populateMovies();
		displayMovies();
	}

	/**
	 * This method uses a Scanner and gets user input for three movies (title, length, release date
	 * which it will then use to make a new Movie and add it into the HashMap movies.
	 */
	private static void populateMovies() {
		System.out.println("Creating movies");
		// TODO add your code here.
		Scanner scanner = new Scanner(System.in);		
		for(int index = 1; index <=3; index++) {
			System.out.print("\nType in the name of the movie "+index +":");
			String moviename = scanner.nextLine();
			System.out.print("\nType in the runtime of the movie "+index +":");
			int runtime = scanner.nextInt();
			scanner.nextLine();
			System.out.print("\nType in the release date of the movie "+index +":");
			String releaseDate = scanner.nextLine();		
			LocalDate rDate = LocalDate.parse(releaseDate);
			movies.put(index,new Movie(moviename,runtime,releaseDate));
		}
		scanner.close();
	}
	
	/**
	 * This method loops through all the movies using the forEach method 
	 * and displays each movie using its toString() method.
	 */
	private static void displayMovies() {
		System.out.println("\nHere is the list of movies:");
		// TODO add your code here.
		movies.forEach((k, v) -> System.out.println("\t"+v));
	}
}
