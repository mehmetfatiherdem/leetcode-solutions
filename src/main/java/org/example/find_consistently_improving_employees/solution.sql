-- Write your PostgreSQL query statement below
select employee_id, name, ratings[1] - ratings[3] as improvement_score
from employees join
     (
         select employee_id, ARRAY_AGG(rating order by review_date desc) as ratings
         from performance_reviews
         group by employee_id
         having count(*) >= 3
     ) using(employee_id)
where ratings[1] > ratings[2] and ratings[2] > ratings[3]
order by improvement_score desc, name asc