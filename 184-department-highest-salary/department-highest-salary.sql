# Write your MySQL query statement below
SELECT d.name AS Department,
e.name AS Employee,
 e.salary AS Salary FROM Employee e
LEFT JOIN Department d
on e.departmentId=d.id
WHERE e.salary=(SELECT max(Salary) FROM employee where departmentID=e.departmentID);