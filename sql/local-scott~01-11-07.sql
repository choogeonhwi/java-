create or replace function help
(v_module varchar2)
RETURN varchar2 is v_usage varchar2(100);

begin   
v_usage := v_module || '�� �̵�� ���';

if upper(v_module) = 'adjust_sal' then
v_usage := '����:proc, 
����: exec adjust_sal
(increaseidecrease,���,������)';

elsif
upper(v_module) = 'get_sal' then
v_usage := '����:function, 
����: get_sal(���)';

elsif
upper(v_module) = 'get_money' then
v_usage := '����:function, 
����: get_money(���)';

elsif
upper(v_module) = 'remove_emp' then
v_usage := '����:proc, 
����: remove_emp(���)';

elsif
upper(v_module) = 'get_hiredate' then
v_usage := '����:function, 
����: get_hiredate(���,����)';
end if;
return v_usage;
end;