package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class TestCinema {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie("Piraci z Karaibów",1999));
        cinema.addMovie(new Movie("Krzyk 2",1989));
        cinema.addMovieScreening(new Movie("Spider Man",2017),new ScreeningDate("Ponidziałek","19:00"));
        cinema.addMovieScreening(new Movie("Into the Wild",2005),new ScreeningDate("Wtorek","20:00"));
        cinema.addMovieScreening(new Movie("Scream",2010),new ScreeningDate("Sobota","22:00"));
        cinema.addMovieScreening(new Movie("Killer",1990),new ScreeningDate("Niedziela","12:00"));

        cinema.showMovieScreening();
    }
}
