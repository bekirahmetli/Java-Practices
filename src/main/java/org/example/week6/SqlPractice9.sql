

--Write an INNER JOIN query that will allow us to see the city and country names in the city table and country table together.
SELECT city,country FROM city
INNER JOIN country ON city.country_id = country.country_id

--Write an INNER JOIN query where we can see the payment_id in the customer table and payment table, as well as the first_name and last_name names in the customer table.
SELECT payment_id,first_name,last_name FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id

--Write an INNER JOIN query that will allow us to see the rental_id in the customer table and the rental table, as well as the first_name and last_name names in the customer table.
SELECT rental_id,first_name,last_name FROM rental
INNER JOIN customer ON rental.customer_id = customer.customer_id