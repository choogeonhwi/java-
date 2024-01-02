create tablespace storm
datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data.dbf'
size 100M autoextend on next 10M MAXSIZE 500M
default storage
(initial 10k
next 10k
minextents 2
maxextents 50
pctincrease 50
);

select * from dba_tablespaces
where tablespace_name='STORM';

select * from user_tables
where tablespace_name='STORM';

select * from dba_data_files;

select * from dba_free_space
where tablespace_name='STORM';

alter database datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data.dbf'
AUTOEXTEND on next 10m MAXSIZE 500m;

alter tablespace storm add datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data2.dbf'
size 50m;

alter tablespace storm drop datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data2.dbf';

create user test
identified by test
default tablespace storm
temporary tablespace temp
quota unlimited on storm;

select * from dba_sys_privs
where grantee='TEST';
grant create table to TEST
with admin option;
revoke create table from test;



