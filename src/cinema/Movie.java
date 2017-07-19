package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class Movie {
    private String title;
    private int creationYear;
    private int id;
    private MovieType movieType;

    public int getId() {
        return id;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public String getTitle() {
        return title;
    }

    public int getCreationYear() {
        return creationYear;
    }




    public Movie(String title, int creationYear,MovieType movieType) {
        this.title = title;
        this.creationYear = creationYear;
        this.id=index;
        index++;
        this.movieType = movieType;

    }
    public static int index = 1;
}
