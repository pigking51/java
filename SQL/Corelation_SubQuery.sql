-- 상관 서브쿼리 (corelated SubQuery)
-- 이전꺼까지는 비상관 서브쿼리라고 부름
/* main쿼리와 서브쿼리간의 상관관계를 포함하는 형태의 쿼리,
상관서브쿼리는 메인쿼리와 한 행씩 처리함 
그렇기때문에 실행속도가 늦어질 가능성이 있음
(기왕이면 안쓰는게 좋음, 대신 직관적으로 보인다는 장점이 있음)*/
-- 사원의 이름과 상사의 정보를 함께 표현
select 사원번호,
	이름,
	상사번호,
	(select 이름 from 사원 as 상사
		where 상사.사원번호 = 사원.상사번호) as 상사이름
from 사원;

-- 특정 주문일 범위안에서 각 주문번호당 총 판매금액
select 주문번호, 주문일,
	(select sum(주문세부.주문수량 * 주문세부.단가) from 주문세부
		 where 주문세부.주문번호 = 주문.주문번호) as 총판매금액
from 주문
where 주문일 between '2022-01-01' and '2022-12-31';

-- 위의 상관쿼리를 비상관쿼리로 변경한 것
select 주문.주문번호, 주문일,
	sum(주문세부.주문수량 * 주문세부.단가) as 총판매금액
from 주문
left join 주문세부
on 주문세부.주문번호 = 주문.주문번호
where 주문일 between '2022-01-01' and '2022-12-31'
group by 주문.주문번호, 주문.주문일;

-- '배재용'사원의 부서명
-- 비상관쿼리
select 부서명
from 부서
where 부서번호 = (select 부서번호 from 사원
				where 이름 = '배재용');
-- 상관쿼리
select (select 부서명 from 부서
			where 부서.부서번호 = 사원.부서번호) as 부서명
from 사원
where 이름 = '배재용';

-- 담당자명, 고객회사명, 주문건수(count), 최초주문일(min), 최종주문일(max)
-- 서브쿼리 이용해서 표현하시오
-- 내가한거 → null값 존재함 
select 담당자명,
	고객회사명,
	(select count(*) from 주문
		where 주문.고객번호 = 고객.고객번호) as 주문건수,
	(select min(주문일) from 주문
		where 주문.고객번호 = 고객.고객번호) as 최초주문일,
	(select max(주문일) from 주문
		where 주문.고객번호 = 고객.고객번호) as 최종주문일
from 고객
group by 고객번호;

-- inner join 이용
select 담당자명,
	고객회사명,
	주문건수,
	최초주문일,
	최종주문일
from 고객
inner join (select 고객번호,
			count(*) as 주문건수,
			min(주문일) as 최초주문일,
			max(주문일) as 최종주문일
		from 주문
		group by 고객번호) as 주문요약
on 주문요약.고객번호 = 고객.고객번호;

-- join없이
select 담당자명,
	고객회사명,
	주문건수,
	최초주문일,
	최종주문일
from 고객, (select 고객번호,
			count(*) as 주문건수,
			min(주문일) as 최초주문일,
			max(주문일) as 최종주문일
		from 주문
		group by 고객번호) as 주문요약
where 주문요약.고객번호 = 고객.고객번호;