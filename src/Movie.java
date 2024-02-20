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
        this.Color = Color;
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
}
