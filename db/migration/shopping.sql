----db design---------
create table customer(
id number,
name varchar2(30) not null,
phone number not null,
email varchar2(30) not null unique,
password varchar2(20),
constraint customer_id_pk primary key(id)
);
select *from customer;
create sequence customer_id_seq start with 1 increment by 1;

create table catagory(
id number,
name varchar2(20) not null,
constraint catagory_id_pk primary key(id)
);
select *from catagory;
create sequence catagory_id_seq start with 1 increment by 1;

insert into catagory(id,name) values(catagory_id_seq.nextval,'bike');
insert into catagory(id,name) values(catagory_id_seq.nextval,'mobile');
insert into catagory(id,name) values(catagory_id_seq.nextval,'laptop');
commit;

create table mobile(
id number,
name varchar2(20),
model varchar2(20),
ram number,
storage number,
battery number,
price float,
catagory_id number,
constraint mobile_id_pk primary key(id),
constraint catagory_id_fk foreign key(catagory_id) REFERENCES catagory(id)
);
select *from mobile;
create sequence mobile_id_seq start with 1 increment by 1;

insert into mobile values(mobile_id_seq.nextval,'samsung','galaxy',2,16,2000,10000,2);
insert into mobile values(mobile_id_seq.nextval,'vivo','y83',4,64,3000,15000,2);
insert into mobile values(mobile_id_seq.nextval,'redmi','note5',4,32,4000,16000,2);

commit;
create table bike(
id number,
name varchar2(20),
model varchar2(20),
cc number,
mileage number,
stroke float,
price float,
catagory_id number,
constraint bike_id_pk primary key(id),
constraint catagory_id_fk1 foreign key(catagory_id) REFERENCES catagory(id)
);
select *from bike; 
create sequence bike_id_seq start with 1 increment by 1;

insert into bike values(bike_id_seq.nextval,'Royal Enfield','Thunderbird 350X',350,35,90,100000,1);
insert into bike values(bike_id_seq.nextval,'KTM','125 Duke',200,30,47.2,90000,1);
insert into bike values(bike_id_seq.nextval,'Honda','Dio',110,55,55.6,52000,1);
commit;

create table laptop(
id number,
name varchar2(20),
model varchar2(20),
processor varchar2(20),
ram number,
hard_drive number,
price float,
catagory_id number,
constraint laptop_id_pk primary key(id),
constraint catagory_id_fk2 foreign key(catagory_id) REFERENCES catagory(id)
);
select *from laptop;
create sequence laptop_id_seq start with 1 increment by 1;

insert into laptop values(laptop_id_seq.nextval,'HP','15p','intel',4,1,30000,3);
insert into laptop values(laptop_id_seq.nextval,'Dell','Inspiron','intel',8,1,35000,3);
insert into laptop values(laptop_id_seq.nextval,'Apple','Mac book','intel',8,1,120000,3);
commit;