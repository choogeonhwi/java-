select s.grade, s.name, s.height
,a.avg
from 
(select grade
,avg(height) avg
from student
group by grade) a, student s
where a.grade =  s.grade
and s.height > a.avg
order by 1;

select 
rownum "r"
,name
,pay
from
(select name,pay from professor order by 2 desc)
where ROWNUM between 1 and 5;


create sequence j
increment by 1
start with 100
maxvalue 110
minvalue 90
cycle
cache 2;

select *from user_sequences;

--최초 실행시 조회 실패
select j.currval from dual;

--확인 후 조회
select j.nextval from dual;


alter sequence j
maxvalue 120
nocycle
cache 10;

drop sequence j;

--최초 실행시 조회 실패
select j.currval from dual;

--확인 후 조회
select j.nextval from dual;

create sequence jr
increment by -2
start with 10
maxvalue 20
minvalue 0
cycle
cache 2;

--최초 실행시 조회 실패
select jr.currval from dual;

--확인 후 조회
select jr.nextval from dual;

create synonym E FOR EMP;

select * from user_synonyms;
select * from e;
select * from emp;

drop synonym e;



select s.grade, s.name, s.height
,a.avg
from 
(select grade
,avg(height) avg
from student
group by grade) a, student s
where a.grade =  s.grade
and s.height > a.avg
order by 1;

select 
name
,position
,to_char(pay,'999,999,999') "SALARY"
FROM emp2 a
where pay >= (select AVG(pay)
 from emp2 b
 where a.position = b.position);


select s.name "sn" , d.dname "dn"
from student s, department d
where s.deptno1 = d.deptno 
and s.deptno1 =(select deptno1
from student
where name='Anthony Hopkins');

select p.name , p.hiredate, d.dname
from professor p, department d
where p.deptno = d.deptno 
and hiredate > (select hiredate from professor
where name='Meg Ryan');

select name
,weight
from student 
where weight > (select 
avg(weight)
from student 
where deptno1=201);

select a.empno
,a.name
,b.dcode "DEPTNO"
from emp2 a, dept2 b
where AREA='Pohang Main Office'
and a.deptno = b.dcode;

select name
,position
,to_char(pay,'$999,999,999') salary
from emp2
where pay > (select min(pay)
from emp2
where position='Section head')
order by salary desc;

select 
name
,grade
,weight 
from student
where weight<(select min(weight)
from student
where grade='2')
order by weight desc;


select b.dname
,a.name
,to_char(a.pay,'$999,999,999') salary
from emp2 a, dept2 b 
where a.deptno = b.dcode 
and a.pay < all (select avg(pay)
from emp2
group by deptno)
order by 3;


select 
grade
,name
,weight
from student
where (grade, weight) in (select grade
, max(weight)
from student
group by grade
)order by 1;


select 
p.profno
,p.name
,to_char(p.hiredate, 'yyyy-mm-dd')
,d.dname
from professor p, department d
where p.deptno= d.deptno
and (p.deptno, p.hiredate) in(select deptno,min(hiredate)
from professor 
group by deptno)
order by 3;


select 
name
,position
,to_char(pay,'$999,999,999') salary
from emp2 
where position is not null and(pay) in
(select max(pay) 
from emp2  
group by position)
order by salary asc;

select 
name
,position
,to_char(pay, '$999,999,999') salary
from emp2
where (salary) in(select max(pay)
from emp2 
group by position)
order by 1;

--방법1
select 
a.name
,b.dname
from emp2 a , dept2 b
where b.dcode=a.deptno;

--방법2
select name,(select dname from dept2 d
where e.deptno = d.dcode) "dn"
from emp2 e;




select * 
from dept
where deptno=
(select deptno
from dept
where deptno=20);

select * 
from dept
where deptno in
(select deptno
from dept
where deptno=20);

select * from dept
where deptno=20;

select * 
from dept
where exists
(select deptno
from dept
where deptno=21);

select deptno
,job
,avg(sal) 
,count(deptno)
from emp
group by deptno,job
union all
select deptno
,null
,round(avg(sal),1) 
,count(deptno)
from emp
group by deptno,job
union all
select null
,null 
,round(avg(sal),1) 
,count(deptno)
from emp
order by deptno;


select deptno
,job
,round(avg(sal),1) avg123
,count(deptno)
from emp
group by rollup (deptno,job);


select deptno
,job
,avg(sal) 
,count(deptno)
from emp
group by deptno,job
union all
select deptno
,null
,round(avg(sal),1) 
,count(deptno)
from emp
group by deptno
union all
select null
,job
,round(avg(sal),1) 
,count(deptno)
from emp
group by job;


select deptno
,job
,round(avg(sal),1) avg123
,count(deptno)
from emp
group by cube (deptno,job)
order by deptno;



select deptno
,null job
,round(avg(sal),1) 
,count(deptno)
from emp
group by deptno

union all

select null
,job 
,round(avg(sal),1) 
,count(deptno)
from emp
group by job
order by deptno,job;

select deptno
,job
,round(avg(sal),1) avg123
,count(deptno)
from emp
group by grouping sets (deptno,job)
order by deptno;





select grade
,null deptno1
,count(*)
,sum(height) 
,sum(weight)
from student
group by grade

union all

select null
,deptno1
,count(*)
,sum(height) 
,sum(weight)
from student
group by deptno1
order by grade,deptno1;






select * from emp;

select * from dept2;


select * from  professor;

select * from department;


select * from student;



















select * from emp2;



