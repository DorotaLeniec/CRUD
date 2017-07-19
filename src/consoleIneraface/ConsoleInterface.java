package consoleIneraface;

import cinema.Cinema;
import cinema.Movie;
import cinema.MovieType;
import cinema.ScreeningDate;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dorka on 19.07.2017.
 */
public class ConsoleInterface {
    public static void main(String[] args) {
        Cinema cinema = cinemaInit();
        Scanner scan = new Scanner(System.in);
        cinema.introduce();
        ConsolePanel panel = new ConsolePanel();
        int decision;

        do {
            panel.printInstruction("Wybierz jedną z opcji :");
            panel.printOption("Konematografia",1);
            panel.printOption("Seanse",2);
            panel.printOption("Dodaj film",3);
            panel.printOption("Usuń film",4);
            panel.printOption("Wyjdź",0);
            if(scan.hasNextInt()) {
                decision = scan.nextInt();
            } else {
                decision = -1;
            }
            if(decision!=0) {
                if (decision == 1) {
                    cinema.showMovies();
                } else if(decision == 2){
                    cinema.showMovieScreening();
                } else if(decision == 3){

                    String title = panel.nextString("Podaj tytuł filmu: ");
                    int creationDate = panel.nextInt("Podaj datę produkcji:");
                    String typeLetter = panel.nextString("Podaj gatunek filmu: ");
                    cinema.addMovie(title,creationDate,MovieType.KOMEDIA);
                }else if(decision == 4){
                    String title = panel.nextString("Poda tytuł filmu do usuniecia");
                    cinema.removeMovie(title);

                }else {
                    panel.printError("Nieznana komenda");
                }
            }
        }while(decision!=0);

        System.out.println(cinema.getName() + " ŻEGNAJ!!");

    }

    private static Cinema cinemaInit() {
        Cinema cinema = new Cinema("-FAJNE KINO-");
        cinema.addMovie("Yes Man",2000, MovieType.KOMEDIA);
        cinema.addMovie("Scream 3",2010, MovieType.HORROR);
        cinema.addMovie("Harry Potter",2001, MovieType.AKCJA);
        cinema.addMovie("Scary Movie 4",2000, MovieType.HORROR);
        cinema.addMovieScreening("Don't Breath",2016,MovieType.HORROR, "Wtorek","22:00");
        cinema.addMovieScreening("Zorro",1990,MovieType.AKCJA, "Piątek","19:00");
        cinema.addMovieScreening("Planeta Singli",2016,MovieType.KOMEDIA,"Wtorek","22:00");
        cinema.addMovieScreening("Untouchable",2016,MovieType.HORROR,"Wtorek","22:00");
        return cinema;
    }
}
