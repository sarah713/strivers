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