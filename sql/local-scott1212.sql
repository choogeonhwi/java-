desc professor  ;
  
  select * from professor ;
  
  select name, id, email
  from professor;
  
   select  distinct deptno
  from professor;
  
    select profno "교수번호", name "교수명", 
    position "위치", hpage "홈페이지"
  from professor;
  
select name || '교수의 이메일' ||email|| '이고,' || ' 홈페이지' || hpage;

  
  select name, pay, pay*12 "Y_pay"
  from professor;
  
  select name, pay, bonus
  from professor
  where bonus>80 order by pay desc;
  
    select name, id, hpage
  from professor
  where deptno=102;
  
  select name, pay, hiredate
  from professor
  where pay > 300 and pay <500;
  
   select name, id, position
  from professor
  where id like '%er';
  
   select profno,name, pay,bonus, pay*12+bonus "총연봉",deptno
  from professor
  order by deptno desc , "총연봉" asc;
  
  select name,pay,bonus
  from professor
  where (pay>300 and bonus is  null) or pay>500;
  
  select profno, name, hpage, instr(hpage,'.',1,2) "http"
  from professor
  where instr(hpage,'.',1,2) is not null;
  
  
  select profno, name, substr(email,1,instr(email,'@')-1) eid
  from professor
   where email is not null;
   
   select UPPER(name) "name",LOWER(id) "id",INITCAP(position) "position",length(email) "eid"
   from professor
   where email is not null;
   
   select gname, substr(jumin,1,2) "year", point
   from customer
   
    where point >100000 
    order by point desc;
   
   select name,email,instr(email,'@') "@"
   from professor
   where email is not null;
   
      select name,email,
      substr(email, instr(email,'@')+1,(instr(email,'.')-1)-(instr(email,'@'))) "domain"
   from professor
   where email is not null;
   
   
   select dname, lpad(dname,9,'1234'),
   loc, rpad(loc,9,substr('123456789',length(loc)+1))
   from dept;
   
   
   select gname, jumin, replace(gname,substr(gname,4,3), '337') "337"
   from customer
   where substr(jumin,1,2)<77;
   
   select name,hpage,replace(hpage,substr(hpage,-3,2), 'ok') "ok"
   from professor
   where hpage is not null;
   
   select name,hiredate
   from professor
   where to_char(hiredate,'mm')in('03','08','10');
   
   select name,to_char(hiredate, 'yyyy-mm-dd')
   ,pay
   ,bonus
   ,'$'||(pay*12+bonus) "총연봉"
   , '$'||(pay*12+bonus)*0.9 "10%DC"
   ,((pay*12+bonus)*0.9)*1200 "원"
   from professor
   where bonus is not null;
   
   select ename,sal,NVL(comm, 0),
   to_char(sal*12+NVL(comm, 0), '99,999') "토탈"
   from emp
   where deptno=30 ;
   
   
   select name, tel
   ,decode(instr(tel,')')-1
   ,02
   ,replace(tel,substr(tel,4,4),'****')
   ,replace(tel,substr(tel,5,3),'***')
   ) "replace"
   from emp2;
   
   
   select name,pay
   ,case 
WHEN pay BETWEEN 1 AND 300 THEN 'grade1'
WHEN pay BETWEEN 301 AND 400  THEN 'grade2'
WHEN pay BETWEEN 401 AND 500 THEN 'grade3'
WHEN pay >500 THEN 'grade4'
END "grade"
   from professor
   order by pay desc;
   
 
 
 
   
  select text
  , regexp_count(text,'a')"C"  --소문자 a 갯수
  , regexp_count(text,'bc')"C" --소문자 bc의 갯수
  , regexp_count(text,'12')"C" -- 12의 갯수
  
  , regexp_count(text,'c',5)"C" -- 5번째 이상의 c의 갯수
  ,regexp_count(text,'c',1)"c"
  
  ,regexp_count(text,'c',1,'i')"c" --대소문자 구분없이
  
  ,regexp_count(text,'.')"c" --모든 문자 갯수
  ,length(text)
  
  ,regexp_count(text,'\.')"c" --특수문자 .의 갯수
  
  ,regexp_count(text,'a{2}')"c" --aa의 갯수
  ,regexp_count(text,'(a)(a)')"c"
  
  from t_reg;
 
  select count (*),
  
  -- 그룹함수는 null을 무시
  
  count(comm)"a"
  ,sum(comm)"a"
  ,avg(comm)"a"
  ,avg(nvl(comm,0))"a"
  ,max(sal)"a"
  ,min(sal)"a"
  ,stddev(sal)"a" --표준편차
  ,variance(sal)"a" --분산
  
  from emp;
  
  
  select  
  deptno
  ,job
  ,Avg(nvl(sal,0))"avg"
  from emp
  group by deptno,job;
  
  select
  deptno
  ,round(Avg(sal),2)"avg"
  from emp
  group by deptno
  having avg(sal)>2000;
  
  
  select MAX(decode(day,'SUN',dayno)) "sun"
 , max(decode(day,'MON',dayno)) "mon"
  ,max(decode(day,'TUE',dayno)) "tue"
  , max(decode(day,'WED',dayno)) "wed"
  , max(decode(day,'THU',dayno)) "thu"
  ,max(decode(day,'FRI',dayno)) "fri"
  , max(decode(day,'SAT',dayno)) "sat"
  from cal
  GROUP BY WEEKNO
