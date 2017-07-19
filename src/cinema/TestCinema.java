package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class TestCinema {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("-FAJNE KINO-");
        cinema.addMovie(new Movie("Piraci z Karaibów",1999,MovieType.KOMEDIA));
        cinema.addMovieScreening("Spider Man",2017,MovieType.AKCJA,"Ponidziałek","19:00");
        cinema.addMovieScreening("Into the Wild",2005,MovieType.DRAMAT,"Wtorek","20:00");
        cinema.addMovieScreening("Scream",2010,MovieType.HORROR,"Sobota","22:00");
        cinema.addMovieScreening("Killer",1990,MovieType.KOMEDIA,"Niedziela","12:00");

        cinema.showMovieScreening();
        cinema.showMovies();
    }
}
