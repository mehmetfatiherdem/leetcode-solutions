-- Write your PostgreSQL query statement below
with wi_cte as (
    select p.category, s.price, sum(quantity) as total_quantity
    from sales s
             inner join products p
                        on s.product_id = p.product_id
    where extract(MONTH from sale_date) in (12, 1, 2)
    group by p.category, s.price
), si_cte as (
    select p.category, s.price, sum(quantity) as total_quantity
    from sales s
             inner join products p
                        on s.product_id = p.product_id
    where extract(MONTH from sale_date) in (3, 4, 5)
    group by p.category, s.price
), su_cte as (
    select p.category, s.price, sum(quantity) as total_quantity
    from sales s
             inner join products p
                        on s.product_id = p.product_id
    where extract(MONTH from sale_date) in (6, 7, 8)
    group by p.category, s.price
), fa_cte as (
    select p.category, s.price, sum(quantity) as total_quantity
    from sales s
             inner join products p
                        on s.product_id = p.product_id
    where extract(MONTH from sale_date) in (9, 10, 11)
    group by p.category, s.price
)


    (select 'Fall' as season, category, sum(total_quantity) as total_quantity, sum(total_quantity*price) as total_revenue
     from fa_cte
     group by season, category
     order by total_quantity desc, total_revenue desc
         limit 1)

union

(select 'Spring' as season, category, sum(total_quantity) as total_quantity, sum(total_quantity*price) as total_revenue
 from si_cte
 group by season, category
 order by total_quantity desc, total_revenue desc
     limit 1)

union

(select 'Summer' as season, category, sum(total_quantity) as total_quantity, sum(total_quantity*price) as total_revenue
 from su_cte
 group by season, category
 order by total_quantity desc, total_revenue desc
     limit 1)

union

(select 'Winter' as season, category, sum(total_quantity) as total_quantity, sum(total_quantity*price) as total_revenue
 from wi_cte
 group by season, category
 order by total_quantity desc, total_revenue desc
     limit 1)


ORDER BY season;