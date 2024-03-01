import java.util.InputMismatchException;
import java.util.Scanner;
//skaffer brugerinput

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Controller movieController = new Controller();

    public void startProgram() {
        int userChoice = 0;
        int sentinel = 6;

        while (userChoice < sentinel) {
            userChoice = movieMenu();

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
            } else if (userChoice == 5) {
                editMovie();

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
        System.out.println("5. Edit movie");
        System.out.println("6. Afslut");
        int userChoice = scanner.nextInt();
        return userChoice;
    }

    private void addMovie() {
        System.out.println("input movie title");
        String title = scanner.next();

        System.out.println("input director");
        String director = scanner.next();

        System.out.println("input year created");
        int year = 0;
        boolean flag = false;
        while (!flag) {
            try {
                year = scanner.nextInt();
                flag = true;
            } catch (InputMismatchException first) {
                System.out.println("fail, try again");
                System.out.println("Input year created agian");
                scanner.nextLine();
            }
        }

        boolean color = false;
        System.out.println("is the movie in color? yes/no");
        String erIFarve = scanner.next();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("yes")) {
            color = true;
        }

        System.out.println("input length in minutes");
        int minute = 0;
        boolean flag1 = false;
        while (!flag1) {
            try {
                minute = scanner.nextInt();
                flag1 = true;
            } catch (InputMismatchException second) {
                System.out.println("fail, try again");
                System.out.println("Input length in minutes agian");
                scanner.nextLine();
            }
        }

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

    public void editMovie() {
        System.out.println("type the number of the movie you want to edit:");
        int movieNumber = scanner.nextInt();
        movieController.printMovie(movieNumber);
        Movie m = movieController.getMovie(movieNumber);
        System.out.println("Would you like to edit the title? blank for no edit");
        String titleEdit = scanner.next();
        if (!titleEdit.isBlank()) {
            m.setTitle(titleEdit);
        } else {
            titleEdit = m.getTitle();
        }
        System.out.println("Would you like to edit the director? blank for no edit");
        String directorEdit = scanner.next();
        if (!directorEdit.isBlank()) {
            m.setDirector(directorEdit);
        } else {
            directorEdit = m.getDirector();
        }

        System.out.println("Would you like to edit the year? 0 for no edit");
        int yearEdit = scanner.nextInt();
        if (yearEdit != 0) {
            m.setYear(yearEdit);
        } else {
            yearEdit = m.getYear();
        }

        System.out.println("Would you like to edit the color? true/false for no edit");
        boolean colorEdit = scanner.nextBoolean();
        if (colorEdit != m.getColor()) {
            m.setColor(colorEdit);
        }

        System.out.println("Would you like to edit the length in minutes? 0 for no edit");
        int lengthEdit = scanner.nextInt();
        if (lengthEdit != 0) {
            m.setLengthInMinutes(lengthEdit);
        } else {
            lengthEdit = m.getLengthInMinutes();
        }

        System.out.println("Would you like to edit the genre? blank for no edit");
        String genreEdit = scanner.next();
        if (!genreEdit.isBlank()) {
            m.setGenre(genreEdit);
        } else {
            genreEdit = m.getGenre();
        }
        movieController.editMovie(movieNumber, titleEdit, directorEdit, yearEdit, colorEdit, lengthEdit, genreEdit);
    }
}
