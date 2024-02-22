import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieliste = new MovieCollection();
        int userChoice = 0;
        int sentinel = 4;

        while (userChoice < sentinel) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Print filmsamlingen");
            System.out.println("3. Search movie");
            System.out.println("4. Afslut");

            userChoice = scanner.nextInt();
            if (userChoice == 1) {

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
                    color=true;
                }

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
            } else if(userChoice==3) {
                System.out.println("Error, wrong input try again");
            } else {
                movieliste.searchMovie();
            }
        }
    }
}
