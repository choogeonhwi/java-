create table mem
(mem_uid  varchar2(15)
,mem_pwd varchar2(15)
,mem_name varchar2(10)

);

create table mvc_board(
bid varchar2(15),
bname varchar2(15) ,
btitle varchar2(15),
bcontent varchar2(15),
bdate DATE DEFAULT SYSDATE,
bhit varchar2(15)
);

insert into mvc_board(bid,bname,btitle,bcontent,bdate,bhit)
values (Mvc_board_seq.nextval,#{param1},#{param2},#{param3},0);

drop table mvc_board;
commit;
select * from mvc_board;