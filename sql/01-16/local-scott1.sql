

create table emp3
(
no number
,name varchar2(10)
,sal number
);


select * from emp3
order by no;

select count(*) from emp3;

drop table emp3;
commit;