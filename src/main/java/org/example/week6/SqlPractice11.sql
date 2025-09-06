
--Let's sort all the data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
ORDER BY first_name


SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name


--Let's sort the intersecting data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name


SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
ORDER BY first_name


--Let's sort the data in the first_name columns in the actor and customer tables that are in the first table but not in the second table.
--First_name in Actor but not in Customer (repeated)
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
ORDER BY first_name;

--First_name (without duplicates) in Actor but not in Customer
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
ORDER BY first_name;

--First_name in Customer but not in Actor (repeated)
SELECT first_name FROM customer
EXCEPT ALL
SELECT first_name FROM actor
ORDER BY first_name;

--First_name in Customer but not in Actor (without duplicates)
SELECT first_name FROM customer
EXCEPT
SELECT first_name FROM actor
ORDER BY first_name;