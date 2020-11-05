select SUM(purchase_amount) AS "Total" from orders;
select avg(purchase_amount) AS "AVERAGE" from orders;
select MAX(purchase_amount) AS "Max value" from orders; 
select MIN(purchase_amount) AS "Min value" from orders;
select COUNT(distinct salesman_id) AS "Count" from orders;