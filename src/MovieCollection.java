import java.util.ArrayList;
import java.util.Scanner;
//creater

public class MovieCollection {
    private ArrayList<Movie> filmObjekter;

    public MovieCollection() {
        filmObjekter = new ArrayList<>();
    }

    public void addMovie(String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
        filmObjekter.add(new Movie(title, director, year, Color, lengthInMinutes, genre));
    }

    public void printMyCollection() {
        for (int i = 0; i < filmObjekter.size(); i++) {
            Movie m = filmObjekter.get(i);
            System.out.println(m.toString());
        }
    }
    public void searchMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the movie: ");
        String title = scanner.nextLine();
        for (Movie movie : filmObjekter) {
            //movie.getTitle().charAt(0)
            if (movie.getTitle().equals(title)) {
                movie.toString();
                return;
            }
        }
        System.out.println("Movie not found.");
    }

}

