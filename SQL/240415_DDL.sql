-- DDL(데이터 정의어)
-- create, alter, drop, truncate

/* 문자형 데이터타입
char 고정길이 255
var 가변길이 65535 - 소설책 분량으로 20페이지정도 나온다고 함
tinytext 255
text 655355
mediumtext 16,777,215
longtext 4,294,967,295
json 1기가(1GB) */

/* 숫자형 데이터타입
tinyint 1byte
smallint 2byte
mediumint 3byte
int 4byte -> 중요
bigint 8byte -> 중요
→ 거의 int, bigint만 쓴다고 함

float 4byte (소숫점 아래 7자리)
double 8byte (소숫점 아래 15자리)
decimal(전체자릿수, 소수점자릿수) */

/* 날짜시간형 데이터타입 -> 다 중요
date YYYY-MM-DD
time HH:MI:SS
datetime YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS
*/

/* 이진형(binary) 데이터타입 : 이미지, 오디오, 비디오 등
tinyblob 255byte
blob 655355 byte (blob = binary large object) -> 중요
medium blob 16,777,215byte
long blob 4,294,967,295byte
*/

-- create 데이터베이스 생성
create database project1
	char set utf8mb4 collate utf8mb4_general_ci;
	
-- 테이블 이름은 괜찮지만 내용에 한글넣으면 오류뜸(이유는 잘 모르겠음)
-- 처음 db만들때 기본설정이 latin으로 되어있는데 이때 이걸 utf8mb4로 바꿔주고 해야 문제해결됨
-- 나중에 강제적용해도 안되니까 주의할 것!!!

use project1;
-- 테이블 생성

create table 학과
(학과번호 char(2),
학과명 varchar(20),
학과장명 varchar(20));

insert into 학과
values('AA', '컴퓨터공학과', '배경민'),
		('BB','소프트웨어학과', '김남준'),
		('CC','디자인융합과', '박선영');

create table 학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

insert into 학생
values('S0001', '이윤주', '2020-01-30', '01033334444', 'AA'),
	('S0002', '이승은', '2021-02-23', null, 'AA'),
	('S0003', '백재용', '2018-03-31', '01077778888', 'DD');


-- alter 테이블명이나 컬럼명, 데이터타입을 변경하거나 컬럼 추가, 삭제
-- 컬럼추가
alter table 학생 add 성별 char(1);

-- 컬럼 데이터타입 변경
alter table 학생 modify column 성별 varchar(2);

-- 컬럼명 변경
alter table 학생 change column 연락처 핸드폰전화번호 varchar(20);

-- 컬럼 삭제
alter table 학생 drop column 성별;

-- 테이블명 변경
alter table 학생 rename 재학생;

-- 3. drop 데이터베이스 또는 테이블 삭제
create database temp;
drop database temp;

create table 휴학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

drop table 휴학생;

