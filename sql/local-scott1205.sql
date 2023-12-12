SELECT empno
, ename, job from emp;
    
SELECT * from emp;

SELECT distinct deptno from emp;

select empno "사번", ename "사원명", job "직업", deptno "부서번호" 
from emp;

select ename || '직업은' || job || '이고' || '부서번호는' || deptno
from emp;

select ename, job, sal, (sal*12) "연봉"
from emp;

select ename, job, sal
from emp
where sal>2000
order by sal desc;

select ename, deptno, sal
from emp
where sal>1000 and deptno=20;


select ename, job, sal
from emp
where sal>2000 and sal<3000;

select ename, job, deptno
from emp
where ename like 'ja%';

select ename, job, deptno
from emp
where comm is not null;

select ename, deptno, sal, sal*12 "연봉"
from emp
order by deptno desc , "연봉" asc;

select ename,  sal, comm 
from emp
where (sal > 1000 and comm is  not null) or sal > 3000; 


select name
 ,id
 ,lpad(id,10,'*')
  from student;
  
  select ename
 
  ,lpad(ename, 9, '123456789') "lpad"
   from emp;
   
   
   select ename
   ,rpad(ename,10,'-') "rpad"
   from emp;
   
    select ename
    ,rpad(ename,10,substr('123456798',LENGTH(ENAME))) "rpad"
     from emp
   
   where deptno=10;
   
   SELECT ENAME
   ,RPAD(ENAME,10,'-')
   ,LTRIM(ENAME,'C')
      ,RTRIM(ENAME,'R')
        ,REPLACE(ENAME, SUBSTR(ENAME,1,2),'**')
   FROM EMP;
  
    SELECT ENAME
    
        ,REPLACE(ENAME, SUBSTR( ENAME,2,2),'--')
   FROM EMP;
  
  
SELECT DEPTNO1,NAME,JUMIN
,REPLACE(JUMIN,SUBSTR(JUMIN,7,7),'-/-/-/-')
from student
where deptno1=101;
 
 
 //telinstr(tel')')+1,3)
 SELECT NAME, tel
,REPLACE(tel,SUBSTR(tel,5,3),'***') 
from student
where deptno1=102;


//  substr(tel,instr(tel,'-',1,1)+1,4),'****')
 SELECT NAME, tel
,REPLACE(tel,SUBSTR(tel,9,7),'****') 
from student
where deptno1=101;


select 987.654 "n"
       ,round(987.654,1)
--       //반올림
       ,trunc(987.654,1)
--       //자리수
       ,mod(12,5)
--       //나머지
        ,ceil(12.345)
--        //올림처리
        ,floor(12.345)
--          // 정수
        ,power(3,2)
--        //지수
from dual;

select '23/12/05' "D" 
,SYSDATE
,MONTHS_BETWEEN('14/09/30','14,08/31')
,MONTHS_BETWEEN('14,08/31','14/09/30')
,ADD_MONTHS(SYSDATE,1)
,next_day(sysdate,'수')
,next_day(sysdate,'화')
,last_day(sysdate)
,last_day('23/05/01')
From DUAL;

select 2
,'2'
,2+'2' 
--자동캐스팅
,2+to_number('2')

from dual;

select sysdate
--,to_char(SYSDATE,'YYYY')
--,to_char(sysdate, 'YY')
--,to_char(sysdate, 'year')
--,to_char(sysdate, 'MM')
--,to_char(sysdate, 'MON')
--,to_char(sysdate, 'DD')
--,to_char(sysdate, 'DAY')
--,to_char(sysdate, 'DDTH')
,to_char(sysdate, 'YYYY-MM-DD') "D"
,to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') "D"
from dual;

SELECT STUDNO,NAME,BIRTHDAY
FROM STUDENT
WHERE to_char(birthday,'mm')= '01';

SELECT hiredate, ename, empno
FROM emp
WHERE to_char(hiredate,'mm') in ('01','02','03');

SELECT empno,  ename, sal, comm, sal*12+comm "연봉"
,to_char(연봉, '99,999')
FROM emp
WHERE ename= ALLEN;


SELECT name, pay, bonus,to_char(pay*12+bonus, '99,999') "연봉"
FROM professor
WHERE deptno=201;
 

SELECT empno, ename, to_char(hiredate,'yyyy-mm-dd'), to_char((sal*12+comm),'$99,999')"총연봉", to_char((sal*12+comm)*1.15, '$99,999') "15% UP"
FROM emp
WHERE comm is not null;



select 5
,'5'
,to_number('5')
,'2014-05-31'
,to_date('2014-05-31')
from dual;

select ename
,comm
,nvl(comm,0)
,nvl(comm,100)
from emp;


select profno,name,pay,bonus,to_char((pay*12)+nvl(bonus,0),'9,999')"total"
from professor
where deptno=201;


select ename,comm,sal 
,nvl2(comm,sal+comm, sal*0)
from emp;

select empno,ename,comm ,nvl2(comm, 'exist', 'null')
from emp
where deptno=30;

select 5
--// 두값이 같으면 출력 아니면 null
-- // case when 성능 튜닝 변경
,decode('a','a','1')
,decode('a','b','1')
from dual;


select deptno,name,decode(deptno, 101 ,'computer en') 
from professor;

select 5
,decode('a','a','1')
,decode('a','b','1')

,decode('aa','b','123','aa','c')
,decode('a','b','1','2')
from dual;

select 
deptno,name,decode(deptno,101,'computer en','etc')
from professor;

