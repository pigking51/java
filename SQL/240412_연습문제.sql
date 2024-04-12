/* 1. 제품테이블에 있는 제품 중 단가가 가장 높은 제품명 */
select 제품명, 단가
from 제품
where 단가 = (select max(단가) from 제품);

/* 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합 */
select 제품명,
	단가,
	주문수량합
from 제품
inner join (select 제품번호, sum(주문수량) as 주문수량합 from 주문세부
			group by 제품번호) as 주문수
on 주문수.제품번호 = 제품.제품번호
group by 1
having 제품.단가 = (select max(단가) from 제품);
-- ↓ 생각나는대로 만들었는데 주문합이 다름(추후 수정할 예정)
select 제품명,
	제품.단가,
	주문수량합
from 제품, (select 제품번호, 단가, sum(주문수량) as 주문수량합 from 주문세부
			group by 단가) as 주문수
where 주문수.제품번호 = 제품.제품번호 
group by 제품명
having 제품.단가 = (select max(단가) from 제품);

select 제품명,
	제품.단가,
	sum(주문수량) as 주문수량합
from 제품
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호
group by 제품명
having 제품.단가 = (select max(단가) from 제품);

-- 서브쿼리 안에 서브쿼리를 넣는것 가능함(대신 성능이 떨어짐)
select sum(주문수량) as 주문수량합 from 주문세부
where 제품번호 = (select 제품번호 from 제품
				where 단가 = (select max(단가) from 제품));



/* 3. '아이스크림'제품의 주문수량합 */
select 제품명,
	주문수량합
from 제품, (select 제품번호, sum(주문수량) as 주문수량합 from 주문세부) as 주문상세
where 제품.제품명 like '%아이스크림%'
group by 제품명;

select 제품명
 ,sum(주문수량) as 주문수량합
 from 제품
 inner join 주문세부
 on 제품.제품번호 = 주문세부.제품번호
 group by 제품명
having 제품명 like '%아이스크림%';

/* 4. '서울특별시'고객들에 대한 주문년도별 주문건수 */
select cast(year(주문일) as char) as 주문년도,
	 count(주문.고객번호) as 주문건수
from 주문
inner join 고객
on 주문.고객번호  = 고객.고객번호
where 도시 = '서울특별시'
group by 주문년도;


select year(주문일) as 주문년도,
	 count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객
					where 도시 = '서울특별시')
group by 주문년도;

