declare
i number :=1;
 name varchar2(20) := 'kim';
 sal number :=0;
 begin
 while i<= 1000000 loop
 if i mod 2 = 0 then
 name := 'kim' || to_char(i);
 sal := 300;
 elsif i mod 3 = 0 then
  name := 'park' || to_char(i);
  sal := 400;
  elsif i mod 5 = 0 then
  name := 'hong' || to_char(i);
  sal := 500;
  
else
  name := 'shin' || to_char(i);
  sal := 250;
  end if;
insert into emp3 values(i,name,sal);
i :=i+1;    
 end loop;
 
 end;
 
 commit;