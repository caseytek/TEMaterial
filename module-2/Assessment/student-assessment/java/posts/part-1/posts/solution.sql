-- Select every column from users where the user's role is manager
SELECT * FROM users WHERE role = 'manager';

-- Select name and created from posts where the post's body isn't null and the post was created in Aug. 2019
SELECT name, created FROM posts WHERE body IS NOT NULL AND created >= '2019-08-01' AND created <= '2019-08-31';

-- Select first_name and email from users, ordered by created, latest first

SELECT first_name, email FROM users ORDER BY created DESC;

-- Select published date from posts and a count of all the posts published/not published
SELECT created, published, count(published) as "Number of Posts" FROM posts GROUP BY created, published;

-- Select the user's first_name, last_name, and email and the name of the post for all posts created after Oct. 1st 2019
SELECT u.first_name, u.last_name, u.email, p.name FROM users u
JOIN posts p ON u.id = p.id
WHERE p.created > '2019-10-01';
