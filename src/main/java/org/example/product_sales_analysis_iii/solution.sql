-- Write your PostgreSQL query statement below
select s.product_id, (s.year) as first_year, s.quantity, s.price
from Sales s
         inner join (select product_id, min(year) as year from Sales group by product_id) sa
                    on s.product_id = sa.product_id and s.year = sa.year