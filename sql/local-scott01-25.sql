CREATE TABLE card 
(consumerId VARCHAR2(10)
, amount NUMBER(1)
);

CREATE TABLE ticket 
(consumerId VARCHAR2(10)
, countnum NUMBER(1) CHECK(countnum < 5)
);


select * from card;
select * from ticket;

delete from card;
delete from ticket;