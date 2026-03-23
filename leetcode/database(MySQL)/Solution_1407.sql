select u.name, coalesce(sum(r.distance),0) travelled_distance 
from users u
left join rides r 
	on u.id=r.user_id
group by u.name, r.user_id
order by sum(r.distance) desc, u.name 
