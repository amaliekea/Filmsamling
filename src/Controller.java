import java.util.Scanner;

public class Controller {
   private MovieCollection liste;

    public Controller() {
        liste = new MovieCollection();
    }

    public void addMovie(String title, String director, int year, boolean color, int minute, String genre) {
        liste.addMovie(title, director, year, color, minute, genre);
    }
    public void printCollection() {
        liste.printMyCollection();
    }
    public void printMovie (int i) {
        liste.printMovie(i);
    }
    public int searchMovie(String title) {
        return liste.searchMovie(title);
    }
}
