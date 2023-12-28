
select *
from item;
select name, price, description from item;

commit;

drop table item;

CREATE table item(
 NAME           VARCHAR2(20)  
,PRICE          NUMBER(8)      
,DESCRIPTION    VARCHAR2(100) 
);
insert into item(NAME,PRICE,DESCRIPTION) values('name','price','description');
insert into item(NAME, PRICE,DESCRIPTION) values('¿¿','¿¿','¿¿');
