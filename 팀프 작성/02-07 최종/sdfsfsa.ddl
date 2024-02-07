-- 생성자 Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   위치:        2024-02-07 10:09:06 KST
--   사이트:      Oracle Database 11g
--   유형:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE
  CREATE TABLE dog (
    dog_id           VARCHAR2(30) NOT NULL,
    member_mem_id    VARCHAR2(20) NOT NULL,
    member_mem_nname VARCHAR2(20) NOT NULL,
    dog_name         VARCHAR2(30),
    dog_age          VARCHAR2(10),
    dog_kind         VARCHAR2(50),
    dog_bir          VARCHAR2(20),
    dog_gender       VARCHAR2(10),
    dog_file_name1   VARCHAR2(100),
    dog_file_name2   VARCHAR2(100),
    dog_file_ext     VARCHAR2(10),
    dog_file_byte    NUMBER
);
CREATE TABLE board (
    board_id         VARCHAR2(10) NOT NULL,
    member_mem_id    VARCHAR2(20) NOT NULL,
    member_mem_nname VARCHAR2(20) NOT NULL,
    board_title      VARCHAR2(50) NOT NULL,
    board_desc       VARCHAR2(500) NOT NULL,
    board_cate       VARCHAR2(20),
    board_date       VARCHAR2(20),
    board_view       NUMBER,
    board_img_name1  VARCHAR2(100),
    board_img_name2  VARCHAR2(100),
    board_img_ext    VARCHAR2(10),
    board_img_byte   NUMBER
);

ALTER TABLE board ADD CONSTRAINT board_pk PRIMARY KEY ( board_id );
commit;

CREATE TABLE BOARD_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,BOARD_ID VARCHAR2 (10) NOT NULL
 ,MEMBER_MEM_ID VARCHAR2 (20) NOT NULL
 ,MEMBER_MEM_NNAME VARCHAR2 (20) NOT NULL
 ,BOARD_TITLE VARCHAR2 (50) NOT NULL
 ,BOARD_DESC VARCHAR2 (500) NOT NULL
 ,BOARD_CATE VARCHAR2 (20)
 ,BOARD_DATE VARCHAR2 (20)
 ,BOARD_VIEW NUMBER
 ,BOARD_IMG_NAME1 VARCHAR2 (100)
 ,BOARD_IMG_NAME2 VARCHAR2 (100)
 ,BOARD_IMG_EXT VARCHAR2 (10)
 ,BOARD_IMG_BYTE NUMBER
 );

CREATE OR REPLACE TRIGGER BOARD_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON BOARD for each row 
 Declare 
  rec BOARD_JN%ROWTYPE; 
  blank BOARD_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.BOARD_ID := :NEW.BOARD_ID; 
      rec.MEMBER_MEM_ID := :NEW.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :NEW.MEMBER_MEM_NNAME; 
      rec.BOARD_TITLE := :NEW.BOARD_TITLE; 
      rec.BOARD_DESC := :NEW.BOARD_DESC; 
      rec.BOARD_CATE := :NEW.BOARD_CATE; 
      rec.BOARD_DATE := :NEW.BOARD_DATE; 
      rec.BOARD_VIEW := :NEW.BOARD_VIEW; 
      rec.BOARD_IMG_NAME1 := :NEW.BOARD_IMG_NAME1; 
      rec.BOARD_IMG_NAME2 := :NEW.BOARD_IMG_NAME2; 
      rec.BOARD_IMG_EXT := :NEW.BOARD_IMG_EXT; 
      rec.BOARD_IMG_BYTE := :NEW.BOARD_IMG_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.BOARD_ID := :OLD.BOARD_ID; 
      rec.MEMBER_MEM_ID := :OLD.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :OLD.MEMBER_MEM_NNAME; 
      rec.BOARD_TITLE := :OLD.BOARD_TITLE; 
      rec.BOARD_DESC := :OLD.BOARD_DESC; 
      rec.BOARD_CATE := :OLD.BOARD_CATE; 
      rec.BOARD_DATE := :OLD.BOARD_DATE; 
      rec.BOARD_VIEW := :OLD.BOARD_VIEW; 
      rec.BOARD_IMG_NAME1 := :OLD.BOARD_IMG_NAME1; 
      rec.BOARD_IMG_NAME2 := :OLD.BOARD_IMG_NAME2; 
      rec.BOARD_IMG_EXT := :OLD.BOARD_IMG_EXT; 
      rec.BOARD_IMG_BYTE := :OLD.BOARD_IMG_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into BOARD_JN VALUES rec; 
  END; 
  