select 5,
--,decode('a','a','1')
--,decode('a','b','1')
--
--,decode('a','b','1','2')
--,decode('a','b','1','2')
--
--,decode('a','a','1','c','2','3')
--,decode('a','b','1','a','2','3')
--,decode('a','b','1','c','2','3')

decode('a','a',decode('b','b','1','2'))"D"
,decode('a','a',decode('b','c','1','2'))"D"
,decode('a','z',decode('b','c','1','2'))"D"
,decode('a','z',decode('b','c','1','2'),'9')"D"
from dual;

SELECT deptno, name,
decode(deptno,101,'CE',102,'ME',103,'SE','ETC');

SELECT  deptno,name
,decode(deptno,101,decode(name,'Audie Murphy','best')) "etc"
from professor;

SELECT  deptno,name
,decode(deptno,101,decode(name,'Audie Murphy','best','good'),' ') "etc"
from professor;

SELECT  deptno,name
,decode(deptno,101,decode(name,'Audie Murphy','best','good'),'N/A') "etc"
from professor;

SELECT  name,jumin
,decode(deptno1,101,decode(SUBSTR(JUMIN, 7, 1), '1','mam','2','woman')) "gender"
from student
where deptno1=101;

SELECT  name,tel
--substr(tel, 1, instr(tel, ')')-1),...
,decode(deptno1,101,decode(SUBSTR(tel, 2, 2), '2)','seoul','31','gyeonggl','51','busan','52','ulsan','55','gyeongnam')) "gender"
from student
where deptno1=101;

select 1

--//A가 A이면 1아니면 2
,case 'A' when 'A' then '1'
else '2'
end "AA"
from dual;

SELECT NAME,TEL,CASE(SUBSTR(TEL,1,INSTR(TEL,')')-1)) 
WHEN '02' THEN 'S' 
WHEN '031'THEN 'G' 
WHEN '051'THEN 'B'
WHEN '052'THEN 'U'
WHEN '055'THEN 'GYEO'
    ELSE 'ETC'
    END "LOC"
    FROM STUDENT
    WHERE DEPTNO1 = 201;
    

SELECT NAME, SUBSTR(JUMIN,3,2) "MONT" ,CASE(SUBSTR(JUMIN,3,2)) 
WHEN '01' THEN '1/4' //BETWEEN 사용시 빠름
WHEN '02' THEN '1/4' 
WHEN '03' THEN '1/4' 
WHEN '04'THEN '2/4' 
WHEN '05'THEN '2/4' 
WHEN '06'THEN '2/4' 
WHEN '07'THEN '3/4'
WHEN '08'THEN '3/4'
WHEN '09'THEN '3/4'
WHEN '10'THEN '4/4'
WHEN '11'THEN '4/4'
WHEN '12'THEN '4/4'
    END "QUA"
    FROM STUDENT;

SELECT EMPNO,ENAME,SAL
,CASE
WHEN SAL BETWEEN 1 AND 1000 THEN '1' 
WHEN SAL BETWEEN 1001 AND 2000 THEN '2' 
WHEN SAL BETWEEN 2001 AND 3000 THEN '3' 
WHEN SAL BETWEEN 3001 AND 4000 THEN '4' 
WHEN SAL >4001  THEN '5' 
    END "LEVEL"
    FROM EMP;
    
    
--    //정규식 
--      //REGEXP_LIKE 문자열 포함하는 행찾기 
--      //REGEXP_REPLACE 행안 문자열 수정
--      //REGEXP_COUNT 특정 문자의 갯수 


SELECT *
from T_REG
--    WHERE REGEXP_LIKE(TEXT,'[a-z]')
--    WHERE REGEXP_LIKE(TEXT,'[A-Z]')
--    WHERE REGEXP_LIKE(TEXT,'[a-zA-z]')
--    WHERE REGEXP_LIKE(TEXT,'[a-z] ')
--    WHERE REGEXP_LIKE(TEXT,'[a-z][0-9]')
--    WHERE REGEXP_LIKE(TEXT,'[[:space:]]');
--WHERE REGEXP_LIKE(TEXT,'^[^0-9a-z]');
--WHERE  not REGEXP_LIKE(TEXT,'[a-z]');
WHERE not REGEXP_LIKE(TEXT,'[0-9]'); 

select name, tel
from student
WHERE REGEXP_LIKE(SUBSTR(TEL,1,INSTR(TEL,')')-1), '02') 
and not REGEXP_LIKE(SUBSTR(TEL,1,INSTR(TEL,'-')-1), '3');
// tel, '^[0-9]{2}\)[0-9]{4}')


select text
--,regexp_replace(text, '[0-9]', '*')
,regexp_replace(text, '[[:digit:]]', '*')
from t_reg;

select 'aaa bb  c   d'
, regexp_replace('aaa bb  c   d','( ){1}','') "B"
, regexp_replace('aaa bb  c   d','( ){1}',' ') "B"
, regexp_replace('aaa bb  c   d','( ){2}','') "B"
, regexp_replace('aaa bb  c   d','( ){3}','') "B"

--// 2개이상 공백 삭제
, regexp_replace('aaa bb  c   d','( ){2,}','') "B"
--// 3개이상
, regexp_replace('aaa bb  c   d','( ){3,}','') "B"
--//1개이상
, regexp_replace('aaa bb  c   d','( ){1,}','') "B"
from dual;

select no, ip 
,regexp_replace(ip, '\.','' )
from t_reg2;

SELECT * from STUDENT;