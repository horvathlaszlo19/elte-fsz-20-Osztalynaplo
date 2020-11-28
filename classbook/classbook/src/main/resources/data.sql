insert into School(id,name,city,daycare) values (1,'Szent László gimnázium','Budapest',true);
insert into School_Class(id,name,school_Year,school_id) values (2,'a',9,1);
insert into School_Class(id,name,school_Year,school_id) values (3,'b',9,1);

insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (4,'Anna','anna','anna',12,false,0,2);
insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (5,'Béla','bela','bela',13,true,0,2); -- Bela fiu
insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (6,'Cecil','cecil','cecil',14,false,0,3);
insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (7,'Jenõ','jeno','jeno',12,true,0,3);

insert into Teacher(id,name,username,password,age,sex,subject) values (8,'Eszter','eszter','eszter',40,false,0);
insert into Teacher(id,name,username,password,age,sex,subject) values (9,'Gábor','gabor','gabor',32,true,2);

insert into TEACHER_TEACHER_SCHOOL_CLASSES(teachers_id,TEACHER_SCHOOL_CLASSES_ID) values (8,2);
insert into TEACHER_TEACHER_SCHOOL_CLASSES(teachers_id,TEACHER_SCHOOL_CLASSES_ID) values (9,2);
insert into TEACHER_TEACHER_SCHOOL_CLASSES(teachers_id,TEACHER_SCHOOL_CLASSES_ID) values (9,3);

insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (12,'2014-11-11',0,0,4);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (13,'2014-11-12',1,3,4);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (14,'2013-12-13',2,2,4);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (15,'2014-10-21',1,4,4);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (16,'2014-10-23',1,3,4);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (17,'2014-10-26',0,4,4);
