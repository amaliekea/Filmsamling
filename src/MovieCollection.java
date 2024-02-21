import java.util.ArrayList;

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
            m.printMovie();
        }
    }

}

