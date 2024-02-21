import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieliste = new MovieCollection();
        int userChoice = 0;
        int sentinel = 3;

        while (userChoice != sentinel) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Print filmsamlingen");
            System.out.println("3. Afslut");

            userChoice = scanner.nextInt();
            if (userChoice == 1) {

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

                //Add movie to collection
                movieliste.addMovie(title, director, year, color, minute, genre);

            } else if (userChoice==2) {
                movieliste.printMyCollection();
            } else if (userChoice == sentinel) {
                System.out.println("Afsluttet");
            } else {
                System.out.println("Error, wrong input try again");
                break;
            }
        }
    }
}
