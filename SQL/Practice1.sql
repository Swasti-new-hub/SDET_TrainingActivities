use Narayana_activities;
-- Create a table
create table TEST(
   id INT NOT NULL AUTO_INCREMENT,
   Username VARCHAR(100) NOT NULL,
   salary VARCHAR(40) NOT NULL,
   joindate DATE,
   PRIMARY KEY ( id )
);
Select * from TEST;
INSERT into TEST (username,salary,joindate)Values('Test1','2000','2019-01-30');
INSERT into TEST (username,salary,joindate)Values('Test2','2000','2019-02-01');
INSERT into TEST (username,salary,joindate)Values('Test3','2000','2019-02-01');
INSERT into TEST (username,salary,joindate)Values('Test3','2000','2019-02-01');
Select username from TEST;
Select distinct salary from TEST;
Select distinct joindate from TEST;
Select joindate,salary from TEST where username='Test1';
                   