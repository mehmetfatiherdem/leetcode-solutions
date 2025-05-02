-- Write your PostgreSQL query statement below
select w.id
from Weather w
inner join Weather we
on w.recordDate = we.recordDate+1
where w.temperature>we.temperature