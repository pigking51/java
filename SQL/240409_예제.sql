/* 1번문제
고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼의
이름은 고객회사명2, 전화번호 2로 만드시오
고객회사명2의 조건 : 기존 고객회사명의 앞 2자리를 *로 변환
전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환 */

select concat('**',(substr(고객회사명, 3)))  as 고객회사명2,
	replace(replace(전화번호, ')', '-'), '(', ' ') as 전화번호2 from 고객;  

/* 2번문제
	주문세부 테이블에서 아래 3개의 컬럼을 조건대로 만드시오
	소수점아래 자리는 1자리에서 버림 (truncate)
	주문금액 : 주문수량 * 단가
	할인금액 : 주문수량 * 단가 * 할인율
	실주문금액 : 주문금액 - 할인금액 */
select 주문수량 * 단가 as 주문금액,
	   truncate((주문수량 * 단가 * 할인율),1) as 할인금액, 
       truncate((주문수량 * 단가 - 주문수량 * 단가 * 할인율),1) as 실주문금액
	from 주문세부;

/* 3번문제 
 * 사원테이블에서 전체사원의 이름, 생일, 만나이(as 만나이), 입사일, 입사일수(as 입사일수),
 * 입사한지 500일 후(as 입사500일 후)의 날짜를 만드시오*/
select 이름, 생일, timestampdiff(day, 생일, now()) as 만나이,
	입사일, timestampdiff(year,입사일, now()) as 입사일수, 
	adddate(입사일, 500) as 입사500일후
	from 사원; 

-- 4번문제
select * from 주문
	where adddate(요청일, 7)  <= 발송일;

-- 5번문제
select 담당자명, 고객회사명, 도시, substr(replace(replace(도시, '특별시', '대도시'),'광역시', '대도시'), 3) as 도시구분,
마일리지, if(마일리지 >= 100000, 'vvip', (if(마일리지 >= 10000, 'vip', '일반고객'))) as 마일리지구분 from 고객;

select 담당자명, 고객회사명, 도시,
case when 도시 like '%특별시%' then '대도시'
	when 도시 like '%광역시%' then '대도시'
	else '일반도시'
	end
as 도시구분,
마일리지,
case when 마일리지 >= 100000 then 'vvip'
	when 마일리지 >= 10000 then 'vip'
	else '일반고객'
	end as 마일리지구분
from 고객;

-- 6번문제
select 주문번호, 고객번호, 주문일, year(주문일) as 주문년도, quarter(주문일) as 주문분기, 
month(주문일) as 주문월, day(주문일) as 주문일,  
dayname(주문일) as 주문요일, 
case when cast(dayofweek(주문일) as unsigned) = '1' then '일'
	when cast(dayofweek(주문일) as unsigned) = '2' then '월'
	when cast(dayofweek(주문일) as unsigned) = '3' then '화'
	when cast(dayofweek(주문일) as unsigned) = '4' then '수'
	when cast(dayofweek(주문일) as unsigned) = '5' then '목'
	when cast(dayofweek(주문일) as unsigned) = '6' then '금'
	when cast(dayofweek(주문일) as unsigned) = '7' then '토'
	end
as 한글요일 from 주문;




	