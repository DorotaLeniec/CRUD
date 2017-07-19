package cinema;

import java.util.*;

/**
 * Created by dorka on 18.07.2017.
 */
public class Cinema {
    private Map<MovieType,List<Movie>> moviesTypeMap = new EnumMap<>(MovieType.class);
    private List<Screening> movieScreening = new ArrayList<>();

    public Cinema() {
        for (MovieType movieType : MovieType.values()) {
            moviesTypeMap.put(movieType, new ArrayList<>());
        }

    }

    public void addMovie(Movie movie) {
        MovieType type = movie.getMovieType();
        List<Movie> movieList = moviesTypeMap.get(type);
        movieList.add(movie);
    }

    public void addMovieScreening(Movie movie,ScreeningDate screeningDate) {
        addMovie(movie);
        movieScreening.add(new Screening(screeningDate,movie));
    }

    public void showMovies(){
        System.out.println();
        System.out.println("______________________ NASZA KINEMATOGRAFIA ! ______________________");
        for (List<Movie> movies : moviesTypeMap.values()) {
           for(int i=0;i<movies.size();i++){
               Movie mov = movies.get(i);
               System.out.println("["+ mov.getId() + "]["+mov.getTitle()+"], [data produkcji: "+ mov.getCreationYear() + "], [gatunek : "+ mov.getMovieType()+"]");
           }
        }
        System.out.println("_____________________________________________________________________");
    }

    public void showMovieScreening(){
        System.out.println();
        System.out.println("____________________ OBECNIE GRAMY ___________________");
        for (Screening screening : movieScreening) {
            System.out.print( screening.getScreeningDate().getDay());
            System.out.print(" " + screening.getScreeningDate().getHour());
            System.out.print(" -   '" + screening.getMovie().getTitle()+"'");
            System.out.print(" -     " + screening.getMovie().getMovieType());
            System.out.println();
        }
        System.out.println("_______________________________________________________");

    }

}
