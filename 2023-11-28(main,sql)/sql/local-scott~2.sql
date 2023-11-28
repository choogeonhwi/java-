SELECT * FROM STUDENT;

SELECT NAME, GRADE, HEIGHT
FROM student
ORDER BY HEIGHT DESC

SELECT * FROM STUDENT;

SELECT NAME, ID, GRADE
FROM student
WHERE DEPTN1=101 AND GRADE >=3;


SELECT NAME, GRADE, HEIGHT 
FROM STUDENT
WHERE 165<HEIGHT AND height<175;

SELECT NAME, ID, DEPTNO1 
FROM STUDENT
WHERE NAME like 'B%';



SELECT DEPTNO1 
FROM STUDENT
WHERE PROFNO IS NOT NULL AND DEPTNO1 IS NULL;  

SELECT deptno 
FROM professor 
INTERSECT 
SELECT deptno
FROM department
MINUS
SELECT deptno1
FROM student;

select * from professor;

select name, PAY, DEPTNO
from professor
where bonus is null;


select profno, NAME, PAY, bonus
from professor
ORDER BY PAY DESC;


select profno, NAME, PAY, pay*12 "연봉", deptno
from professor
ORDER BY deptno DESC, 연봉 ASC;

select  NAME, PAY, bonus
from professor
where (pay>300 and bonus is not null) OR pay>450;


select * from professor;
SELECT * FROM STUDENT;

select  NAME, PAY, bonus
from professor
where (pay>300 and bonus is not null) OR pay>450;



SELECT name, deptno1
FROM student 
where deptno1=201
union all
select name, deptno
from professor
where deptno=201;

SELECT name
,lower(name)
,upper(name)
from professor;

SELECT * from professor;

SELECT 1
from dual;
//임시 테이블

SELECT sysdate
FROM dual;

SELECT abs(352)
from dual;

SELECT ename 
,length(ename)
,lengthb(ename)
from emp;

SELECT '서진수' "name"
,length('서진수') "name"
,lengthb('서진수') "name"
from dual;

SELECT ename
,job
,concat(ename,job)
from emp;

SELECT job
,substr(job,3,2)
,substr(job,6,2)
,substr(job,4)
,substr(job,-3,2)
from emp;


SELECT '서진수' "name"
,substr('서진수',1,2)
,substrb('서진수',1,2)
,substrc('서진수',1,3)
from dual;

SELECT 'a-b-c-d'
,instr('a-b-c-d','-')"instr"
,instr('a-b-c-d','-',1,1)"instr"
,instr('a-b-c-d','-',1,3)"instr"
,instr('a-b-c-d','-',3,1)"instr"
,instr('a-b-c-d','-',3)"instr"
from dual;

SELECT 'A-B-C-D'
,instr('a-b-c-d','-',1,3)"instr"
,instr('a-b-c-d','-',-1,3)"instr"
,instr('a-b-c-d','-',-3,1)"instr"
,instr('a-b-c-d','-',-6,1)"instr"
,instr('a-b-c-d','-',-6,2)"instr"
FROM DUAL;

SELECT name,tel
,instr(tel,')')"instr"
FROM student;

SELECT * from student;

SELECT name,tel,instr(tel,'8',1,2)
FROM student
where deptNO1='101';



SELECT name,tel,SUBSTR(tel,1,INSTR(TEL,')')-1)"AREA CODE"
FROM student
where deptNO1='201';



