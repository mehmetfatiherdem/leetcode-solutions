-- Write your PostgreSQL query statement below
select p.product_id, coalesce(round(sum(p.price*us.units)::numeric/sum(units)::numeric, 2), 0) as average_price
from Prices p
left join UnitsSold us
on p.product_id = us.product_id
and us.purchase_date >= p.start_date
and us.purchase_date <= p.end_date
group by p.product_id