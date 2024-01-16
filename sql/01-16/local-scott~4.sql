DECLARE
i number :=1;
name varchar2(20) := 'kim';
title varchar2(20) := '';

begin
while i<=300 loop
if i mod 2 = 0 then
    name := 'kim' || to_char(i);
    title := 'apple';
elsif i mod 3 = 0 then
    name := 'park' || to_char(i);
    title := 'google';
elsif i mod 5 = 0 then
    name := 'hong' || to_char(i);
    title := 'nvidia';
else
    name := 'shin' || to_char(i);
    title := 'tesla';
end if;
insert into mvc_board VALUES(i,name,i || title, 'content_' || i, sysdate, 0);
i := i+1;
end loop;
end;

