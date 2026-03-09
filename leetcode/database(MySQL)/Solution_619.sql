select  
case
when count(num) =1 then num
when count(num) >1 then null
end as num
from mynumbers
group by num
having count(num) =1 ||  count(num) >1
order by num desc
limit 1 





-- select *
-- from mynumbers