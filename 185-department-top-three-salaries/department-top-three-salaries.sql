# Write your MySQL query statement below
SELECT Department, Employee, Salary
FROM (
    Select d.name as Department, e.name AS Employee, e.salary AS Salary,
    DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) as rnk
    FROM Employee e LEFT JOIN department d on e.departmentId=d.id
    ) t
    WHERE rnk in(1,2,3);
    