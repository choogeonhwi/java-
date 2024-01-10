create table mvc_board(
bid varchar2(15),
bname number(15) ,
btitle varchar2(15),
bcontent varchar2(15),
bhit varchar2(15)
);



insert into mvc_board(bid,bname,btitle,bcontent,bhit)values(MVC_BOARD_SEQ.NEXTVAL,1,'a');
insert into mvc_board(bid,bname,btitle,bcontent,bhit)values(1,'a','aa','aaa',0);

insert into mvc_board(bname,bp,bcontent)values('a',1,'aaa');
commit;

select * from mvc_board;
select bname,bp,bcontent from mvc_board;
delete from mvc_board;

drop table mvc_board;

CREATE SEQUENCE  MVC_BOARD_SEQ  
MINVALUE 1 MAXVALUE 9999 INCREMENT BY 1 START WITH 1 NOCYCLE ;


create table mvc_member(
mem_uid varchar2(15),
mem_pwd varchar2(15) ,
mem_name varchar2(10)
);

commit;

select * from mvc_member;

insert into mvc_member(mem_uid,mem_pwd,mem_name)values('a','aa','aaa');

drop table mvc_member;