ALTER TABLE dog ADD CONSTRAINT dog_pk PRIMARY KEY ( dog_id );


CREATE TABLE DOG_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,DOG_ID VARCHAR2 (30) NOT NULL
 ,MEMBER_MEM_ID VARCHAR2 (20) NOT NULL
 ,MEMBER_MEM_NNAME VARCHAR2 (20) NOT NULL
 ,DOG_NAME VARCHAR2 (30)
 ,DOG_AGE VARCHAR2 (10)
 ,DOG_KIND VARCHAR2 (50)
 ,DOG_BIR VARCHAR2 (20)
 ,DOG_GENDER VARCHAR2 (10)
 ,DOG_FILE_NAME1 VARCHAR2 (100)
 ,DOG_FILE_NAME2 VARCHAR2 (100)
 ,DOG_FILE_EXT VARCHAR2 (10)
 ,DOG_FILE_BYTE NUMBER
 );

CREATE OR REPLACE TRIGGER DOG_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON DOG for each row 
 Declare 
  rec DOG_JN%ROWTYPE; 
  blank DOG_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.DOG_ID := :NEW.DOG_ID; 
      rec.MEMBER_MEM_ID := :NEW.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :NEW.MEMBER_MEM_NNAME; 
      rec.DOG_NAME := :NEW.DOG_NAME; 
      rec.DOG_AGE := :NEW.DOG_AGE; 
      rec.DOG_KIND := :NEW.DOG_KIND; 
      rec.DOG_BIR := :NEW.DOG_BIR; 
      rec.DOG_GENDER := :NEW.DOG_GENDER; 
      rec.DOG_FILE_NAME1 := :NEW.DOG_FILE_NAME1; 
      rec.DOG_FILE_NAME2 := :NEW.DOG_FILE_NAME2; 
      rec.DOG_FILE_EXT := :NEW.DOG_FILE_EXT; 
      rec.DOG_FILE_BYTE := :NEW.DOG_FILE_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.DOG_ID := :OLD.DOG_ID; 
      rec.MEMBER_MEM_ID := :OLD.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :OLD.MEMBER_MEM_NNAME; 
      rec.DOG_NAME := :OLD.DOG_NAME; 
      rec.DOG_AGE := :OLD.DOG_AGE; 
      rec.DOG_KIND := :OLD.DOG_KIND; 
      rec.DOG_BIR := :OLD.DOG_BIR; 
      rec.DOG_GENDER := :OLD.DOG_GENDER; 
      rec.DOG_FILE_NAME1 := :OLD.DOG_FILE_NAME1; 
      rec.DOG_FILE_NAME2 := :OLD.DOG_FILE_NAME2; 
      rec.DOG_FILE_EXT := :OLD.DOG_FILE_EXT; 
      rec.DOG_FILE_BYTE := :OLD.DOG_FILE_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into DOG_JN VALUES rec; 
  END; 
  /CREATE TABLE gat_chat (
    gathering_gat_id VARCHAR2(30) NOT NULL,
    member_mem_id    VARCHAR2(20) NOT NULL,
    member_mem_nname VARCHAR2(20) NOT NULL,
    gat_chat_desc    VARCHAR2(50) NOT NULL,
    gat_chat_date    VARCHAR2(20)
);


CREATE TABLE GAT_CHAT_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,GATHERING_GAT_ID VARCHAR2 (30) NOT NULL
 ,MEMBER_MEM_ID VARCHAR2 (20) NOT NULL
 ,MEMBER_MEM_NNAME VARCHAR2 (20) NOT NULL
 ,GAT_CHAT_DESC VARCHAR2 (50) NOT NULL
 ,GAT_CHAT_DATE VARCHAR2 (20)
 );

