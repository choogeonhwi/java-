create or replace function get_money
(v_empno number)
RETURN NUMBER is v_sal NUMBER;

begin   
select round((sal+nvl(comm,0))* 
round(months_between(sysdate, hiredate),0)/ 12,0) 
into v_sal
from  emp
where empno = v_empno;
return v_sal;
end;