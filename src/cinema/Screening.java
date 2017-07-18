package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class Screening {
    private ScreeningDate screeningDate;
    private Movie movie;

    public ScreeningDate getScreeningDate() {
        return screeningDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screening(ScreeningDate screeningDate, Movie movie) {
        this.screeningDate = screeningDate;
        this.movie = movie;
    }
}
