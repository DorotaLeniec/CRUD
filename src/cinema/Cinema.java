package cinema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dorka on 18.07.2017.
 */
public class Cinema {

    private List<Movie> movies = new ArrayList<>();
    private List<Screening> movieScreening = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addMovieScreening(Movie movie,ScreeningDate screeningDate) {
        movieScreening.add(new Screening(screeningDate,movie));
    }

    public void showMovies(){
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " " + movie.getCreationYear());
        }

    }

    public void showMovieScreening(){
        for (Screening screening : movieScreening) {
            System.out.print( screening.getScreeningDate().getDay());
            System.out.print(" " + screening.getScreeningDate().getHour());
            System.out.print(" - '" + screening.getMovie().getTitle()+"'");
            System.out.println();
        }

    }

}
