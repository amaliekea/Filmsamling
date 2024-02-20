import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Use MovieCollection to manage movie objects
        MovieCollection movieliste = new MovieCollection();
        boolean addAMovie = true;

        while (addAMovie) {
            System.out.println("input movie title");
            String title = scanner.next();

            System.out.println("input director");
            String director = scanner.next();

            System.out.println("input yearCreated");
            int year = scanner.nextInt();

            System.out.println("input true if the movie is in color");
            boolean color = scanner.nextBoolean();

            System.out.println("input length in minutes");
            int minute = scanner.nextInt();

            System.out.println("input genre");
            String genre = scanner.next();

            System.out.println("Do you want to add another movie? true/false");
            addAMovie = scanner.nextBoolean();

            //movie objekt
            Movie movie1 = new Movie(title, director, year, color, minute, genre);

            //print ud til console
            System.out.println("Your inserted values:");
            System.out.println("Title: " + movie1.getTitle());
            System.out.println("Movie details:" + movie1.getDirector());
            System.out.println("Year: " + movie1.getYear());
            System.out.println("color: " + movie1.getColor());
            System.out.println("Minute: " + movie1.getLengthInMinutes());
            System.out.println("genre: " + movie1.getGenre());

            //Add movie to collection
            movieliste.addMovie(title, director, year, color, minute, genre);
        }
        scanner.close();
    }
}