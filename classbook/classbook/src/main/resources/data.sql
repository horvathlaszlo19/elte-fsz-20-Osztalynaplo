insert into Student(id,name,username,password,age,sex,GPA) values (1,'Anna','anna','anna',12,false,0);
insert into Student(id,name,username,password,age,sex,GPA) values (2,'Béla','bela','bela',12,false,0);
insert into Student(id,name,username,password,age,sex,GPA) values (3,'Cecil','cecil','cecil',12,false,0);

insert into Teacher(id,name,username,password,age,sex,subject) values (4,'Eszter','eszter','eszter',40,false,0);

insert into School(id,name,city,daycare) values (5,'Szent László gimnázium','Budapest',true);

insert into School_Class(id,name,school_Year,school_id) values (6,'matek',2020,5); 

insert into TEACHER_TEACHER_SCHOOL_CLASSES(teachers_id,TEACHER_SCHOOL_CLASSES_ID) values (4,6);


