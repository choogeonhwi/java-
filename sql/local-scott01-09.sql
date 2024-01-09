select 
name, email,substr(email,instr(email,'@')+1)  "domain", pay
,rank() over(partition by substr(email,instr(email,'@')+1)
order by pay desc) "r"
from professor;

select
name, hpage,substr(email,instr(email,'@')+1) "domain", pay,
sum(pay) over(partition by substr(email,instr(email,'@')+1)
order by pay desc)"total"
from professor
where hpage is not null;

select
name,tel,weight
,sum(weight) over(partition by substr(tel,1,instr(tel,')')-1)
order by weight desc) "total"
,round(weight/sum(weight) over(
partition by substr(tel,1,instr(tel,')')-1))*100,2) "%"
from student;

--4
select * from dept; 
--12
select * from emp;
--48
--카티션 곱(4*12)
select * from emp,dept
order by ename;

--orade join 등가 조인(equi) 12건 한사원이 한부서만 조회됨
select a.empno,a.ename, b.dname
from emp A, dept B
--a.deptno FK, b.deptno PK
where a.deptno = b.deptno;

-- ansi join(db 특성을 타지 않음)
select a.empno, a.ename, b.dname
from emp a join dept b
on a.deptno = b.deptno;


select * from student; --20

select * from professor; --16

select s.name, p.name 
from student s, professor p
where s.profno = p.profno;

select a.name, b.dname, c.name
from student a, department b, professor c
where a.profno = c.profno and a.deptno1 = b.deptno
order by a.profno asc;

select a.name, b.dname, c.name
from student a
join department b
on a.deptno1 = b.deptno
join professor c
on a.profno = c.profno;



select a.name, b.name
from student a, professor b 
where  a.deptno1 = 101
and a.profno = b.profno;




-- 비등가 조인
select 
a.gname
,a.point
,b.gname
from customer a, gift b
where a.point between b.g_start and b.g_end; 

select a.name, b.total, c.grade
from student a, score b, hakjum c
where a.studno = b.studno 
and b.total between c.min_point and c.max_point;


--아우터 조인 null 포함된 검색
--left join
select a.name, b.name
from student a, professor b
--where a.profno = b.profno(+);
where a.profno(+) = b.profno; -- right join

select a.name, b.name
from student a left outer join professor b
on a.profno = b.profno;



select a.name, b.name
from student a, professor b
where a.profno(+) = b.profno 
union 
select a.name, b.name
from student a, professor b
where a.profno = b.profno (+);


select a.name, b.name
from student a full outer join professor b
on a.profno = b.profno;

--self join
select a.empno, a.ename, b.empno, b.ename
from emp a, emp b
where a.mgr = b.empno;

select s.name, s.deptno1, d.dname
from student s, department d
where s.deptno1 = d.deptno
order by studno asc;


select s.name, s.deptno1, d.dname
from student s join department d
on s.deptno1 = d.deptno
order by studno asc;


select 
a.name 
, b.position
,to_char(a.pay,'999,999,999')
,to_char( b.s_pay,'999,999,999') "L"
,to_char( b.e_pay,'999,999,999') "E"
from emp2 a, p_grade b
where a.position = b.position;

select 
e.name
,e.birthday
,trunc((sysdate - e.birthday)/365,0) "age"
,e.position
,g.position
from emp2 e, p_grade g
where trunc((sysdate - e.birthday)/365,0) 
between g.s_age and g.e_age;


select a.gname,a.point,b.gname
from customer a, gift b
where a.point between 600001 and 1000000
and b.gname='Notebook';

select a.profno, a.name, to_char(a.hiredate,'yyyy/mm/dd')
,rank() over(order by a.hiredate,a.profno)-1 "count"
from professor a;

select 
a.empno, a.ename, a.hiredate
,rank() over(order by a.hiredate,a.empno desc)-1 "count"
from emp a;



create or replace view v_emp1
as
select empno
,ename
,hiredate
from emp;

--뷰에서는 인덱스 생성이 안 된다.
create index idx_v_emp1_ename
on v_emp1(ename);

create or replace view v_emp1
as
select empno
,ename
from emp;

drop view v_emp1;


-- 복합뷰 (짜집기)
create or replace view v_emp2
as
select 
e.ename
,d.dname
from emp e, dept d
where e.deptno = d.deptno;


--인라인 뷰
select e.deptno, d.dname, e.sal
from(select deptno,max(sal) sal from emp 
group by deptno) e, dept d
where e.deptno = d.deptno;


select decode(deptno, ndeptno, null, deptno) deptno
,profno
,name
 from
(
select LAG(deptno) over(order by deptno) ndeptno
,deptno
,profno
,name
from professor 
);


create  view v_prof_dept
as
select 
a.profno
, a.name
, b.dname
from professor a, department b
where a.deptno = b.deptno;
drop view v_prof_dept;









select b.dname
, a.height 
, a.weight 
 from (select deptno1,
  max(height)   height
 , max(weight)   weight 
 from student
group by deptno1) a, department b
where a.deptno1 = b.deptno;


select b.dname
, a.max 
, s.name
, s.height
 from (select deptno1
,max(height)  max
 from student
group by deptno1) a,student s ,department b
where s.deptno1 = a.deptno1
and s.height = a.max
and s.deptno1 = b.deptno;



select * from student; 
select * from department;








select * from v_prof_dept;
select * from professor; 



select * from dept; 

select * from emp; 

select * from v_emp2;

select * from v_emp1;




select * from Customer; 

select * from gift; 


select * from emp2;

select * from p_grade;









select * from score; 

select * from hakjum; 









select * from professor;