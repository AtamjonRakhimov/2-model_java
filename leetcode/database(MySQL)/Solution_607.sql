with cte as 
(select s.name
from orders as o
left join salesperson as s
	on o.sales_id = s.sales_id
left join company as c
	on c.com_id = o.com_id
where c.name = 'RED'
)
select name 
from salesperson
where name not in (select * from cte)