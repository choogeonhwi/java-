create or replace function get_hiredate
(v_empno number, v_fmt varchar2)
RETURN varchar2 is v_hiredate varchar2(20);

begin   
select to_char(hiredate, v_fmt) 
into v_hiredate
from  emp
where empno = v_empno;
return v_hiredate;
end;