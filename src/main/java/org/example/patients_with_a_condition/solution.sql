-- Write your PostgreSQL query statement below
select patient_id, patient_name, conditions
from Patients
where conditions ilike '% DIAB1%' or conditions ilike '%DIAB1%' and not conditions ilike '%_DIAB1%'