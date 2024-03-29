CREATE TABLE BOARD (
    ID NUMBER PRIMARY KEY,
    TITLE VARCHAR2(255),
    CONTENT VARCHAR2(1000),
    NICKNAME VARCHAR2(255)
);

CREATE SEQUENCE BOARD_SEQ
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;
    
    INSERT INTO BOARD (ID, TITLE, CONTENT, NICKNAME)
VALUES (BOARD_SEQ.NEXTVAL, '제목', '내용', '닉네임');



CREATE TABLE BOARD (
    SEQ NUMBER PRIMARY KEY,
    SUBJECT VARCHAR2(255),
    CONTENT VARCHAR2(1000),
    NAME VARCHAR2(255),
    REG_DATE DATE DEFAULT SYSDATE,
    READCOUNT NUMBER
);

SELECT NICKNAME as nickname, TITLE, CONTENT, ATTACHMENT
FROM BOARD
WHERE SEQ=#{seq};

INSERT INTO BOARD (NICKNAME, TITLE, CONTENT, ATTACHMENT)
VALUES ('새로운 닉네임', '새로운 제목', '새로운 내용', '첨부파일 경로');    


CREATE TABLE BOARD (
    NICKNAME VARCHAR(255),
    TITLE VARCHAR(255),
    CONTENT VARCHAR(1000),
    ATTACHMENT VARCHAR(255)
);

select * from board;
commit;
drop table board;




