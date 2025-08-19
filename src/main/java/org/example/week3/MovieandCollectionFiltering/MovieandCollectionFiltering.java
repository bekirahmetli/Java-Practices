package org.example.week3.MovieandCollectionFiltering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieandCollectionFiltering {
    public static void main(String[] args){

        List<Movie> movieList = new ArrayList<>();// Create a List to store Movie objects using ArrayList

        // Create Movie objects with title, release year, genre, and IMDb rating
        Movie movie = new Movie("Titanic",1997,"Drama",8.5);
        Movie movie2 = new Movie("The Green Mile",1999,"Drama",8.8);
        Movie movie3 = new Movie("Avatar",2009,"Fantasy",8.3);
        Movie movie4 = new Movie("Twilight",2008,"Fantasy",6.9);
        Movie movie5 = new Movie("50 First Dates",2004,"Romance",7.9);

        // Add Movie objects to the list
        movieList.add(movie);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);

        // Sort the movie list by IMDb rating in descending order
        Collections.sort(movieList, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Double.compare(o2.getImdbRating(),o1.getImdbRating());// Compare using Double.compare to sort by IMDb rating (higher to lower)
            }
        });

        System.out.println("Sorting by IMDb (Largest to Lowest):");
        // Print the sorted list by IMDb rating
        for (Movie m : movieList){
            System.out.println(m);
        }

        // Sort the movie list by release year in ascending order
        Collections.sort(movieList, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                // Compare using Integer.compare to sort by release year (earlier to later)
                return Integer.compare(o1.getReleaseYear(),o2.getReleaseYear());
            }
        });

        System.out.println("\nSort by Publication Year (Low to High):");
        // Print the sorted list by release year
        for (Movie m : movieList){
            System.out.println(m);
        }

        // Print a newline and header for genre filtering
        System.out.println("\nMovies in Drama Genre:");
        // Call method to filter and print movies with the "Action" genre
        filterbyMovieGenre(movieList, "Drama");
    }

    // Method to filter and print movies by a specific genre
    public static void filterbyMovieGenre(List<Movie> movies,String type){
        // Iterate through the movie list to find matches
        for (Movie m : movies) {
            // Check if the movie genre contains the specified type (case-insensitive)
            if (m.getMovieGenre().equalsIgnoreCase(type)) {
                System.out.println(m);
            }
        }
    }
}
