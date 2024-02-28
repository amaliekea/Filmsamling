import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addMovie() {
        //Arrange - setup our test objects.
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie("Hunger Games", "James", 2002, true, 120, "future");

        //Act - Execute the method under test with the arranged conditions.
        int expectedMovie = 1;
        int actualMovie = movieCollection.filmObjekter.size();


        //Assert -verify the actions's outcome is as expected
        Assertions.assertEquals(expectedMovie, actualMovie);
    }

    @Test
    void printMyCollection() {
        //Arrange

        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie("Hunger Games", "James", 2002, true, 120, "future");
        movieCollection.addMovie("Titanic", "Nikolaj", 2000, true, 120, "romance");
        movieCollection.printMyCollection(); //?
        // Act
        movieCollection.printMyCollection();
        int expectedNumberOfMovies = 2;
        int actualNumberOfMovies = movieCollection.filmObjekter.size();

        // Assert
        Assertions.assertEquals(expectedNumberOfMovies, actualNumberOfMovies);
    }

}

