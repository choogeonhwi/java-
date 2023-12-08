CREATE TABLE "SCOTT"."BOARDT" 
   ("B_NAME" VARCHAR2(20 BYTE), 
	"B_EMAIL" VARCHAR2(50 BYTE), 
	"B_TITLE" VARCHAR2(80 BYTE), 
	"B_CONTENT" VARCHAR2(3000 BYTE), 
	"B_ID" NUMBER(5,0) primary key,
	"B_DATE" TIMESTAMP (6), 
	"B_HIT" NUMBER(5,0) DEFAULT 0,
     b_pwd varchar2(12),
     "B_IP" varchar2(15));
     
     DROP TABLE "SCOTT"."BOARDT";
     
     DELETE FROM "SCOTT"."BOARDT";
     
     SELECT * FROM "SCOTT"."BOARDT";
     
     
     
    
