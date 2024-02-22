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
    public String toString() {
        String farve;
        if (this.getColor()) {
            farve = "The movie is in color\n";
        } else {
            farve = "The movie is in black & white\n";
        }
        return  "The title of the movie: " + this.getTitle() + "\n" +
        "The director of the movie: " + this.getDirector() + "\n" +
        "The year of the movie: " + this.getYear() + "\n" +
       farve +
        "The movie's length in minutes: " + this.getLengthInMinutes() + "\n" +
        "The genre of the movie: " + this.getGenre() + "\n";
    }
}
