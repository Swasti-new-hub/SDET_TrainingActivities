use Narayana_activities;
create table salesman1(salesman_id int,name varchar(20),city varchar(20),commission int,primary key (salesman_id));
insert into salesman1(salesman_id,name,city,commission) values('5001','James Hoog','New York','15');
insert into salesman1(salesman_id,name,city,commission) values('5002','Nail Knite','Paris','13');
insert into salesman1(salesman_id,name,city,commission) values('5005','Pit Alex','London','11');
insert into salesman1(salesman_id,name,city,commission) values('5006','McLyon','Paris','14');
insert into salesman1(salesman_id,name,city,commission) values('5007','Paul Adma','Rome','13');
insert into salesman1(salesman_id,name,city,commission) values('5003','Lausan Hen','Sanjose','12');
insert into salesman1 values('5010','Lausan Hen1','Sanjose1','100'),('5015','Lausan Hen2','Sanjose2','101');
select * from salesman1;
select salesman_id,city from salesman1;
select * from salesman1 where city='paris';
select salesman_id,commission from salesman1 where name='Paul Adma';
Alter table salesman1 add dob date;
Alter table salesman1 drop dob;
-- alter table salesman1 modify column bob year;how we can see the data types?
delete from salesman1  where salesman_id='5005';
select * from salesman1 order by city DESC,commission ASC;
-- select distinct city from salesman1 order by salesman_id;need help in understanding the command
select * from salesman1  where salesman_id between 5001 and 5006;
