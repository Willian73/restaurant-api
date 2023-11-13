CREATE TABLE products (
id INTEGER NOT NULL auto_increment PRIMARY KEY,
name VARCHAR(255),
detail VARCHAR(255),
price DECIMAL(19,2),
category_id INTEGER NOT NULL,


FOREIGN KEY (category_id) REFERENCES categories(id)
);