CREATE OR REPLACE TRIGGER GAT_CHAT_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON GAT_CHAT for each row 
 Declare 
  rec GAT_CHAT_JN%ROWTYPE; 
  blank GAT_CHAT_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.GATHERING_GAT_ID := :NEW.GATHERING_GAT_ID; 
      rec.MEMBER_MEM_ID := :NEW.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :NEW.MEMBER_MEM_NNAME; 
      rec.GAT_CHAT_DESC := :NEW.GAT_CHAT_DESC; 
      rec.GAT_CHAT_DATE := :NEW.GAT_CHAT_DATE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.GATHERING_GAT_ID := :OLD.GATHERING_GAT_ID; 
      rec.MEMBER_MEM_ID := :OLD.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :OLD.MEMBER_MEM_NNAME; 
      rec.GAT_CHAT_DESC := :OLD.GAT_CHAT_DESC; 
      rec.GAT_CHAT_DATE := :OLD.GAT_CHAT_DATE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into GAT_CHAT_JN VALUES rec; 
  END; 
  /CREATE TABLE gat_members (
    gathering_gat_id VARCHAR2(30) NOT NULL,
    member_mem_id    VARCHAR2(20) NOT NULL,
    member_mem_nname VARCHAR2(20) NOT NULL
);


CREATE TABLE GAT_MEMBERS_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,GATHERING_GAT_ID VARCHAR2 (30) NOT NULL
 ,MEMBER_MEM_ID VARCHAR2 (20) NOT NULL
 ,MEMBER_MEM_NNAME VARCHAR2 (20) NOT NULL
 );

CREATE OR REPLACE TRIGGER GAT_MEMBERS_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON GAT_MEMBERS for each row 
 Declare 
  rec GAT_MEMBERS_JN%ROWTYPE; 
  blank GAT_MEMBERS_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.GATHERING_GAT_ID := :NEW.GATHERING_GAT_ID; 
      rec.MEMBER_MEM_ID := :NEW.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :NEW.MEMBER_MEM_NNAME; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.GATHERING_GAT_ID := :OLD.GATHERING_GAT_ID; 
      rec.MEMBER_MEM_ID := :OLD.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :OLD.MEMBER_MEM_NNAME; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into GAT_MEMBERS_JN VALUES rec; 
  END; 
  /CREATE TABLE gat_plan (
    gat_plan_id      VARCHAR2(10) NOT NULL,
    gat_plan_leader  VARCHAR2(20),
    gathering_gat_id VARCHAR2(10) NOT NULL,
    gat_plan_date    VARCHAR2(20),
    gat_plan_addr    VARCHAR2(100),
    gat_plan_title   VARCHAR2(50),
    gat_plan_desc    VARCHAR2(300)
);

ALTER TABLE gat_plan ADD CONSTRAINT gat_plan_pk PRIMARY KEY ( gat_plan_id );


CREATE TABLE GAT_PLAN_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,GAT_PLAN_ID VARCHAR2 (10) NOT NULL
 ,GAT_PLAN_LEADER VARCHAR2 (20)
 ,GATHERING_GAT_ID VARCHAR2 (10) NOT NULL
 ,GAT_PLAN_DATE VARCHAR2 (20)
 ,GAT_PLAN_ADDR VARCHAR2 (100)
 ,GAT_PLAN_TITLE VARCHAR2 (50)
 ,GAT_PLAN_DESC VARCHAR2 (300)
 );

