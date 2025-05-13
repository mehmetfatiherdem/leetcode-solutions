select TO_CHAR(DATE_TRUNC('month', trans_date), 'YYYY-MM') as month, t.country, count(t.id) as trans_count, count(case when t.state = 'approved' then 1 end) as approved_count, sum(t.amount) as trans_total_amount, sum(case when t.state = 'approved' then t.amount else 0 end) as approved_total_amount
from Transactions t
group by DATE_TRUNC('month', trans_date), t.country

