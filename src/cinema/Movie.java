package cinema;

/**
 * Created by dorka on 18.07.2017.
 */
public class Movie {
    private String title;
    private int creationYear;

    public String getTitle() {
        return title;
    }

    public int getCreationYear() {
        return creationYear;
    }



    public Movie(String title, int creationYear) {
        this.title = title;
        this.creationYear = creationYear;
    }
}