ORDER BY WEEKNO;


SELECT *FROM (SELECT WEEKNO,DAY,DAYNO FROM CAL)
PIVOT 
(MAX(DAYNO)FOR DAY IN('SUN','MON','TUE','WED','THU','FRI','SAT'))
ORDER BY WEEKNO;
  
  
  
  select 
  DEPTNO
  ,COUNT(decode(JOB,'CLERK',DEPTNO)) "C"
 ,COUNT(decode(JOB,'MANAGER',DEPTNO)) "M"
  ,COUNT(decode(JOB,'PRESIDENT',DEPTNO)) "P"
   ,COUNT(decode(JOB,'ANALYST',DEPTNO)) "A"
    ,COUNT(decode(JOB,'SALESMAN',DEPTNO)) "S"
from EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
  
  SELECT *
  FROM (SELECT DEPTNO
  ,JOB
  ,EMPNO 
  FROM EMP)
PIVOT 
(COUNT(EMPNO)FOR DAY IN('CLERK','MANAGER','PRESIDENT','ANALYST','SALESMAN'))
ORDER BY DEPTNO;
  
  
  select 
  DEPTNO
  ,COUNT(decode(JOB,'CLERK',DEPTNO)) "C"
  ,SUM(DECODE(JOB,'CLERK',SAL)) "CS"
 ,COUNT(decode(JOB,'MANAGER',DEPTNO)) "M"
  ,SUM(DECODE(JOB,'MANAGER',SAL)) "MS"
  ,COUNT(decode(JOB,'PRESIDENT',DEPTNO)) "P"
   ,SUM(DECODE(JOB,'PRESIDENT',SAL)) "PS"
   ,COUNT(decode(JOB,'ANALYST',DEPTNO)) "A"
    ,SUM(DECODE(JOB,'ANALYST',SAL)) "AS"
    ,COUNT(decode(JOB,'SALESMAN',DEPTNO)) "S"
     ,SUM(DECODE(JOB,'SALESMAN',SAL)) "SS"
from EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
  
  SELECT ENAME
  ,HIREDATE
  ,SAL
  ,LAG(SAL,1,0) OVER(ORDER BY HIREDATE) "L" --이전행
  ,LAG(SAL,1) OVER(ORDER BY HIREDATE) "L"
  ,LAG(SAL,2,0) OVER(ORDER BY HIREDATE) "L"
  ,LAG(SAL,1,777) OVER(ORDER BY HIREDATE) "L"
  ,LAG(SAL) OVER(ORDER BY HIREDATE) "L"
  FROM EMP;
  
   SELECT ENAME
  ,HIREDATE
  ,SAL
  ,LEAD(SAL,1) OVER(ORDER BY HIREDATE) "L" --이후행
  ,LEAD(SAL,1,0) OVER(ORDER BY HIREDATE) "L"
  ,LEAD(SAL,2,0) OVER(ORDER BY HIREDATE) "L"
,LEAD(SAL,2,888) OVER(ORDER BY HIREDATE) "L"
,LEAD(SAL) OVER(ORDER BY HIREDATE) "L"
  FROM EMP;
  
  --순위 
  SELECT  RANK('SMITH') WITHIN GROUP(ORDER BY ENAME)"R"
  FROM EMP
  ORDER BY ENAME;
  
  
  --전체 순위
  SELECT EMPNO
  ,ENAME
  ,SAL
  ,RANK() OVER(ORDER BY SAL desc) "R_ASC"
  FROM EMP;
  
  
  select empno, ename, sal, deptno
  ,RANK() OVER(ORDER BY deptno,sal desc)"R_ASC"
  from emp
  where deptno=10
  union all
 select empno, ename, sal, deptno
  ,RANK() OVER(ORDER BY deptno,sal desc)"R_ASC"
  from emp
  where deptno=20
  union all
   select empno, ename, sal, deptno
   ,RANK() OVER(ORDER BY deptno,sal desc)"R_ASC"
  from emp
  where deptno=30;
  
  
  select empno,ename,sal,deptno,job
  ,RANK() OVER(partition by deptno,job order by sal desc)"Rank"
  from emp;
 
 
    select empno, ename, sal
   ,dense_RANK() OVER(ORDER BY sal)"R_ASC"
   --dense:같은값은 노카
   ,row_number() OVER(ORDER BY sal)"R_ASC"
   --row_number:고유한 순위을 지정
  from emp; 
    
   
    
   select  p_date,p_code,p_qty,p_total
    ,SUM(P_TOTAL) OVER(ORDER BY P_TOTAL)  "TOTAL"
   from panmae
   where P_STORE=1000;
    
    
    
    
select  p_date,p_code,p_qty,p_total
,SUM(P_TOTAL) OVER(partition by p_code order by p_total) "TOTAL"
from panmae
where P_STORE=1000;
   
   
   
   
select  P_CODE,P_STORE,P_DATE,P_QTY,P_TOTAL
,SUM(P_TOTAL) OVER(partition by P_CODE,P_STORE order by P_DATE) "TOTAL"
from panmae;
   
    
 select  P_CODE,P_STORE,P_QTY
,SUM(P_qty) OVER() "TOTAL_QTY"
,round(p_qty / sum(p_qty) OVER()*100,2) "QTY_%"
from panmae
where p_code=100
group by p_code,p_store,p_qty;
    
SELECT * FROM panmae;
  
  