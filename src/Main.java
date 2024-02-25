import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller movieController = new Controller();
        int userChoice = 0;
        int sentinel = 4;

        while (userChoice < sentinel) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Print filmsamlingen");
            System.out.println("3. Print en enkelt film");
            System.out.println("4. Search movie");
            System.out.println("5. Afslut");

            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                movieController.addMovie();

            } else if (userChoice==2) {
                movieController.printCollection();
            } else if(userChoice==3) {
                System.out.println("What nr. movie would you like to print?");
                int movieNumber = scanner.nextInt();
                movieController.printMovie(movieNumber);
            } else if (userChoice==4) {
                System.out.println("What is the title of the movie you'd wish to search for?");
                String title = scanner.next();
                movieController.searchMovie(title);
            } else if (userChoice >= sentinel) {
                System.out.println("Afsluttet");
            }
        }
    }
}
