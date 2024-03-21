create table netology.customers
(
id bigserial primary key not null,
name varchar(50) not null,
surname varchar(100) not null,
age int check(age > 0 and age < 150) not null,
phone_number varchar(30)
);

create table netology.orders
(
order_id bigserial primary key not null,
order_date date not null,
product_name varchar(255) not null,
amount int check(amount > 0 ) not null,
customer_id integer NOT NULL,
FOREIGN KEY (customer_id) references netology.customers (id)
);

insert into netology.customers (name, surname, age, phone_number)
values('Bob', 'Petrov', 30, '8-922-444-67-56'),
('Pop', 'Bobrov', 20, '8-922-333-67-56'),
('Oly', 'Petrova', 19, '8-922-222-67-56'),
('Any', 'Sidorova', 25, '8-922-111-67-56');

insert into netology.orders  (order_date, product_name, customer_id, amount)
values('2024-01-03', 'Tv', 6,  25000),
('2024-01-25', 'DVD', 5,  30000),
('2024-02-19', 'DVD-R', 1,  15000),
('2024-03-23', 'Tv-U', 5, 40000);