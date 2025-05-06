-- Write your PostgreSQL query statement below
select e.name as name
from Employee e
inner join Employee em
on e.id = em.managerId
group by e.id, e.name
having count(*)>=5