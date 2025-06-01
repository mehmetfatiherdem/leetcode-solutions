-- Write your PostgreSQL query statement below
Select T.i AS category, COALESCE(accounts_count, 0) AS accounts_count
FROM (VALUES ('Low Salary'),('Average Salary'),('High Salary')) AS T(i)
         LEFT JOIN (
    Select (CASE WHEN income < 20000 THEN 'Low Salary'
                 WHEN income > 50000 THEN 'High Salary'
                 ELSE 'Average Salary' END) AS category,
           count(*) AS accounts_count
    FROM Accounts
    GROUP BY 1
) A
                   ON T.i = A.category;