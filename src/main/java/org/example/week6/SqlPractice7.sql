
--Group the movies in the movie table according to their rating values.
SELECT rating, COUNT(*) FROM film
GROUP BY rating;

--When we group the movies in the movie table according to the replacement cost column, sort the replacement_cost value that has more than 50 movies and the corresponding number of movies.
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost;

--What are the customer numbers corresponding to the store_id values ​​in the customer table?
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

--After grouping the city data in the city table according to the country_id column, share the country_id information and the number of cities that contain the highest number of cities.
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY country_id DESC
LIMIT 1;
