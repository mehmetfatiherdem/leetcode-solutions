-- Write your PostgreSQL query statement below
select user_id, (UPPER(SUBSTRING(name, 1, 1)) || LOWER(SUBSTRING(name, 2, LENGTH(name)-1))) as name
from Users
order by user_id