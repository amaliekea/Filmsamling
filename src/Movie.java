public class Movie {
    private String title;
    private String director;
    private int year;
    private boolean Color;
    private int lengthInMinutes;
    private String genre;

    public Movie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.Color = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public boolean getColor() {
        return Color;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }
    public void printMovie () {
        System.out.println("The title of the movie: " + this.getTitle());
        System.out.println("The director of the movie: " + this.getDirector());
        System.out.println("The year of the movie: " + this.getYear());
        if (this.getColor()) {
            System.out.println("The movie is in color");
        } else {
            System.out.println("The movie is in black & white");
        }
        System.out.println("The movie's length in minutes: " + this.getLengthInMinutes());
        System.out.println("The genre of the movie: " + this.getGenre());
        System.out.println("____________________");
    }
}
