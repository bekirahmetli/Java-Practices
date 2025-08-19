package org.example.week3.MovieandCollectionFiltering;

public class Movie {
    private String movieTitle;
    private Integer releaseYear;
    private String movieGenre;
    private double imdbRating;

    // Constructor to initialize movie details
    public Movie(String movieTitle, Integer releaseYear, String movieGenre, double imdbRating) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.movieGenre = movieGenre;
        this.imdbRating = imdbRating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    // Override toString method to provide a string representation of the Movie object
    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", releaseYear=" + releaseYear +
                ", movieGenre='" + movieGenre + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
