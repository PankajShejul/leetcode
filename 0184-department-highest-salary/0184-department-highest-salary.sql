# Write your MySQL query statement below
Select d.name as Department,
 e.name as Employee, 
 e.Salary 
 from Department d inner join Employee e on d.id=e.departmentId 
where (e.departmentId,e.salary) in (select departmentId,max(salary)
from Employee
group by departmentId);