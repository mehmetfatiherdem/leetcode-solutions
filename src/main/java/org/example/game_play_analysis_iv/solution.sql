-- Write your PostgreSQL query statement below
select round(1.00 * (select count(*) from Activity ac where ac.event_date = (select min(act.event_date) + INTERVAL '1 day' from Activity act where act.player_id = ac.player_id)) / count(distinct player_id), 2) as fraction
from Activity a