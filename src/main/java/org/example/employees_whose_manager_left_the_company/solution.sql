-- Write your PostgreSQL query statement below
select e.employee_id
from Employees e
where e.salary < 30000 and e.manager_id is not null and
    not exists (select 1 from Employees em where e.manager_id = em.employee_id)
order by e.employee_id