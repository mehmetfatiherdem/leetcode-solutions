-- Write your PostgreSQL query statement below
select max(salary) as SecondHighestSalary
from Employee
where salary < (
    select max(salary) as salary
    from Employee
)