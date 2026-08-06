-- Write your query below
Select C.name
From Customers C
LEFT JOIN Orders O
ON C.id=O.customer_id
Where O.customer_id IS NULL;