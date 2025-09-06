
--List the 5 longest movies in the movie table whose title ends with the character 'n'.
SELECT title,length FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;

--List the 5 shortest (length) movies (6,7,8,9,10) in the movie table whose title ends with the character 'n'.
SELECT title, length FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
LIMIT 5 OFFSET 5;

--In the sorting based on the surname column in the customer table, sort the first 4 data with store_id being 1.
SELECT first_name, last_name, store_id FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;