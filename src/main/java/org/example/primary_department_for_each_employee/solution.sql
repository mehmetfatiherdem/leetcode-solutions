-- Write your PostgreSQL query statement below
select employee_id, department_id
from Employee
where primary_flag = 'Y'
union
select e.employee_id, e.department_id
from Employee e
where not exists (select employee_id, department_id
                  from Employee
                  where primary_flag = 'Y' and e.employee_id = employee_id)