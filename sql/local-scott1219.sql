select name,height,substr(jumin,5,2)   "day"
from student
where height>=180;

select name, grade,tel,instr(tel,'6') "6" 
from student
where grade=2 or grade=4;

select name,tel, substr(tel, instr(tel,')')+1,(instr(tel,'-')-1)-(instr(tel,')'))) "guk_no"
from student
where deptno1=101;

select ename,job,replace(job,substr(job,3,1),'?') "?"
from emp
where deptno=20;

select ename,sal,comm
,to_char(sal*12,'$99,999') "ys"
,to_char(sal*12+comm,'$99,999') "total"
,to_char((sal*12+comm)*1.05,'$99,999') "5% up"
,to_char((sal*12+comm)*0.95,'$99,999') "5%down"
from emp
where comm is not null; 


select name,hpage,decode(hpage,hpage
,replace(hpage,substr(hpage,instr(hpage,'//')+2,instr(hpage,'.',1)-8),'study')
) "S_H"
from professor
where hpage is not null;

select gname, point,case
WHEN point BETWEEN 1 AND 99999 THEN 'C'
WHEN point BETWEEN 100000 AND 299999  THEN 'B'
WHEN point BETWEEN 300000 AND 600000 THEN 'A'
WHEN point >60000 THEN 'S'
END "class"
   from customer
   order by point desc;


select SUM(pay),sum(pay/16),max(pay)
  ,min(pay),round(stddev(pay),2),round(variance(pay),2)
from professor;

select position,round(avg(pay),2)
from professor
GROUP BY position
having avg(pay)>300;

select max(sal+nvl(comm,0)),min(sal+nvl(comm,0)),round(avg(sal+nvl(comm,0)),1)
from emp;

select  
SUM(regexp_count(birthday,'/01/')+regexp_count(birthday,'/02/')+regexp_count(birthday,'/03/')+regexp_count(birthday,'/04/')+regexp_count(birthday,'/05/')+regexp_count(birthday,'/06/')+regexp_count(birthday,'/07/')+regexp_count(birthday,'/08/')+regexp_count(birthday,'/09/')+regexp_count(birthday,'/10/')+regexp_count(birthday,'/11/')+regexp_count(birthday,'/12/')) "T",
sum(regexp_count(birthday,'/01/')) "J",
sum(regexp_count(birthday,'/02/')) "FEB",
sum(regexp_count(birthday,'/03/')) "MAR",
sum(regexp_count(birthday,'/04/')) "APR",
sum(regexp_count(birthday,'/05/')) "MAY",
sum(regexp_count(birthday,'/06/')) "JUN",
sum(regexp_count(birthday,'/07/')) "AUG",
sum(regexp_count(birthday,'/08/')) "SEP",
sum(regexp_count(birthday,'/09/')) "OCT",
sum(regexp_count(birthday,'/10/')) "NOV",
sum(regexp_count(birthday,'/11/')) "DEC",
sum(regexp_count(birthday,'/12/')) "NOV"
from student;

select sum(regexp_count(tel,'02')
+regexp_count(tel,'031')
+regexp_count(tel,'051')
+regexp_count(tel,'052')
+regexp_count(tel,'053')
+regexp_count(tel,'055')) "TOTAL"
,sum(regexp_count(tel,'02')) "SEOUL"
,sum(regexp_count(tel,'031')) "GYEONGGI"
,sum(regexp_count(tel,'051')) "BUSAN"
,sum(regexp_count(tel,'052')) "ULSAN"
,sum(regexp_count(tel,'053')) "DAEGU"
,sum(regexp_count(tel,'055')) "gyeongnam"
from student;

select deptno, ename, sal,
SUM(sal) OVER(ORDER BY sal)  "TOTAL"
from emp;

select sum(decode(name, 'apple',100)) "a"
,sum(decode(name, 'apple',200)) "g"
,sum(decode(name, 'apple',300)) "o"
from fruit;


select sum(decode(name, 'apple', price)) "a"
,sum(decode(name, 'grape',price)) "g"
,sum(decode(name, 'orange',price)) "o"
from fruit;


select sum(regexp_count(tel,'02')
+regexp_count(tel,'031')
+regexp_count(tel,'051')
+regexp_count(tel,'052')
+regexp_count(tel,'053')
+regexp_count(tel,'055'))||'EA ' ||sum(regexp_count(tel,'02')
+regexp_count(tel,'031')
+regexp_count(tel,'051')
+regexp_count(tel,'052')
+regexp_count(tel,'053')
+regexp_count(tel,'055'))/20*100 || '%' "TOTAL"
,sum(regexp_count(tel,'02'))||'EA ' ||sum(regexp_count(tel,'02'))/20*100 || '%'  "SEOUL"
,sum(regexp_count(tel,'031'))||'EA ' || sum(regexp_count(tel,'031'))/20*100 || '%' "GYEONGGI"
,sum(regexp_count(tel,'051'))||'EA ' ||sum(regexp_count(tel,'051'))/20*100 || '%' "BUSAN"
,sum(regexp_count(tel,'052'))||'EA ' ||sum(regexp_count(tel,'052'))/20*100 || '%' "ULSAN"
,sum(regexp_count(tel,'053'))||'EA ' ||sum(regexp_count(tel,'053'))/20*100 || '%' "DAEGU"
,sum(regexp_count(tel,'055'))||'EA ' ||sum(regexp_count(tel,'055'))/20*100 || '%' "gyeongnam"
from student;





select deptno,ename,sal,
SUM(sal) over(partition by deptno ORDER BY sal) "TOTAL"
from emp;


select deptno, ename
, sum(sal) over()"T-S"
, round(sal/24925*100,2) "%"
from emp
order by sal/24925*100 desc;

select deptno, ename, sal
,sum(sal) over(partition by deptno)"s-d"
,round(sum(sal) over(partition by sal)
/sum(sal) over(partition by deptno)*100,2) "%"
from emp
group by deptno,ename,sal
order by 1;


select l_date "대출일자"
,l_code "대출종목코드"
,l_qty "대출건수"
,l_total "대출총액"
,sum(l_total) over(order by l_date) "누적대출금액"
from loan
 where l_store=1000;

SELECT * from  loan;