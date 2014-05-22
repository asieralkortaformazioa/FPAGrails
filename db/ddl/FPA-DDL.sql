
create table complexity (
ID Integer,
Description Varchar (50)
);

insert into complexity values (0,'Low');
insert into complexity values (1,'Average');
insert into complexity values (2,'High');


drop table complexityMatrix;

create table complexityMatrix (
	ID Integer,
	type varchar (30),
	horizontalLowLimit integer,
	horizontalTopLimit integer,
	verticalLowLimit integer,
	verticalTopLimit integer,
	complexity integer
); 


insert into complexityMatrix values (1,	'ILFEIF',1,1,1,19,0);
insert into complexityMatrix values (2,'ILFEIF',1,1,20,50,0);

insert into complexityMatrix values (3,'ILFEIF',1,1,null,51,0);
insert into complexityMatrix values (4,'ILFEIF',2,5,1,19,0);

insert into complexityMatrix values (5,'ILFEIF',2,5,20,50,1);

insert into complexityMatrix values (6,'ILFEIF',2,5,51,null,2);

insert into complexityMatrix values (7,'ILFEIF',6,null,1,19,1);

insert into complexityMatrix values (8,'ILFEIF',2,null,20,50,2);

insert into complexityMatrix values (9,'ILFEIF',6,null,51,null,2);
insert into complexityMatrix values (10,'EI',0,1,1,4,0);

insert into complexityMatrix values (11,'EI',0,1,5,15,0);
insert into complexityMatrix values (12,'EI',0,1,16,null,1);
insert into complexityMatrix values (13,'EI',2,2,1,4,0);
insert into complexityMatrix values (14,'EI',2,2,5,15,1);
insert into complexityMatrix values (15,'EI',2,2,16,null,2);
insert into complexityMatrix values (16,'EI',3,null,1,4,1);
insert into complexityMatrix values (17,'EI',3,null,5,15,2);
insert into complexityMatrix values (18,'EI',3,null,16,null,2);
insert into complexityMatrix values (19,'EOEQ',0,1,1,5,0);

insert into complexityMatrix values (20,'EOEQ',0,1,6,19,0);
insert into complexityMatrix values (21,'EOEQ',0,1,20,null,1);
insert into complexityMatrix values (22,'EOEQ',2,3,1,5,0);
insert into complexityMatrix values (23,'EOEQ',2,3,6,19,1);
insert into complexityMatrix values (24,'EOEQ',2,3,20,null,2);
insert into complexityMatrix values (25,'EOEQ',4,null,1,5,1);

insert into complexityMatrix values (26,'EOEQ',4,null,6,19,2);
insert into complexityMatrix values (27,'EOEQ',4,null,10,null,2);



drop table translation;

create table cplxTranslation (
  ID Integer,
  type varchar (30),
  complexity integer,
  UFP integer
);


insert into cplxTranslation values (0,'ILF',0,7);
insert into cplxTranslation values (1,'ILF',1,10);
insert into cplxTranslation values (2,'ILF',2,15);
insert into cplxTranslation values (3,'EIF',0,5);


insert into cplxTranslation values (4,'EIF',1,7);
insert into cplxTranslation values (5,'EIF',2,10);
insert into cplxTranslation values (6,'EIEQ',0,3);
insert into cplxTranslation values (7,'EIEQ',1,4);
insert into cplxTranslation values (8,'EIEQ',2,6);
insert into cplxTranslation values (9,'EO',0,4);
insert into cplxTranslation values (10,'EO',1,5);
insert into cplxTranslation values (11,'EO',2,7);
















