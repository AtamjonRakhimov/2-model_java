select p.product_id,
coalesce(round(cast(sum(price * units ) as decimal)/sum(units),2),0)as average_price 
from prices p 
left join unitssold as u
	on p.product_id = u.product_id
    and purchase_date between start_date and end_date
group by p.product_id