
public class Movie {
	private String title;
	private String director;
	private String ageRating;
	
	public Movie(String title, String director, String ageRating) {
		this.setTitle(title);
		this.setDirector(director);
		this.setRating(ageRating);
		
	}
	
	public void setRating(String ageRating) {
		
		if(ageRating.equals("G") || ageRating.equals("PG-13") || ageRating.equals("R") || ageRating.equals("NR") ) {
		this.ageRating = ageRating;
		} else {
		this.ageRating = "NR";
		}
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getRating() {
		return ageRating;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDirector() {
		return this.director;
	}
}
