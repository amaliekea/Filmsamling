import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> filmObjekter;

    public MovieCollection () {
        filmObjekter = new ArrayList<>();
    }

    public void addMovie(String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
        filmObjekter.add(new Movie(title, director, year, Color, lengthInMinutes, genre));
    }

}
