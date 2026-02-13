CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET n=n-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT n,1
  );
END