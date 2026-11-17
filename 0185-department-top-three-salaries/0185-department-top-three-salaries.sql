# Write your MySQL query statement below
With new_table AS(Select d.name as Department, e.name as Employee, e.salary as Salary, 
DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) as ranking
from Employee e Left join Department d on e.departmentId = d.id)

Select Department, Employee, Salary from new_table where ranking <=3;