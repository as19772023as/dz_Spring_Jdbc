create table if not exists netology_liquibase.orders
(
order_id bigserial primary key not null,
order_date date not null,
product_name varchar(255) not null,
amount int check(amount > 0 ) not null,
customer_id integer NOT NULL,
FOREIGN KEY (customer_id) references netology_liquibase.customers (id)
);

insert into netology_liquibase.orders  (order_date, product_name, customer_id, amount)
values('2024-01-03', 'Tv',  1,  25000),
      ('2024-01-25', 'DVD',  2, 30000),
      ('2024-02-19', 'DVD-R', 3,  15000),
      ('2024-03-23', 'Tv-U', 4,  40000);