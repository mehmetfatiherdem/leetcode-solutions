-- Write your PostgreSQL query statement below
select p.product_id, p.new_price as price
from Products p
         inner join (
    select product_id, max(change_date) as cd
    from Products
    where change_date <= '2019-08-16'
    group by product_id
) pr
                    on p.product_id = pr.product_id and p.change_date = pr.cd
union
select p.product_id, 10 as price
from Products p
group by p.product_id, price
having min(p.change_date) > '2019-08-16'