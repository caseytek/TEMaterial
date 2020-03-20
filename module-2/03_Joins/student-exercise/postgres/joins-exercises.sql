-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT f.title as movies_with_nick_stallone
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT f.title as movies_with_rita_reynolds
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.last_name = 'REYNOLDS';


-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT f.title as movies_with_judy_dean_or_river_dean
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT f.title as documentary_films
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id 
WHERE c.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT f.title as comedy_films
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id 
WHERE c.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT f.title as g_chilren_films
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id 
WHERE c.name = 'Children' AND f.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT f.title as family_films
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id 
WHERE c.name = 'Family' AND f.rating = 'G' AND f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)\

SELECT f.title
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.last_name = 'LEIGH' AND f.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT f.title as sci_fi_films_2006
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id 
WHERE c.name = 'Sci-Fi' AND f.release_year = 2006;


-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT f.title as action_movies_with_nick_stallone
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON a.actor_id = fa.actor_id
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE a.last_name = 'STALLONE' AND c.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT a.address as store_address, ci.city, a.district, co.country
FROM address a
JOIN city ci ON a.city_id = ci.city_id
JOIN country co ON ci.country_id = co.country_id
WHERE a.address_id = 1 OR a.address_id = 2;


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT sto.store_id, a.address as store_address, sta.first_name, sta.last_name 
FROM address a
JOIN store sto ON a.address_id = sto.address_id
JOIN staff sta ON sto.manager_staff_id = sta.staff_id
WHERE a.address_id = 1 OR a.address_id = 2;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)
SELECT cu.first_name, cu.last_name, COUNT(r.customer_ID) as number_of_rentals
FROM customer cu
JOIN rental r ON cu.customer_id = r.customer_id
GROUP BY cu.first_name, cu.last_name
ORDER BY number_of_rentals DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)
SELECT cu.first_name, cu.last_name, SUM(p.amount) as dollars_spent
FROM customer cu
JOIN payment p ON cu.customer_id = p.customer_id
GROUP BY cu.first_name, cu.last_name
ORDER BY dollars_spent DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT sto.store_id, a.address, COUNT(r.inventory_id), SUM(p.amount), cast(AVG(p.amount)as numeric(10,2))
FROM payment p
JOIN rental r ON p.rental_id = r.rental_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN store sto ON i.store_id = sto.store_id
JOIN address a ON sto.address_id = a.address_id
GROUP BY sto.store_id, a.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)
SELECT f.title, count(r.rental_id) as number_of_rentals
FROM film f
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r On i.inventory_id = r.inventory_id
GROUP BY f.title
ORDER BY number_of_rentals DESC
LIMIT 10;

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)
SELECT c.name, count(r.rental_id) as number_of_rentals
FROM category c
JOIN film_category fc ON c.category_id = fc.category_id
JOIN film f ON fc.film_id = f.film_id 
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r On i.inventory_id = r.inventory_id
GROUP BY c.name
ORDER BY number_of_rentals DESC
LIMIT 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT f.title, count(r.rental_id) as number_of_rentals
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r On i.inventory_id = r.inventory_id
WHERE c.name = 'Action'
GROUP BY f.title
ORDER BY number_of_rentals DESC
LIMIT 5;


-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)
SELECT a.first_name, a.last_name, COUNT(r.rental_id) as number_of_rentals
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN film f ON fa.film_id = f.film_id
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id 
GROUP BY a.first_name, a.last_name, a.actor_id
ORDER BY number_of_rentals DESC
LIMIT 10;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT a.first_name, a.last_name, COUNT(r.rental_id) as number_of_rentals
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN film f ON fa.film_id = f.film_id
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
WHERE c.name = 'Comedy' 
GROUP BY a.first_name, a.last_name, a.actor_id
ORDER BY number_of_rentals DESC
LIMIT 5;
