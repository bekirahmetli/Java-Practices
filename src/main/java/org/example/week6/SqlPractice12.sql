
--In the movie table, movie length is shown in the length column. How many movies are longer than the average movie length?
SELECT COUNT(*) FROM film 
WHERE length > ANY (
    SELECT AVG(length) FROM film
);

--How many movies have the highest rental_rate in the movie table?
SELECT COUNT(*) FROM film 
WHERE rental_rate = ALL (
    SELECT MAX(rental_rate) FROM film
);

--In the movie table, rank the movies with the lowest rental rate and lowest replacement cost values.
SELECT * FROM film 
WHERE rental_rate <= ALL (
    SELECT rental_rate FROM film
)
AND replacement_cost <= ALL (
    SELECT replacement_cost FROM film
)
ORDER BY title;


--In the payment table, list the customers who made the most purchases.
SELECT 
    c.customer_id,
    c.first_name,
    c.last_name,
    COUNT(p.payment_id) AS alisveris_sayisi
FROM customer c
JOIN payment p ON c.customer_id = p.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
HAVING COUNT(p.payment_id) >= ALL (
    SELECT COUNT(payment_id) 
    FROM payment 
    GROUP BY customer_id
)
ORDER BY alisveris_sayisi DESC;