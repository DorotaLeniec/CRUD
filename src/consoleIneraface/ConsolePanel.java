package consoleIneraface;

import cinema.MovieType;

import java.util.Scanner;

/**
 * Created by dorka on 19.07.2017.
 */
public class ConsolePanel {
    Scanner scan = new Scanner(System.in);
    public void printOption(String command, int keyNum){
        System.out.println("            "+ keyNum + " -- "+ command);
    }
    public void printInstruction(String instruction){
        System.out.println(instruction);
    }

    public void printError(String message){
        System.out.println("********************************");
        System.out.println("     " + message + "   ");
        System.out.println("********************************");
    }

    public String nextString(String message){
        System.out.println(message);
        return scan.next();
    }

    public int nextInt(String message){
        System.out.println(message);
        return scan.nextInt();
    }

    public MovieType nextMovieType(String message){
        System.out.println(message);
        return MovieType.KOMEDIA;
    }


}
