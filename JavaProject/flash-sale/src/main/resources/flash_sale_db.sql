CREATE DATABASE flash_sale_db;
USE flash_sale_db;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,   -- 用户 ID
    name VARCHAR(50) NOT NULL,           -- 用户名
    balance DOUBLE NOT NULL,             -- 用户余额
    user_type INT DEFAULT 0              -- 用户类型（0=普通用户, 1=VIP, 2=SVIP）
);

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,   -- 商品 ID
    name VARCHAR(100) NOT NULL,          -- 商品名称
    price DOUBLE NOT NULL,               -- 商品价格
    stock INT NOT NULL                   -- 商品库存
);

-----------------------------------------------------------------------------------------
-- 插入测试用户
INSERT INTO users (name, balance, user_type) VALUES ('Alice', 1000.0, 1);
INSERT INTO users (name, balance, user_type) VALUES ('xiaoming', 1000.0, 1);
INSERT INTO users (name, balance, user_type) VALUES ('xiaobai', 8000.0, 1);
INSERT INTO users (name, balance, user_type) VALUES ('wan', 5000.0, 0);
INSERT INTO users (name, balance, user_type) VALUES ('John', 500.0, 0);
INSERT INTO users (name, balance, user_type) VALUES 
('Mike', 20000.0, 2),
('Trump', 30000.0, 2),
('Jobs', 50000.0, 2);


-- 插入测试商品
INSERT INTO products (id, name, price, stock) VALUES (1, 'iPhone', 200.0, 10);
INSERT INTO products (id, name, price, stock) VALUES (2, 'MacBook Pro', 1000.0, 100);
INSERT INTO products (id, name, price, stock) VALUES (3, 'Apple Watch', 50.0, 1000);
INSERT INTO products (id, name, price, stock) VALUES (4, 'iPad', 100.0, 1000);


-----------------------------------------------------------------------------------------
SELECT * FROM users WHERE id = 1;
SELECT * FROM products WHERE id = 1;
SELECT id, name, user_type FROM users;



