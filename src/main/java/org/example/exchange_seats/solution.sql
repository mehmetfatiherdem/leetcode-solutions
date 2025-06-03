-- Write your PostgreSQL query statement below
select s.id, (case when s.id % 2 = 0 then (select se.student from Seat se where se.id = s.id-1) else coalesce((select se.student from Seat se where se.id = s.id+1), s.student) end) as student
from Seat s
order by id