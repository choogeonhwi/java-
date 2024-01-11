create or replace function get_sal
(v_empno number)
RETURN NUMBER is v_sal NUMBER;

begin   
select (sal+nvl(comm,0))*12 into v_sal
from  emp
where empno = v_empno;
return v_sal;
end;





