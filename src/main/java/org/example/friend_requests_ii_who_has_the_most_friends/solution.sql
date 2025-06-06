-- Write your PostgreSQL query statement below
with re_ac as (
    select requester_id as id
    from RequestAccepted
    union all
    select accepter_id as id
    from RequestAccepted
)
select id, count(*) as num
from re_ac
group by id
order by num desc
    limit 1
