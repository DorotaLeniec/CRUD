package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class TestCinema {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie("Piraci z Karaibów",1999,MovieType.KOMEDIA));
        cinema.addMovieScreening(new Movie("Spider Man",2017,MovieType.AKCJA),new ScreeningDate("Ponidziałek","19:00"));
        cinema.addMovieScreening(new Movie("Into the Wild",2005,MovieType.DRAMAT),new ScreeningDate("Wtorek","20:00"));
        cinema.addMovieScreening(new Movie("Scream",2010,MovieType.HORROR),new ScreeningDate("Sobota","22:00"));
        cinema.addMovieScreening(new Movie("Killer",1990,MovieType.KOMEDIA),new ScreeningDate("Niedziela","12:00"));

        cinema.showMovieScreening();
        cinema.showMovies();
    }
}
