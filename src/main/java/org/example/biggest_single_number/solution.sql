-- Write your PostgreSQL query statement below
with nums as (
    select num from MyNumbers
    group by num
    having count(*)>1
)
select max(m.num) as num
from MyNumbers m
where not exists (select 1 from nums nu where m.num = nu.num)