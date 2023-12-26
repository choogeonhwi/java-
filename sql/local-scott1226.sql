select name,substr(jumin,3,2)  "MON",an_key_dap
from member
where an_key_dap='Nicholas Cage';

select name, position,instr(position,'p') "p"
 , email
from professor
where email like '%.net';

select name,hpage
,substr(hpage,instr(hpage,'/')+2,instr(hpage,'.',1)-8) "www"
from professor
where hpage is not null;

select name,weight,jumin,replace(jumin,substr(jumin,7),'*******')  "sec"
from student
where weight<70;


select email
,decode(email
   ,'captain@abc.net'
   ,replace(email,substr(email,1,instr(email,'@')-1),'???????')
   ,'sweety@abc.net'
   ,replace(email,substr(email,1,instr(email,'@')-1),'??????')
   ,'pman@power.com'
   ,replace(email,substr(email,1,instr(email,'@')-1),'?????')
   ,'number1@naver.com'
   ,replace(email,substr(email,1,instr(email,'@')-1),'???????')
   ) "?"
, hpage
, decode(email
   ,'captain@abc.net'
   ,replace(hpage,substr(hpage,instr(hpage,'.',1,1)+1,3),'***')
   ,'sweety@abc.net'
   ,replace(hpage,substr(hpage,instr(hpage,'.',1,1)+1,3),'***')
   ,'pman@power.com'
   ,replace(hpage,substr(hpage,instr(hpage,'.',1,1)+1,5),'*****')
   ,'number1@naver.com'
   ,replace(hpage,substr(hpage,instr(hpage,'.',1,1)+1,5),'*****')
   ) "*"
from professor
where hpage is not null;


select empno,ename,comm
,case 
WHEN comm is null  THEN '해당사항없음'
WHEN comm = 0  THEN '수당없음'
WHEN comm > 0  THEN '수당 : '||comm
END "text"
from emp;

select name, height
,RANK() over(ORDER BY height desc) "R"
,dense_rank() over(ORDER BY height desc) "R"
,row_number() over(ORDER BY height desc) "R"
from student
where height>170;


select name, grade, weight
,RANK() over(partition by grade ORDER BY weight desc) "R"
from student
order by grade asc,weight desc;


select name,jumin, deptno1
,decode(substr(jumin,7,1),'1','M','F') "MF"
,weight
,sum(weight) OVER(partition by deptno1,substr(jumin,7,1) ORDER BY weight DEsc) "TOTAL"
from student;

select substr(email, instr(email, '@')+1) "d"
 ,count(email) "e"
 ,sum(count(email)) over() "s"
 ,count(email) / sum(count(email)) over() * 100 "%"
from professor
group by substr(email, instr(email, '@')+1)
order by substr(email, instr(email, '@')+1);

select name,tel
,to_char(pay,'999,999,999')
,to_char(sum(pay) over(partition by  substr(tel,1,instr(tel,')')-1)), '999,999,999') "t"
,to_char(pay/sum(pay) over(partition by  substr(tel,1,instr(tel,')')-1))*100, '999.99') "%"
from emp2
group by name, tel,pay;

select l_code "대출종목코드"
,l_store "대출지점"
,l_date "대출일자"
,l_qty "대출건수"
,l_total "대출액"
,sum(l_total) over(partition by l_store,l_code order by l_total desc) "누적"
from loan
order by l_code asc,l_store asc;


select l_date "대출일자"
,l_code "대출종목코드"
,l_qty "대출건수"
,l_total "대출액"
,sum(l_total) over(partition by l_code order by l_total asc) "누적"
from loan
where l_store=1000;


select deptno,name,pay,sum(pay) over()  "tp"
,round(pay/sum(pay) over()*100, 2) "%"
from professor
order by pay desc;

select deptno,name,pay,sum(pay) over(partition by deptno)  "tp"
,round(pay/sum(pay) over(partition by deptno)*100, 2) "%"
from professor
group by deptno, name, pay
order by 1;



create table dept4 
as
select dcode, dname from dept2;
select * from dept4;

CREATE TABLE 한글
(컬럼1 NUMBER
,컬럼2 varchar2(10)
,컬럼3 date);

INSERT INTO TT_02(NO) VALUES(1);
ROLLBACK;
COMMIT;
SELECT * FROM TT_02;

DROP TABLE TT_02;

create table TT_02
(NO NUMBER(3,1)DEFAULT 0
,NAME varchar2(10) DEFAULT 'NO NAME'
,HIREDATE DATE DEFAULT SYSDATE
);

create table new_emp
(no number(5)
,name varchar2(20)
,hiredate date
,bonus number(6,2)
);

INSERT INTO new_emp(5) VALUES(1);
ROLLBACK;
COMMIT;



select * from new_emp;
drop table new_emp;

create table new_emp2 
as
select empno,ename,hiredate from emp;

create table dept6 
as
select dcode, dname from dept2
where dcode in(1000,1001,1002);

alter table dept6
add(location2 varchar2(10) default 'seoul');

create table new_emp3 
as
select * from new_emp2
where 1=2;

alter table new_emp2
add(BIRTHDAY2 varchar2(10) default sysdate);

alter table new_emp2
rename column BIRTHDAY to BIRTH;
rename dept6 to dept7;


alter table new_emp2
modify(EMPNO NUMBER(7));

alter table new_emp2
drop column BIRTH;




create table tmi
(no1 number
,no2 number(3)
,no3 number(3,2));

insert into tmi(no1, no2,no3) values(1,1,1);

insert into tmi values(22.22,22.2,22.2);




select * from professor
where position='assistant professor';

update professor
set bonus=200
where position='assistant professor';

select * from dept2
where dcode >= 1001 and dode <= 1005;

delete from dept2
where DCODE >= 1001 and DCODE <= 1005;

select * from dept4;


delete from dept4;

TRUNCATE TABLE new_emp2;
commit;
rollback;
select * from Professor;
drop table new_emp2;
desc tmi;