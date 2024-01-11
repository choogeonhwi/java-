create or replace package body emp_mgmt as
--±Þ¿©
procedure adjust_sal
(v_flag varchar2, v_empno number, v_pct number)
as
begin
if v_flag = 'increase' then
 update emp set sal = sal+(sal*(v_pct)/100)
 where empno = v_empno;
 
 else 
 update emp set sal = sal-(sal*(v_pct)/100)
 where empno = v_empno;
 end if;
end ;


--¿¬ºÀ
function get_sal
(v_empno number)
RETURN NUMBER is v_sal NUMBER;

begin   
select (sal+nvl(comm,0))*12 into v_sal
from  emp
where empno = v_empno;
return v_sal;

end;


function get_money
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




procedure remove_emp
(v_empno number)
as
begin   
delete from emp
where empno = v_empno;
end;



function get_hiredate
(v_empno number, v_fmt varchar2)
RETURN varchar2 is v_hiredate varchar2(20);
begin   
select to_char(hiredate, v_fmt) 
into v_hiredate
from  emp
where empno = v_empno;
return v_hiredate;
end;

end emp_mgmt;




