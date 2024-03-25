create schema if not exists netology_dao;

create table netology_dao.customers
(
id bigserial primary key not null,
name varchar(50) not null,
surname varchar(100) not null,
age int check(age > 0 and age < 150) not null,
phone_number varchar(30)
);

create table netology_dao.orders
(
order_id bigserial primary key not null,
order_date date not null,
product_name varchar(255) not null,
amount int check(amount > 0 ) not null,
customer_id integer NOT NULL,
FOREIGN KEY (customer_id) references netology_dao.customers (id)
);