CREATE OR REPLACE TRIGGER GAT_PLAN_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON GAT_PLAN for each row 
 Declare 
  rec GAT_PLAN_JN%ROWTYPE; 
  blank GAT_PLAN_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.GAT_PLAN_ID := :NEW.GAT_PLAN_ID; 
      rec.GAT_PLAN_LEADER := :NEW.GAT_PLAN_LEADER; 
      rec.GATHERING_GAT_ID := :NEW.GATHERING_GAT_ID; 
      rec.GAT_PLAN_DATE := :NEW.GAT_PLAN_DATE; 
      rec.GAT_PLAN_ADDR := :NEW.GAT_PLAN_ADDR; 
      rec.GAT_PLAN_TITLE := :NEW.GAT_PLAN_TITLE; 
      rec.GAT_PLAN_DESC := :NEW.GAT_PLAN_DESC; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.GAT_PLAN_ID := :OLD.GAT_PLAN_ID; 
      rec.GAT_PLAN_LEADER := :OLD.GAT_PLAN_LEADER; 
      rec.GATHERING_GAT_ID := :OLD.GATHERING_GAT_ID; 
      rec.GAT_PLAN_DATE := :OLD.GAT_PLAN_DATE; 
      rec.GAT_PLAN_ADDR := :OLD.GAT_PLAN_ADDR; 
      rec.GAT_PLAN_TITLE := :OLD.GAT_PLAN_TITLE; 
      rec.GAT_PLAN_DESC := :OLD.GAT_PLAN_DESC; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into GAT_PLAN_JN VALUES rec; 
  END; 
  /CREATE TABLE gathering (
    gat_id           VARCHAR2(30) NOT NULL,
    member_mem_id    VARCHAR2(20) NOT NULL,
    member_mem_nname VARCHAR2(20) NOT NULL,
    gat_title        VARCHAR2(50) NOT NULL,
    gat_desc         VARCHAR2(500) NOT NULL,
    gat_date         VARCHAR2(20),
    gat_view         NUMBER,
    gat_memnum       NUMBER,
    gat_location1    VARCHAR2(20) NOT NULL,
    gat_location2    VARCHAR2(20) NOT NULL,
    gat_img_name1    VARCHAR2(100),
    gat_img_name2    VARCHAR2(100),
    gat_img_ext      VARCHAR2(10),
    gat_img_byte     NUMBER
);

ALTER TABLE gathering ADD CONSTRAINT gathering_pk PRIMARY KEY ( gat_id );


CREATE TABLE GATHERING_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,GAT_ID VARCHAR2 (30) NOT NULL
 ,MEMBER_MEM_ID VARCHAR2 (20) NOT NULL
 ,MEMBER_MEM_NNAME VARCHAR2 (20) NOT NULL
 ,GAT_TITLE VARCHAR2 (50) NOT NULL
 ,GAT_DESC VARCHAR2 (500) NOT NULL
 ,GAT_DATE VARCHAR2 (20)
 ,GAT_VIEW NUMBER
 ,GAT_MEMNUM NUMBER
 ,GAT_LOCATION1 VARCHAR2 (20) NOT NULL
 ,GAT_LOCATION2 VARCHAR2 (20) NOT NULL
 ,GAT_IMG_NAME1 VARCHAR2 (100)
 ,GAT_IMG_NAME2 VARCHAR2 (100)
 ,GAT_IMG_EXT VARCHAR2 (10)
 ,GAT_IMG_BYTE NUMBER
 );

