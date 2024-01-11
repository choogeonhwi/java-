create or replace function help
(v_module varchar2)
RETURN varchar2 is v_usage varchar2(100);

begin   
v_usage := v_module || '는 미등록 모듈';

if upper(v_module) = 'adjust_sal' then
v_usage := '종류:proc, 
사용법: exec adjust_sal
(increaseidecrease,사번,증감율)';

elsif
upper(v_module) = 'get_sal' then
v_usage := '종류:function, 
사용법: get_sal(사번)';

elsif
upper(v_module) = 'get_money' then
v_usage := '종류:function, 
사용법: get_money(사번)';

elsif
upper(v_module) = 'remove_emp' then
v_usage := '종류:proc, 
사용법: remove_emp(사번)';

elsif
upper(v_module) = 'get_hiredate' then
v_usage := '종류:function, 
사용법: get_hiredate(사번,포맷)';
end if;
return v_usage;
end;