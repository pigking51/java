use testdb;

 -- 문제 1

select 이름, 부서번호 from 사원;

-- 문제 2

select 이름, 직위 from 사원
    where 직위 = '과장'
	order by 사원번호 desc;

-- 문제 3

select 고객회사명, 담당자명 from 고객
 where 고객번호 = 'CCOPI';

-- 문제 4

select 주문번호, 주문일 from 주문
 	where 주문일 > 2021-05-01
 	order by 주문일 desc;

-- 문제 5
 
 select 제품명, 재고 from 제품
 	where 재고 < 50
 	order by 재고;
 
 -- 문제 6
 
 select 이름, 성별 from 사원
 	where 성별 = '남';
 
 -- 문제 7
 
 select 고객회사명, 마일리지 from 고객
 	where 마일리지 >= 1000
 	order by 마일리지 desc;


