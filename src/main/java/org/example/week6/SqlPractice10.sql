
--Write a LEFT JOIN query that will allow us to see the city and country names in the city table and country table together.
SELECT city,country FROM city
LEFT JOIN country ON city.country_id = country.country_id

--Write a RIGHT JOIN query that will allow us to see the payment_id in the customer table and payment table, as well as the first_name and last_name names in the customer table.
SELECT payment_id,first_name,last_name FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id

--Write a FULL JOIN query that will allow us to see the rental_id in the customer table and the rental table, as well as the first_name and last_name names in the customer table.
SELECT rental_id,first_name,last_name FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id