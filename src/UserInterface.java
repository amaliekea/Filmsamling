import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Controller movieController = new Controller();
    public void startProgram() {
        int userChoice = 0;
        int sentinel = 5;

        while (userChoice < sentinel) {
           userChoice=movieMenu();

            if (userChoice == 1) {
             addMovie();

            } else if (userChoice == 2) {
                movieController.printCollection();

            } else if (userChoice == 3) {
                int movieNumber = getMovieNumber();
                movieController.printMovie(movieNumber);

            } else if (userChoice == 4) {
                String title = getTitle();
                movieController.searchMovie(title);

            } else if (userChoice >= sentinel) {
                System.out.println("Afsluttet");
            }
        }
    }
    private int movieMenu() {
        System.out.println("Velkommen til min filmsamling!");
        System.out.println("1. Opret en film");
        System.out.println("2. Print filmsamlingen");
        System.out.println("3. Print en enkelt film");
        System.out.println("4. Search movie");
        System.out.println("5. Afslut");
        int userChoice = scanner.nextInt();
        return userChoice;
    }
    private void addMovie() {
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

        movieController.addMovie(title, director, year, color, minute, genre);
    }
    private int getMovieNumber() {
        System.out.println("What nr. movie would you like to print?");
        int movieNumber = scanner.nextInt();
        return movieNumber;
    }
    private String getTitle() {
        System.out.println("What is the title of the movie you'd wish to search for?");
        String title = scanner.next();
        return title;
    }
}