CREATE OR REPLACE TRIGGER GATHERING_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON GATHERING for each row 
 Declare 
  rec GATHERING_JN%ROWTYPE; 
  blank GATHERING_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.GAT_ID := :NEW.GAT_ID; 
      rec.MEMBER_MEM_ID := :NEW.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :NEW.MEMBER_MEM_NNAME; 
      rec.GAT_TITLE := :NEW.GAT_TITLE; 
      rec.GAT_DESC := :NEW.GAT_DESC; 
      rec.GAT_DATE := :NEW.GAT_DATE; 
      rec.GAT_VIEW := :NEW.GAT_VIEW; 
      rec.GAT_MEMNUM := :NEW.GAT_MEMNUM; 
      rec.GAT_LOCATION1 := :NEW.GAT_LOCATION1; 
      rec.GAT_LOCATION2 := :NEW.GAT_LOCATION2; 
      rec.GAT_IMG_NAME1 := :NEW.GAT_IMG_NAME1; 
      rec.GAT_IMG_NAME2 := :NEW.GAT_IMG_NAME2; 
      rec.GAT_IMG_EXT := :NEW.GAT_IMG_EXT; 
      rec.GAT_IMG_BYTE := :NEW.GAT_IMG_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.GAT_ID := :OLD.GAT_ID; 
      rec.MEMBER_MEM_ID := :OLD.MEMBER_MEM_ID; 
      rec.MEMBER_MEM_NNAME := :OLD.MEMBER_MEM_NNAME; 
      rec.GAT_TITLE := :OLD.GAT_TITLE; 
      rec.GAT_DESC := :OLD.GAT_DESC; 
      rec.GAT_DATE := :OLD.GAT_DATE; 
      rec.GAT_VIEW := :OLD.GAT_VIEW; 
      rec.GAT_MEMNUM := :OLD.GAT_MEMNUM; 
      rec.GAT_LOCATION1 := :OLD.GAT_LOCATION1; 
      rec.GAT_LOCATION2 := :OLD.GAT_LOCATION2; 
      rec.GAT_IMG_NAME1 := :OLD.GAT_IMG_NAME1; 
      rec.GAT_IMG_NAME2 := :OLD.GAT_IMG_NAME2; 
      rec.GAT_IMG_EXT := :OLD.GAT_IMG_EXT; 
      rec.GAT_IMG_BYTE := :OLD.GAT_IMG_BYTE; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into GATHERING_JN VALUES rec; 
  END; 
  /CREATE TABLE member (
    mem_id      VARCHAR2(20) NOT NULL,
    mem_pw      VARCHAR2(20) NOT NULL,
    mem_name    VARCHAR2(20) NOT NULL,
    mem_nname   VARCHAR2(20) NOT NULL,
    mem_email   VARCHAR2(30) NOT NULL,
    mem_addr1   VARCHAR2(100) NOT NULL,
    mem_addr2   VARCHAR2(50) NOT NULL,
    mem_num     VARCHAR2(15) NOT NULL,
    mem_bir     VARCHAR2(20),
    mem_gender  VARCHAR2(10),
    mem_gat1_id VARCHAR2(10),
    mem_gat2_id VARCHAR2(10),
    mem_gat3_id VARCHAR2(10)
);

ALTER TABLE member ADD CONSTRAINT member_pk PRIMARY KEY ( mem_id,
                                                          mem_nname );


CREATE TABLE MEMBER_JN
 (JN_OPERATION CHAR(3) NOT NULL
 ,JN_ORACLE_USER VARCHAR2(30) NOT NULL
 ,JN_DATETIME DATE NOT NULL
 ,JN_NOTES VARCHAR2(240)
 ,JN_APPLN VARCHAR2(35)
 ,JN_SESSION NUMBER(38)
 ,MEM_ID VARCHAR2 (20) NOT NULL
 ,MEM_PW VARCHAR2 (20) NOT NULL
 ,MEM_NAME VARCHAR2 (20) NOT NULL
 ,MEM_NNAME VARCHAR2 (20) NOT NULL
 ,MEM_EMAIL VARCHAR2 (30) NOT NULL
 ,MEM_ADDR1 VARCHAR2 (100) NOT NULL
 ,MEM_ADDR2 VARCHAR2 (50) NOT NULL
 ,MEM_NUM VARCHAR2 (15) NOT NULL
 ,MEM_BIR VARCHAR2 (20)
 ,MEM_GENDER VARCHAR2 (10)
 ,MEM_GAT1_ID VARCHAR2 (10)
 ,MEM_GAT2_ID VARCHAR2 (10)
 ,MEM_GAT3_ID VARCHAR2 (10)
 );

