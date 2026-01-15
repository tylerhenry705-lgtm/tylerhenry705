
public class Movie {
	
	String moviename;
	int runtime;
	String releaseDate;
	public String getMoviename() {
		return moviename; 
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	//make constructor
	public Movie(String moviename, int runtime, String releaseDate) {
		this.moviename = moviename;
		this.runtime = runtime;
		this.releaseDate = releaseDate;
	}
	
	public String toString() {
		return moviename + " (" + releaseDate + ") " + runtime + " minutes.";
	}
}
