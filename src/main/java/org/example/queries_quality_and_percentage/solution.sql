-- Write your PostgreSQL query statement below
select q.query_name,
       round(sum(q.rating/q.position::numeric)/count(*)::numeric, 2) as quality,
       round(sum(case when q.rating<3 then 1 else 0 end)*100.0/count(*), 2) as poor_query_percentage
from Queries q
group by q.query_name