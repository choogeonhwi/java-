SELECT * from member23;

create table member23 (
id varchar2(20) primary key,
pw varchar2(20),
name varchar2(20),
class number(2),
tel varchar2(20)
);

insert into member23 values('jinBear','3333', '조진이', 2, '011-2022-7244');
insert into member23 values('tyBird','ab11', '김태은', 1, '017-293-4874'); 
insert into member23 values('yjWood','abcd', '이은정', 2, '010-923-1245'); 
 

commit;

drop table memberT;

DELETE from memberT;

SELECT * from memberT;

create table memberT (
mem_uid varchar2(20) primary key,
mem_pwd varchar2(20) not null,
mem_name varchar2(20)not null,
mem_email varchar2(20),
mem_addr varchar2(20)
);




INSERT INTO memberT VALUES('aaaa','1234','abcd','a@a.com','busan');

SELECT * FROM memberT WHERE mem_uid=?

SELECT mem_pwd FROM memberT WHERE mem_uid=?

SELECT mem_uid, mem_pwd, mem_name, mem_email, mem_addr"
				+ " FROM memberT WHERE mem_uid=?
                
                UPDATE memberT SET mem_pwd=?, mem_email=?, mem_addr=? WHERE mem_uid=?