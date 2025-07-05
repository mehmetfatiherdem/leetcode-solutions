select distinct
    student_id,
    subject,
    first_score,
    latest_score
from (
         select
             student_id,
             subject,
             first_value(score) over(partition by (student_id,subject) order by exam_date desc) latest_score,
             first_value(score) over(partition by (student_id,subject) order by exam_date) first_score
         from Scores
     ) sub
where sub.latest_score > sub.first_score
order by student_id,subject