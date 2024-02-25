import java.util.Scanner;

public class Controller {
   private MovieCollection liste;

    public Controller() {
        liste = new MovieCollection();
    }

    public void addMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input movie title");
        String title = scanner.next();

        System.out.println("input director");
        String director = scanner.next();

        System.out.println("input yearCreated");
        int year = scanner.nextInt();

        boolean color = false;
        System.out.println("is the movie in color? yes/no");
        String erIFarve = scanner.next();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("yes")) {
            color = true;
        }

        System.out.println("input length in minutes");
        int minute = scanner.nextInt();

        System.out.println("input genre");
        String genre = scanner.next();

        //Add movie to collection
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
