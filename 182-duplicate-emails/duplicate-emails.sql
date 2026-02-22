# Write your MySQL query statement below
Select email FROM Person 
Group BY email Having count(email)>1;