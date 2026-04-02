select machine_id, round(avg(end.timestamp- start.timestamp ),3) processing_time 
from activity start join activity end using(machine_id)
where start.activity_type like 'start' and end.activity_type like 'end'
group by machine_id
