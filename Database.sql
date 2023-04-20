create table customer
(
custid int primary key auto_increment default 100,
cname varchar(50)not null,
id_proof varchar(50) not null,
mobile_no int not null,
checkin date,
booking_id varchar(50),
booking_date date,
checkout date
);
create table Room
(
room_id int primary key,
category varchar(100),
Rate double(9,2),
status varchar(50)
);
create table Manager
(
manager_id int primary key,
mname varchar(50)
);
create table receptionist
(
recept_id int primary key,
rname varchar(50)
);
create table Staff
(
staff_id int primary key,
sname varchar(50),
designation varchar(100),
salary double (9,2)
);
create table Restaurent
(
food varchar(100),
beverages varchar(100)
);