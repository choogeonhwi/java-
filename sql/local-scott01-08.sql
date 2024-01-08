create table mvc_board(
bid number(4) primary key,
bname varchar2(20),
btitle varchar2(100),
bcontent varchar2(300),
bdate date default sysdate,
bhit number(4) default 0
);



insert into mvc_board(bid,bname,btitle,bcontent,bhit)values(MVC_BOARD_SEQ.NEXTVAL,?,?,?,0);
insert into mvc_board(bid,bname,btitle,bcontent,bhit)values(1,'a','aa','aaa',0);
commit;

select bid, bname, btitle, bcontent, bhit from mvc_board;

delete from mvc_board;

drop table mvc_board;

CREATE SEQUENCE  MVC_BOARD_SEQ  
MINVALUE 1 MAXVALUE 9999 INCREMENT BY 1 START WITH 1 NOCYCLE ;