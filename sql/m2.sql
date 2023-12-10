UPDATE member2 set name="임영웅", class=2, tel="010-123-4567" where id='bcd';

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

insert into member2 values('jinBear','3333', '조진이', 2, '011-2022-7244');
insert into member2 values('tyBird','ab11', '김태은', 1, '017-293-4874'); 
insert into member2 values('yjWood','abcd', '이은정', 2, '010-923-1245'); 
 
commit;

