select SUM(purchase_amount) AS "Total" from orders;

select AVG(purchase_amount) AS "Average" from orders;

select MAX(purchase_amount) AS "Max value" from orders;

select MIN(purchase_amount) AS "Min value" from orders;

select COUNT(distinct salesman_id) AS "Count" from orders;