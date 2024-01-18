select playerId, min(eventDate) as firstLogin
from Activity
group by playerId


select id
from customers
where id not in (select customerId
from Orders);

select *
from cinema
where mod(id,2) = 1 and description != 'boring'
order by rating DESC;



select *
from movies
where mod(id,2)=1 and DESCRIPTION !='boring'
order by rating desc


select GETDATE();

select name
from employee
where id in ( select managerId
from employee
group by managerID
having count(distinct id)>=5);

select *
from employee
group by id
having count(id)>1;


select UPPER(fname) as employeename
from employee

select *
into sampleTable
from employee
where 1 = 0;


select *
from employee
where fname like 'S%';

select e.fname, e.lname
from employee e inner JOIN salary s on e.id=s.id and e.position='manager'


select e1.name as employee , e1.salary
from employee e1
where 3 > (select count(distinct(e2.salary))
from employee e2
where e2.salary > e1.salary)



select e1.name, e1.salary
from employee e1 join department d on e1.departmentID = d.id
where 3 > (select count(distinct(e2.salary))
from employee e2
where e2.salary > e1.salary)


select *
into newtable
from oldtable
where 1 = 0;


select *
from employee e inner join salary s on e.id = p.id and e.position = 'Manager'


select department, count(id) as empCnt
from employee
group by department
order by empCnt;




select *
from employee e
where exists (select *
from employeePos p
where e.empId = p.id);

select distinct salary
from empPosition  e1
where 2 >= (Select count(DISTINCT salary)
from employeePos e2
where e1.salary >= e2.salary)
order by e1.salary desc;

select distinct salary
from emppos e1
where 2 >= (select count(DISTINCT salary)
from emppos e2
where e1.salary <= e2.salary)
ORDER by e1.salary desc;




select *
from employee
where empId <= (select count(empid)/2
from employee)

select *
from employee
where id <= (select count(empId)/2
from employee);


select empPosition, sum(salary)
from employee
group by employeePos;

SELECT department, sum(empId) as numOfEmployee
from employee
group by department
having numOfEmployee < 2;

select *
from employee
where empId = (select min(empId)
FROM employee);


select *
from employee
where empId = (select max(empId)
FROM employee);

select top 1
    salary
from ( select top 3
        salary
    from employee
    order by salary desc) as emp
ORDER by salary asc;



CREATE TABLE Students
(
    Name VARCHAR(255),
    Age int,
    id int PRIMARY key,
);

insert into students
    (Name,Age,id)
values
    ('Sarah', 23, 1),
    ('Saad', 1, 2)



Select top 3
    *
from employee
order by id desc;

select e1.salary
from employee e1
where 2 = (select count(distinct e2.salary)
from employee e2
where e1.salary > e2.salary);

select top 2
    salary
from employee
order by salary desc;