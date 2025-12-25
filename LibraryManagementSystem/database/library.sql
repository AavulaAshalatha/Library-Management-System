CREATE DATABASE library_db;
USE library_db;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    quantity INT
);

INSERT INTO books (title, author, quantity)
VALUES ('Java Basics', 'James Gosling', 5);
