-- Write your PostgreSQL query statement below
select project_id, round(sum(experience_years)::numeric/count(e.employee_id), 2) as average_years
from Project p
inner join Employee e
on p.employee_id = e.employee_id
group by project_id