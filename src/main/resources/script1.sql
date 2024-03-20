SELECT product_name
FROM netology.orders
         JOIN netology.customers ON customer_id = id
WHERE LOWER(customers.name) = ':name';