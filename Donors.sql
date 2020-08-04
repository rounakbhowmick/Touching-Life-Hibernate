create table donors(FIRSTNAME varchar(40) NOT NULL,lASTNAME varchar(40) NOT NULL,EMAIL varchar(40) NOT NULL,AGE NUMBER(3) NOT NULL,WEIGHT NUMBER(3) NOT NULL,BLOODGROUP varchar(3) NOT NULL,PASSWORD VARCHAR(30) NOT NULL,PHONENUMBER VARCHAR(30) NOT NULL,CITY VARCHAR(20) NOT NULL,AVAILABLE varchar(3) NOT NULL );
select * from donors;
select * from donors where email='rounakchakda@gmail.com'; 

select firstname,lastname,age,weight,bloodgroup,phonenumber,city,available from donors where email='rounakchakda@gmail.com';