--List the country names in the country column in the country table that start with the character 'A' and end with the character 'a'.
SELECT country FROM country
WHERE country LIKE 'A%a';

--List the country names in the country column in the country table that are at least 6 characters long and end with the character 'n'.
SELECT country FROM country
WHERE LENGTH (country) >= 6 AND country LIKE '%n';

--List the movie titles in the title column of the movie table that contain at least 4 'T' characters, regardless of whether they are uppercase or lowercase.
SELECT title FROM film
WHERE LENGTH(LOWER(title)) - LENGTH(REPLACE(LOWER(title), 't', '')) >= 4;

--From the data in all columns in the movie table, sort the data whose title starts with the 'C' character, whose length is greater than 90, and whose rental_rate is 2.99.
SELECT * FROM film
WHERE LENGTH > 90 AND title LIKE 'C%' AND rental_rate = 2.99;