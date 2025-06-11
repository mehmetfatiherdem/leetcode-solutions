-- Write your PostgreSQL query statement below
delete from Person p using Person pe
where p.email = pe.email and p.id > pe.id