UPDATE member2 set name="�ӿ���", class=2, tel="010-123-4567" where id='bcd';

SELECT NAME, CLASS, TEL FROM MEMBER2 WHERE ID='bcd';
commit;
delete from MEMBER2 where id='ahn';
delete from member2;
SELECT * from member2;


create table member2 (
id varchar2(20) primary key,
pw varchar2(20),
name varchar2(20),
class number(2),
tel varchar2(20)
);

insert into member2 values('jinBear','3333', '������', 2, '011-2022-7244');
insert into member2 values('tyBird','ab11', '������', 1, '017-293-4874'); 
insert into member2 values('yjWood','abcd', '������', 2, '010-923-1245'); 
 
commit;

