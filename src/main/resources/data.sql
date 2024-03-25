insert into netology_dao.customers (name, surname, age, phone_number)
values('Bob', 'Petrov', 30, '8-922-444-67-56'),
      ('Pop', 'Bobrov', 20, '8-922-333-67-56'),
      ('Oly', 'Petrova', 19, '8-922-222-67-56'),
      ('Any', 'Sidorova', 25, '8-922-111-67-56');

insert into netology_dao.orders  (order_date, product_name, customer_id, amount)
values('2024-01-03', 'Tv', 1,  25000),
      ('2024-01-25', 'DVD', 2,  30000),
      ('2024-02-19', 'DVD-R', 4,  15000),
      ('2024-03-23', 'Tv-U', 4, 40000);
