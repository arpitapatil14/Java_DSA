# Write your MySQL query statement below
SELECT e.name,eu.unique_id
FROM Employees e
LEFT JOIN EmployeeUNI eu on e.id=eu.id
