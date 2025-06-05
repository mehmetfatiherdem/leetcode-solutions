-- Write your MySQL query statement below
with xp_days as (
    select distinct visited_on
    from Customer
    order by visited_on asc
    offset 6
)

select (c1.visited_on), sum(c2.amount) as amount, round(sum(c2.amount)/7., 2) as average_amount
from xp_days c1
         inner join Customer c2
                    on c2.visited_on between c1.visited_on - 6 and c1.visited_on
group by c1.visited_on
