-- Write your PostgreSQL query statement below

select round(100. * count(case when DATE_TRUNC('day', da.order_date) = DATE_TRUNC('day', d.customer_pref_delivery_date) then 1 end) /
count(*), 2) as immediate_percentage
from Delivery d
inner join (select customer_id, min(order_date) as order_date from Delivery group by customer_id) da
on d.order_date = da.order_date and da.customer_id = d.customer_id