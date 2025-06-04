-- Write your PostgreSQL query statement below
with UserRatings as (select (u.name) as results
                     from (select mr.user_id, count(mr.user_id) as nums from MovieRating mr group by mr.user_id) mri
                              inner join Users u
                                         on mri.user_id = u.user_id
                     order by mri.nums desc, u.name asc
    limit 1),

    TopRatedMovies as (select (m.title) as results
from (select mr.movie_id, avg(mr.rating) as rateavg from MovieRating mr where mr.created_at >= '2020-02-01' and mr.created_at <= '2020-02-29' group by mr.movie_id) mri
    inner join Movies m
on mri.movie_id = m.movie_id
order by rateavg desc, m.title asc
    limit 1)

SELECT results FROM UserRatings
UNION ALL
SELECT results FROM TopRatedMovies