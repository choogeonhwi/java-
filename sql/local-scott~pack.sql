create or replace package emp_mgmt as
procedure adjust_sal
(v_flag varchar2, v_empno number, v_pct number);

function get_sal
(v_empno number)
RETURN NUMBER;

function get_money
(v_empno number)
RETURN NUMBER;

procedure remove_emp(v_empno number);

function get_hiredate
(v_empno number, v_fmt varchar2)
RETURN varchar2;
end emp_mgmt;