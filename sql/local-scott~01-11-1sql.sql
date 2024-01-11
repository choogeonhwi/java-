create or replace procedure adjust_sal
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
end;

