# Write your MySQL query statement below
Select email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;#count of row>1
