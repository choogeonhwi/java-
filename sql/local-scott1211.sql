desc professor  ;
  
  select * from professor ;
  
  select name, id, email
  from professor;
  
   select  distinct deptno
  from professor;
  
    select profno "교수번호", name "교수명", 
    position "위치", hpage "홈페이지"
  from professor;
  
select name || '교수의 이메일' ||email|| '이고,' || ' 홈페이지' || hpage;

  
  select name, pay, pay*12 "Y_pay"
  from professor;
  
  select name, pay, bonus
  from professor
  where bonus>80 order by pay desc;
  
    select name, id, hpage
  from professor
  where deptno=102;
  
  select name, pay, hiredate
  from professor
  where pay > 300 and pay <500;
  
   select name, id, position
  from professor
  where id like '%er';
  
   select profno,name, pay,bonus, pay*12+bonus "총연봉",deptno
  from professor
  order by deptno desc , "총연봉" asc;
  
  select name,pay,bonus
  from professor
  where (pay>300 and bonus is  null) or pay>500;
  
  select profno, name, hpage, instr(hpage,'.',1,2) "http"
  from professor
  where instr(hpage,'.',1,2) is not null;
  
  
  select profno, name, substr(email,1,instr(email,'@')-1) eid
  from professor
   where email is not null;
   
   select UPPER(name) "name",LOWER(id) "id",INITCAP(position) "position",length(email) "eid"
   from professor
   where email is not null;
   
   select gname, substr(jumin,1,2) "year", point
   from customer
   
    where point >100000 
    order by point desc;
   
   select name,email,instr(email,'@') "@"
   from professor
   where email is not null;
   
      select name,email,
      substr(email, instr(email,'@')+1,(instr(email,'.')-1)-(instr(email,'@'))) "domain"
   from professor
   where email is not null;
   
   
   select dname, lpad(dname,9,'1234'),
   loc, rpad(loc,9,substr('123456789',length(loc)+1))
   from dept;
   
   
   select gname, jumin, replace(gname,substr(gname,4,3), '337') "337"
   from customer
   where substr(jumin,1,2)<77;
   
  select *
  from dept;
 
  
  
  
  