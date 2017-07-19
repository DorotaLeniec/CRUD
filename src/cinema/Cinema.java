package cinema;

import java.util.*;

/**
 * Created by dorka on 18.07.2017.
 */
public class Cinema {
    private Map<MovieType,List<Movie>> moviesTypeMap = new EnumMap<>(MovieType.class);
    private List<Screening> movieScreenings = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public Cinema(String name) {
        for (MovieType movieType : MovieType.values()) {
            moviesTypeMap.put(movieType, new ArrayList<>());
        }
        this.name = name;

    }

    public void addMovie(Movie movie) {
        MovieType type = movie.getMovieType();
        List<Movie> movieList = moviesTypeMap.get(type);
        movieList.add(movie);
    }

    public void addMovieScreening(String title, int creationDate, MovieType movieType, String screeningDay, String screeningHour) {
        Movie movie = new Movie(title,creationDate,movieType);
        addMovie(movie);
        movieScreenings.add(new Screening(new ScreeningDate(screeningDay,screeningHour),movie));
    }

    public void removeMovie(String title){
        for (List<Movie> movies : moviesTypeMap.values()) {
            for (Movie movie : movies) {
                if(movie.getTitle() == title){
                    movies.remove(movie);
                }
            }
        }
    }

    public void showMovies(){
        System.out.println("===============================================");
        System.out.println("|              NASZA KINEMATOGRAFIA !         |");
        System.out.println("===============================================");
        printSpaces(4);
        System.out.print("Tytuł");
        printSpaces(9);
        System.out.print(" ||");
        System.out.print("Rok produkcji");
        System.out.print(" || ");
        printSpaces(2);
        System.out.print("Gatunek");
        printSpaces(1);
        System.out.print("||");
        System.out.println();
        System.out.println("__________________________________________________");
        for (List<Movie> movies : moviesTypeMap.values()) {
           for(int i=0;i<movies.size();i++){
               Movie mov = movies.get(i);
               System.out.print(mov.getTitle() );
               printSpaces(18 - mov.getTitle().length());
               System.out.print(" || " + mov.getCreationYear());
               printSpaces(8);
               System.out.print(" || ");
               System.out.print(mov.getMovieType());
               printSpaces(10 - mov.getMovieType().toString().length());
               System.out.print(" || ");
               System.out.println();
//               System.out.println("["+ mov.getId() + "]["+mov.getTitle()+"], [data produkcji: "+ mov.getCreationYear() + "], [gatunek : "+ mov.getMovieType()+"]");
           }
        }
        System.out.println("____________________________________________________");
    }

    public void showMovieScreening(){
        System.out.println("======================================================");
        System.out.println("|                     OBECNIE GRAMY                  |");
        System.out.println("======================================================");
        if(movieScreenings.size()!=0) {
            for (Screening screening : movieScreenings) {
                System.out.print(screening.getScreeningDate().getDay());
                System.out.print(" " + screening.getScreeningDate().getHour());
                String title = screening.getMovie().getTitle();
                int titleLength = title.length();
                System.out.print(" || " +  title);
                printSpaces(18-titleLength);
                System.out.print(" || " + screening.getMovie().getMovieType());
                System.out.println();
            }
        } else {
            System.out.println("Przerwa świąteczna. Przepraszamy!");
        }
        System.out.println("_______________________________________________________");

    }

    public void addMovie(String title, int year, MovieType movieType) {
        addMovie(new Movie(title,year,movieType));
    }

    public void introduce(){
        System.out.println("==================================");
        System.out.println("|           "+name + "         |");
        System.out.println("==================================");
    }

    private  void printSpaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }
}
