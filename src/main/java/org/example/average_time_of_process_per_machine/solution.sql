-- Write your PostgreSQL query statement below
select a.machine_id, round(cast(avg(e.timestamp-a.timestamp) as numeric), 3) as processing_time
from Activity a
inner join (select machine_id, timestamp from Activity where activity_type = 'end') e
on a.machine_id = e.machine_id
where a.activity_type = 'start'
group by a.machine_id