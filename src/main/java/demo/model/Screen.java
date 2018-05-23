package demo.model;

public class Screen implements IScreen {
	private String screenName;
	private Movie movie;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Screen() {
		movie = new Movie(this);
	}
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
		
	}

	public String getScreenName() {
		return this.screenName;
	}

	@Override
	public String toString() {
		return "Screen [screenName=" + screenName + ", movie=" + movie + "]";
	}
	

}
