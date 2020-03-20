-- Display all the films and their language
SELECT f.title, l.name
FROM film f
JOIN language l ON l.language_id = f.language_id;

-- Display all the films and in English
SELECT f.title, l.name
FROM film f
JOIN language l ON l.language_id = f.language_id
WHERE l.name = 'English';

-- Display all the films with their category
SELECT f.title, c.name
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id;

-- Display all the films with a category of Horror
SELECT f.title, c.name
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Horror';

-- Display all the films with a category of Horror and title that begins with the letter F
SELECT f.title, c.name
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Horror' AND f.title LIKE 'F%';

-- Who acted in what together?
SELECT f.title, al.first_name || 

-- How many times have two actors appeared together?

-- What movies did the two most often acted together actors appear in together?
