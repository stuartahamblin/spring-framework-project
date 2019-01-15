SHOW DATABASES;

USE blog_db;

SELECT * from mysql.user;

show tables;

CREATE DATABASE blog_db;

CREATE USER 'post_user'@'localhost' IDENTIFIED BY 'Codeup12!';

GRANT ALL ON blog_db.* TO 'post_user'@'localhost';

show tables;

INSERT INTO users (email, password, username)
VALUES ('blogger@email.com', 'bloggerpass', 'blogger1');

SELECT * FROM post;

DELETE FROM post WHERE id = 1;
