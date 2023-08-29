create database ProLearn

create table Country(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table City(
Id int identity primary key not null,
Name nvarchar(50) not null,
CountryId int foreign key references Country(Id) not null)

create table Region(
Id int identity primary key not null,
Name nvarchar(50) not null,
CityId int foreign key references City(id) not null)

create table WorkStatus(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table Marketplace(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table Discount(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table Poll(
Id int identity primary key not null,
Name nvarchar(20) not null)

create table CardType(
Id int identity primary key not null,
Name nvarchar(30) not null)

create table WorkColor(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table PositionCategory(
Id int identity primary key not null,
Name nvarchar(60) not null)

create table SubjectCategory(
Id int identity primary key not null,
Name nvarchar(50) not null)

create table Subjects(
Id int identity primary key not null,
Name nvarchar(70) not null,
SubjectCategoryId int foreign key references SubjectCategory(Id))

insert into Country(Name)
values('Uzbekistan Respublikasi'),
('Qozogiston Respublikasi'),
('Turkmaniston Respublikasi'),
('Qirgiziston Respublikasi'),
('Tojikiston Respublikasi'),
('Afgoniston Respublikasi'),
('Rossiya Federatsiyasi')

insert into City
values ('Andijon viloyati',1),
('Buxoro viloyati',1),
('Jizzax viloyati',1),
('Qashqadaryo viloyati',1),
('Navoiy viloyati',1),
('Namangan viloyati',1),
('Samarqand viloyati',1),
('Surxandaryo viloyati',1),
('Sirdaro viloyati',1),
('Toshkent viloyati',1),
('Toshkent shahar',1),
('Fargona viloyati',1),
('Xorazm viloyati',1),
('Qoraqalpogiston Respublikasi',1)


insert into Region
values ('Andijon tumani',1),
('Asaka tumani',1),
('Baliqchi tumani',1),
('Boz tumani',1),
('Buloqboshi tumani',1),
('Jalalquduq tumani',1),
('Izboskan tumani',1),
('Qorgontepa tumani',1),
('Marhamat tumani',1),
('Oltinkol tumani',1),
('Paxtaobod tumani',1),
('Ulungor tumani',1),
('Xonobod tumani',1),
('Xojaobod tumani',1),
('Shaxrixon tumani',1),
('Andijon shahri',1)

insert into Region
values ('Buxoro shahri',2),
('Buxoro tumani',2),
('Vopkent tumani',2),
('Gijduvon tumani',2),
('Jondor tumani',2),
('Kogon tumani',2),
('Kogon shahri',2),
('Qorakol tumani',2),
('Qoravulbozor tumani',2),
('Olot tumani',2),
('Peshku tumani',2),
('Romitan tumani',2),
('Shofirkon tumani',2)

insert into Region
values ('Jizzax shahri',3),
('Jizzax tumani',3),
('Arnasoy tumani',3),
('Baxmal tumani',3),
('Gallaorol tumani',3),
('Dostlik tumani',3),
('Zarbdor shahri',3),
('Zafarobod tumani',3),
('Zomin tumani',3),
('Mirzachol tumani',3),
('Paxtakor tumani',3),
('Forish tumani',3),
('Yangiobod tumani',3)

insert into Region
values ('Qarshi shahri',4),
('Qarshi tumani',4),
('Dehqonobod tumani',4),
('Qamashi tumani',4),
('Kasbi tumani',4),
('Kitob tumani',4),
('Koson shahri',4),
('Mirishkor tumani',4),
('Muborak tumani',4),
('Nishon tumani',4),
('Chiroqchi tumani',4),
('Shahrisabz shahri',4),
('Shahrisabz tumani',4),
('Yakkabog tumani',4),
('Guzor tumani',4)

insert into Region
values ('Navoi shahri',5),
('Navoi tumani',5),
('Zarafshon shahri',5),
('Zarafshon tumani',5),
('Qiziltepa tumani',5),
('Konimex tumani',5),
('Navbahor shahri',5),
('Nurota tumani',5),
('Tomdi tumani',5),
('Uchquduq tumani',5),
('Xatirchi tumani',5)

insert into Region
values ('Namangan shahri',6),
('Namangan tumani',6),
('Kosonsoy tumani',6),
('Mingbuloq tumani',6),
('Norin tumani',6),
('Pop tumani',6),
('Turaqurgon tumani',6),
('Uychi tumani',6),
('Uchqorgon tumani',6),
('Chortoq tumani',6),
('Chust tumani',6),
('Yangiqorgon tumani',6)

insert into Region
values ('Samarqand shahar',7),
('Samarqand tumani',7),
('Oqdaryo tumani',7),
('Bulungur tumani',7),
('Jomboy tumani',7),
('Ishtixon tumani',7),
('Kattaqorgon shahri',7),
('Kattaqorgon tumani',7),
('Qushrabot tumani',7),
('Narpay tumani',7),
('Nurobod tumani',7),
('Payariq tumani',7),
('Pastdargon tumani',7),
('Paxtachi tumani',7),
('Tayloq tumani',7),
('Urgut tumani',7)

insert into Region
values ('Surxandaryo shahar',8),
('Surxandaryo tumani',8),
('Oltinsoy tumani',8),
('Angor tumani',8),
('Boysun tumani',8),
('Denov tumani',8),
('Jarqorgon tumani',8),
('Qiziriq tumani',8),
('Qumqorgon tumani',8),
('Muzrabot tumani',8),
('Sariosiyo tumani',8),
('Termiz shahri',8),
('Termiz tumani',8),
('Uzun tumani',8),
('Sherobod tumani',8),
('Shorchi tumani',8)

insert into Region
values ('Guliston shahar',9),
('Guliston tumani',9),
('Oq oltin tumani',9),
('Boyovut tumani',9),
('Mirzaobod tumani',9),
('Sayxunobod tumani',9),
('Sardoba tumani',9),
('Sirdaryo tumani',9),
('Xavast tumani',9),
('Shirin shahri',9),
('Shirin tumani',9),
('Yangiyer shahri',9),
('Yangiyer tumani',9)

insert into Region
values ('Guliston shahar',9),
('Guliston tumani',9),
('Oq oltin tumani',9),
('Boyovut tumani',9),
('Mirzaobod tumani',9),
('Sayxunobod tumani',9),
('Sardoba tumani',9),
('Sirdaryo tumani',9),
('Xavast tumani',9),
('Shirin shahri',9),
('Shirin tumani',9),
('Yangiyer shahri',9),
('Yangiyer tumani',9)

insert into Region
values ('Oqqorgon tumani',10),
('Angren shahri',10),
('Angren tumani',10),
('Bekobod shahri',10),
('Bekobod tumani',10),
('Boka tumani',10),
('Bostonliq tumani',10),
('Qibray tumani',10),
('Olmaliq tumani',10),
('Olmaliq shahri',10),
('Oxangaron tumani',10),
('Parkent tumani',10),
('Piskent tumani',10),
('Toshkent tumani (Zangiota)',10),
('Ortachirchiq tumani',10),
('Chirchiq shahri',10),
('Chirchiq tumani',10),
('Chinoz tumani',10),
('Yuqorichirchiq tumani',10),
('Yangiyol tumani',10),
('Quyichirchiq tumani',10)

insert into Region
values ('Bektemir tumani',11),
('Mirzo Ulugbek tumani',11),
('Mirobod tumani',11),
('Olmazor tumani',11),
('Sergeli tumani',11),
('Uchtepa tumani',11),
('Chilonzor tumani',11),
('Shayxontoxur tumani',11),
('Yunusobod tumani',11),
('Yakkasaroy shahri',11),
('Yashnaobod tumani',11)

insert into Region
values ('Oltiariq tumani',12),
('Beshariq tumani',12),
('Bogdod tumani',12),
('Buvayda tumani',12),
('Dangara tumani',12),
('Yozyovon tumani',12),
('Quva tumani',12),
('Quvasoy shahri',12),
('Qoshtepa tumani',12),
('Margilon shahri',12),
('Rishton tumani',12),
('Sox tumani',12),
('Toshloq tumani',12),
('Ozbekiston tumani',12),
('Uchkoprik tumani',12),
('Fargona shahri',12),
('Fargona tumani',12),
('Furqat tumani',12),
('Qoqon shahri',12)

insert into Region
values ('Bogot tumani',13),
('Gurlan tumani',13),
('Qoshkoprik tumani',13),
('Urganch shahri',13),
('Urganch tumani',13),
('Xazarasp tumani',13),
('Xiva tumani',13),
('Xonqa tumani',13),
('Shovot tumani',13),
('Yangiariq tumani',13),
('Yangibozor tumani',13)

insert into Region
values ('Amudaryo tumani',14),
('Beruniy tumani',14),
('Qanlikol tumani',14),
('Kegeyli shahri',14),
('Chimboy tumani',14),
('Ellikqala tumani',14),
('Moynoq tumani',14),
('Nukus shahri',14),
('Nukus tumani',14),
('Qongirot tumani',14),
('Qoraozak tumani',14),
('Shumanay tumani',14),
('Taxtakopir tumani',14),
('Tortkol tumani',14),
('Xojayli tumani',14)

insert into Poll
values ('Male'),
('Female'),
('none')

insert into Discount
values ('chegirmasiz'),
('5% chegirma'),
('10% chegirma'),
('25% chegirma'),
('50% chegirma'),
('100% chegirma')

insert into CardType
values ('Oddiy kurs'),
('Turar joy')

insert into Marketplace
values ('Tanish orqali'),
('Internet orqali')


select * from Country
select * from City
select * from Region
select* from Poll
select * from Discount
select * from CardType
select * from Marketplace