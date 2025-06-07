-- Write your PostgreSQL query statement below
select round(sum(i.tiv_2016)::numeric, 2) as tiv_2016
from Insurance i
where tiv_2015 in (select tiv_2015 from Insurance where i.pid != pid)
  and (i.lat, i.lon) not in (select lat, lon from Insurance where i.pid != pid)