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
            System.out.println("3. Search movie");
            System.out.println("4. Afslut");

            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                movieController.addMovie();

            } else if (userChoice==2) {
                movieController.liste.printMyCollection();
            } else if(userChoice==3) {
                movieController.liste.searchMovie();
            } else if (userChoice >= sentinel) {
                System.out.println("Afsluttet");
            }
        }
    }
}
