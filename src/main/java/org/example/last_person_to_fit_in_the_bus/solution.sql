# Write your MySQL query statement below
with sortedL as (
    select person_name, turn, sum(weight) over (order by turn) as tw
    from Queue
    order by tw desc
)

select person_name
from sortedL
where tw <= 1000
    limit 1

