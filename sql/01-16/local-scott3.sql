desc emp;

select 
e.empno,e.ename,d.deptno,d.dname
from emp e join dept d
on e.deptno = d.deptno
order by e.empno;


select * from mvc_board;


select bid,bname,btitle,bcontent,bdate,bhit
from(select rownum rn,bid,bname,btitle,bcontent,bdate,bhit 
from mvc_board
where rownum <= (2* 10)
order by bid desc)
where rn > (2-1)*10

commit;