CREATE OR REPLACE TRIGGER MEMBER_JNtrg
  AFTER 
  INSERT OR 
  UPDATE OR 
  DELETE ON MEMBER for each row 
 Declare 
  rec MEMBER_JN%ROWTYPE; 
  blank MEMBER_JN%ROWTYPE; 
  BEGIN 
    rec := blank; 
    IF INSERTING OR UPDATING THEN 
      rec.MEM_ID := :NEW.MEM_ID; 
      rec.MEM_PW := :NEW.MEM_PW; 
      rec.MEM_NAME := :NEW.MEM_NAME; 
      rec.MEM_NNAME := :NEW.MEM_NNAME; 
      rec.MEM_EMAIL := :NEW.MEM_EMAIL; 
      rec.MEM_ADDR1 := :NEW.MEM_ADDR1; 
      rec.MEM_ADDR2 := :NEW.MEM_ADDR2; 
      rec.MEM_NUM := :NEW.MEM_NUM; 
      rec.MEM_BIR := :NEW.MEM_BIR; 
      rec.MEM_GENDER := :NEW.MEM_GENDER; 
      rec.MEM_GAT1_ID := :NEW.MEM_GAT1_ID; 
      rec.MEM_GAT2_ID := :NEW.MEM_GAT2_ID; 
      rec.MEM_GAT3_ID := :NEW.MEM_GAT3_ID; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      IF INSERTING THEN 
        rec.JN_OPERATION := 'INS'; 
      ELSIF UPDATING THEN 
        rec.JN_OPERATION := 'UPD'; 
      END IF; 
    ELSIF DELETING THEN 
      rec.MEM_ID := :OLD.MEM_ID; 
      rec.MEM_PW := :OLD.MEM_PW; 
      rec.MEM_NAME := :OLD.MEM_NAME; 
      rec.MEM_NNAME := :OLD.MEM_NNAME; 
      rec.MEM_EMAIL := :OLD.MEM_EMAIL; 
      rec.MEM_ADDR1 := :OLD.MEM_ADDR1; 
      rec.MEM_ADDR2 := :OLD.MEM_ADDR2; 
      rec.MEM_NUM := :OLD.MEM_NUM; 
      rec.MEM_BIR := :OLD.MEM_BIR; 
      rec.MEM_GENDER := :OLD.MEM_GENDER; 
      rec.MEM_GAT1_ID := :OLD.MEM_GAT1_ID; 
      rec.MEM_GAT2_ID := :OLD.MEM_GAT2_ID; 
      rec.MEM_GAT3_ID := :OLD.MEM_GAT3_ID; 
      rec.JN_DATETIME := SYSDATE; 
      rec.JN_ORACLE_USER := SYS_CONTEXT ('USERENV', 'SESSION_USER'); 
      rec.JN_APPLN := SYS_CONTEXT ('USERENV', 'MODULE'); 
      rec.JN_SESSION := SYS_CONTEXT ('USERENV', 'SESSIONID'); 
      rec.JN_OPERATION := 'DEL'; 
    END IF; 
    INSERT into MEMBER_JN VALUES rec; 
  END; 
  /ALTER TABLE board
    ADD CONSTRAINT board_member_fk FOREIGN KEY ( member_mem_id,
                                                 member_mem_nname )
        REFERENCES member ( mem_id,
                            mem_nname );

ALTER TABLE dog
    ADD CONSTRAINT dog_member_fk FOREIGN KEY ( member_mem_id,
                                               member_mem_nname )
        REFERENCES member ( mem_id,
                            mem_nname );

ALTER TABLE gat_chat
    ADD CONSTRAINT gat_chat_gathering_fk FOREIGN KEY ( gathering_gat_id )
        REFERENCES gathering ( gat_id );

ALTER TABLE gat_chat
    ADD CONSTRAINT gat_chat_member_fk FOREIGN KEY ( member_mem_id,
                                                    member_mem_nname )
        REFERENCES member ( mem_id,
                            mem_nname );

ALTER TABLE gat_members
    ADD CONSTRAINT gat_members_gathering_fk FOREIGN KEY ( gathering_gat_id )
        REFERENCES gathering ( gat_id );

ALTER TABLE gat_members
    ADD CONSTRAINT gat_members_member_fk FOREIGN KEY ( member_mem_id,
                                                       member_mem_nname )
        REFERENCES member ( mem_id,
                            mem_nname );

ALTER TABLE gat_plan
    ADD CONSTRAINT gat_plan_gathering_fk FOREIGN KEY ( gathering_gat_id )
        REFERENCES gathering ( gat_id );

ALTER TABLE gathering
    ADD CONSTRAINT gathering_member_fk FOREIGN KEY ( member_mem_id,
                                                     member_mem_nname )
        REFERENCES member ( mem_id,
                            mem_nname );



-- Oracle SQL Developer Data Modeler 요약 보고서: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
