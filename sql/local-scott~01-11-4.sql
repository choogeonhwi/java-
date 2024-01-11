create or replace procedure remove_emp1
(v_empno number)
as
begin   
delete from emp
where empno = v_empno;
end;