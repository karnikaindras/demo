package demo.main;

import demo.model.Movie;
import demo.model.Screen;

public class Test {

	public static void main(String[] args) {
		Screen screen1 = new Screen();
		screen1.setScreenName("screen1");
		Movie movie = new Movie(screen1);
		movie.setMovieName("raazi");
		movie.setCast("alia");
		
		screen1.setMovie(movie);
		
		
		System.out.println(" screen1 " +screen1);
		System.out.println(" movie " +movie);
		
		System.out.println("get Screen by movie name" +movie.getScreen());
		

	}

}
