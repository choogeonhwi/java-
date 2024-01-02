
select name, tel, position, pay
,dense_rank() over(partition by 
substr(tel,1,instr(tel,')',1)-1),position ORDER BY pay desc) "R"
from emp2;


select name,birthday,emp_type
, to_char(pay,'999,999,999')
,to_char(
sum(pay) over(partition by emp_type order by pay desc), '999,999,999')
from emp2;


select gname,jumin,to_char(point,'999,999')
,to_char(sum(point) over(partition by substr(jumin,1,2) order by point desc),'999,999,999' 
)"T" 
,round(point/sum(point) over(partition by substr(jumin,1,2))*100, 2)  "%"
from CUSTOMER;

CREATE TABLE PROFESSOR2
(PROFNO NUMBER(8)
,NAME VARCHAR2(30)
,ID VARCHAR2(20)
,POSITION VARCHAR2(50)
,PAY NUMBER(8)
,HIREDATE NUMBER(8)
,BONUS NUMBER(8)
,EMAIL VARCHAR2(100)
,HPAHE VARCHAR2(100)
); 


create table PROFESSOR3
as
select PROFNO,NAME,EMAIL from PROFESSOR;

alter table PROFESSOR3
add(CARD_YN CHAR(1) default 'N');

CREATE TABLE PROFESSOR4 
AS SELECT * FROM PROFESSOR3 
WHERE 1=2;

alter table PROFESSOR3
rename column CARD_YN to CHECK_CARD_YN;

alter table PROFESSOR3
modify(EMAIL  VARCHAR2(100));

alter table PROFESSOR3
drop column CHECK_CARD_YN;

select rowid,e.*
from emp e;

create table emp01
as

select rowid,e.*
from emp e;

select rowid, e.* from emp01 e;

select count(*) from emp01;

insert into emp01
select * from emp01;

insert into emp01(empno,ename)
values(111,'aaa');

select * from emp01
where ename='aaa';

create index index_emp01_ename
on emp01(ename);

drop index index_emp01_ename;

select * from user_tables;

create table NEW_EMP
(NO number(4) PRIMARY KEY
,name varchar2(20) not null
,jumin varchar2(13) not null unique
,LOC_CODE NUMBER(1) CHECK(LOC_CODE < 5)
,DEPTNO VARCHAR2(6) REFERENCES dept2(DCODE)
);

alter table NEW_EMP
add constraint NEW_EMP_NAME_UK UNIQUE(NAME);

select * from NEW_EMP;



create table t_novalidate2
as
SELECT * FROM t_novalidate;

 SELECT * FROM t_novalidate2;
 
 alter table t_novalidate2
add constraint t_novalidate2_NO_PK primary key(NO);

delete from t_novalidate2
where name='DDD';

insert into t_novalidate2 values(1,'DDD');

alter table t_novalidate2
DISABLE NOVALIDATE constraint t_novalidate2_NO_PK;
--enable NOVALIDATE CONSTRAINT

SELECT * FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP';

SELECT *
FROM user_cons_columns
WHERE TABLE_NAME='EMP';


SELECT COLUMN_NAME
FROM user_cons_columns
WHERE TABLE_NAME=(SELECT CONSTRAINT_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP' AND CONSTRAINT_TYPE = 'P');


SELECT CONSTRAINT_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME='EMP';

SELECT * FROM STUDENT2;

DROP TABLE STUDENT2;

CREATE TABLE STUDENT2
(STU_ID CHAR(5) CONSTRAINT STUDENT2_STU_ID_PK PRIMARY KEY
--                CONSTRAINT STUDENT2_STU_ID_CK CHECK(LENGTH(STU_ID)=5)
                CONSTRAINT STUDENT2_STU_ID_CK CHECK(LENGTH(TRIM(''FROM STU_ID))=5)
 ,STU_NAME VARCHAR2(10) CONSTRAINT STUDENT2_STU_NAME_NN NOT NULL
);
--  학생 아이디 필수값, 중복ㅎ용 안됨 길이는 5자리
--학생명은 필수값


INSERT INTO STUDENT2 VALUES('A','ABC');
INSERT INTO STUDENT2 VALUES('A0001','ABC');

INSERT INTO STUDENT2 VALUES('A0002','BCD');



CREATE TABLE SUBJECT2
(SUB_ID CHAR(5) CONSTRAINT SUBJECT2_SUB_ID_PK PRIMARY KEY          
 ,SUB_NAME VARCHAR2(10) CONSTRAINT SUBJECT2_SUB_NAME_NN NOT NULL
);


INSERT INTO SUBJECT2 VALUES(100,'JAVA');

CREATE TABLE SCORE2
(STU_ID CHAR(5) CONSTRAINT SCORE2_STU_ID_NN NOT NULL 
,SUB_ID CHAR(5) CONSTRAINT SCORE2_SUB_ID_NN  NOT NULL 
,SCORE NUMBER(3) CONSTRAINT SCORE2_SCORE_NN  NOT NULL 
 ,GRADE CHAR(1) CONSTRAINT SCORE2_GRADE_CK CHECK(GRADE IN('A','B','C','D','F'))
 ,CONSTRAINT SCORE2_PK PRIMARY KEY (STU_ID,SUB_ID)
 ,CONSTRAINT SCORE2_FK1 FOREIGN KEY (STU_ID) REFERENCES STUDENT2(STU_ID)
 ,CONSTRAINT SCORE2_FK2 FOREIGN KEY (SUB_ID) REFERENCES SUBJECT2(SUB_ID)
);

--테이블 외 데이터 필터링
INSERT INTO SUBJECT2 VALUES(100,'JAVA');
INSERT INTO STUDENT2 VALUES('A0002','BCD');
INSERT INTO SCORE2 VALUES('A0001',100,100,'A');
commit;

CREATE TABLE SCORE2
(STU_ID CHAR(5) CONSTRAINT SCORE2_STU_ID_NN NOT NULL 
,SUB_ID CHAR(5) CONSTRAINT SCORE2_SUB_ID_NN  NOT NULL 
,SCORE NUMBER(3) CONSTRAINT SCORE2_SCORE_NN  NOT NULL 
 ,GRADE CHAR(1) CONSTRAINT SCORE2_GRADE_CK CHECK(GRADE IN('A','B','C','D','F'))
 ,CONSTRAINT SCORE2_PK PRIMARY KEY (STU_ID,SUB_ID)
 ,CONSTRAINT SCORE2_FK1 FOREIGN KEY (STU_ID) REFERENCES STUDENT2(STU_ID)ON DELETE CASCADE
 ,CONSTRAINT SCORE2_FK2 FOREIGN KEY (SUB_ID) REFERENCES SUBJECT2(SUB_ID)ON DELETE CASCADE
 
);
INSERT INTO SUBJECT2 VALUES(100,'JAVA');
INSERT INTO STUDENT2 VALUES('A0002','BCD');
INSERT INTO SCORE2 VALUES('A0002',100,150,'B');

rollback;

commit;

SELECT * FROM SCORE2;

delete from STUDENT2;
delete from SUBJECT2;
delete from SCORE2;

DROP TABLE SCORE2;

COMMIT;





TRUNCATE TABLE PROFESSOR2;

select * from CUSTOMER;