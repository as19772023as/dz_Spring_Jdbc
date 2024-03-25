create table if not exists netology_liquibase.customers
 (
 id serial primary key not null,
 name varchar(50) not null,
 surname varchar(100) not null,
 age int check(age > 0 and age < 150) not null,
 phone_number varchar(30)
 );


 insert into netology_liquibase.customers (name, surname, age, phone_number)
 values('Bob', 'Petrov', 30, '8-922-444-67-56'),
       ('Pop', 'Bobrov', 20, '8-922-333-67-56'),
       ('Oly', 'Petrova', 19, '8-922-222-67-56'),
       ('Any', 'Sidorova', 25, '8-922-111-67-56');














